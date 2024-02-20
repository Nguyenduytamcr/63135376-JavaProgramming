import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, eqButton, clearButton;
    private JPanel buttonPanel;
    private double num1, num2, result;
    private char operator;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField, BorderLayout.NORTH);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 2));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        clearButton = new JButton("C");

        functionButtons = new JButton[]{addButton, subButton, mulButton, divButton, eqButton, clearButton};

        for (JButton button : numberButtons) {
            buttonPanel.add(button);
        }

        for (JButton button : functionButtons) {
            buttonPanel.add(button);
            button.addActionListener(this);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton clickedButton = (JButton) source;
            String buttonText = clickedButton.getText();

            if (buttonText.matches("[0-9]")) {
                textField.setText(textField.getText() + buttonText);
            } else if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/")) {
                num1 = Double.parseDouble(textField.getText());
                operator = buttonText.charAt(0);
                textField.setText("");
            } else if (buttonText.equals("=")) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0)
                            result = num1 / num2;
                        else
                            result = 0; // Handle division by zero
                        break;
                }
                textField.setText(String.valueOf(result));
            } else if (buttonText.equals("C")) {
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator();
            }
        });
    }
}
