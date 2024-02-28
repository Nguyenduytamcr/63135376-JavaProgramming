import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DemoJDialogs extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	public static void main(String[] args) {
		new DemoJDialogs().setVisible(true);

	}

	
	public DemoJDialogs() {
		setTitle("Demo	JDialog");	//Tiêu đề của hộp thoại JDialog
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//Đóng hộp thoại
		setSize(300,	200);
		setResizable(false);
		//Các thuộc tính khác
	}

}
