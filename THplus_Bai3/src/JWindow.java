import java.awt.EventQueue;

import javax.swing.JFrame;

public class JWindow {

	private JFrame frmDemoJwindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JWindow window = new JWindow();
					window.frmDemoJwindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDemoJwindow = new JFrame();
		frmDemoJwindow.setTitle("Demo  JWindow");
		frmDemoJwindow.setBounds(100, 100, 450, 300);
		frmDemoJwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
