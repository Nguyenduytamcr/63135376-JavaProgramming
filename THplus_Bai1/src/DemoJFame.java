import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DemoJFame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		new DemoJFame().setVisible(true);
	}

	public DemoJFame() {
		setTitle("Demo JFame");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);	//Canh giữa màn hình
		setContentPane(contentPane);
		setResizable(false);	//không cho phép thay đổi kích thước JFrame
		//các thuộc tính khác JFrame
	}

}
