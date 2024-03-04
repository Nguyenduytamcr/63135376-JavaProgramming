import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JPasswordField txtMatKhau;

	public LoginJFrame() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP:");
		lblNewLabel.setBounds(27, 28, 90, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU: ");
		lblMtKhu.setBounds(27, 75, 90, 36);
		contentPane.add(lblMtKhu);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setBounds(143, 36, 160, 20);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setBounds(143, 127, 121, 23);
		contentPane.add(btnDangNhap);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(143, 83, 160, 20);
		contentPane.add(txtMatKhau);
	}
	void XuLyDangNhap() {
		//lấy về tên đăng nhập và mật khẩu
		String strTen = txtTenDangNhap.getText();
		String strMK = txtMatKhau.getText();
		if (strTen.equals("63CNTT") && strMK.equals("123")) {
			//hiện trang chủ
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			//ẩn form đăng nhập
			this.setVisible(false);
		}else {
			// báo lỗi
			 txtTenDangNhap.setText("");
			 txtMatKhau.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại!");
		}
	}
}
