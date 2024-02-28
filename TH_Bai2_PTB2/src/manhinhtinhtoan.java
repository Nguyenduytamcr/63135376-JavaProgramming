import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class manhinhtinhtoan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;
	private JButton btnKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manhinhtinhtoan frame = new manhinhtinhtoan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public manhinhtinhtoan() {
		setTitle("Phương Trình Bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(38, 83, 107, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số b:");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNhpSB.setBounds(38, 136, 107, 42);
		contentPane.add(lblNhpSB);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nhập số c:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(38, 189, 107, 42);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Phương trình ax^2 + bx +c =0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(103, 11, 343, 42);
		contentPane.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA.setBounds(155, 83, 86, 35);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtB.setColumns(10);
		txtB.setBounds(155, 136, 86, 35);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtC.setColumns(10);
		txtC.setBounds(155, 189, 86, 35);
		contentPane.add(txtC);
		
		txtKQ = new JTextField();
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtKQ.setColumns(10);
		txtKQ.setBounds(38, 298, 458, 35);
		contentPane.add(txtKQ);
		
		btnKQ = new JButton("Kết Quả");
		btnKQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inKQ();
			}
		});
		btnKQ.setBounds(38, 242, 89, 42);
		contentPane.add(btnKQ);
		
		
	}

	protected void inKQ() {
		// TODO Auto-generated method stub
		String str_a = txtA.getText();
		String str_b = txtB.getText();
		String str_c = txtC.getText();
		double a = Double.parseDouble(str_a);
		double b = Double.parseDouble(str_b);
		double c = Double.parseDouble(str_c);
		String ketqua = null;
        
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                ketqua = "Phương trình vô nghiệm!";
            } else {
                ketqua = "Phương trình có một nghiệm: " + "x = " + (-c / b);
            }
        }
        // tính delta
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            ketqua = "Phương trình có 2 nghiệm là: " + "x1 = " + x1 
                    + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            ketqua = "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;
        } else {
            ketqua = "Phương trình vô nghiệm!";
        }
         
        txtKQ.setText(ketqua);
	}

}
