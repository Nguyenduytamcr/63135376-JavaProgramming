import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DemoFlowLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new DemoFlowLayout().setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public DemoFlowLayout() {
		setTitle("FlowLayout");
		setSize(300,	250);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
		setResizable(false);	
		setLayout(new FlowLayout());
		for (int i	=	1;	i	<=20;	i++)	{
		add(new JButton("Button	"+i));
		}
	}

}
