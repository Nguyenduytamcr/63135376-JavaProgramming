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

public class ManHinhTinhToan extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;

	public ManHinhTinhToan() {
		setTitle("Chương Trình Tính Toán Đơn Giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số a: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(45, 35, 138, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("Nhập số b:");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNhpSB.setBounds(45, 71, 127, 31);
		contentPane.add(lblNhpSB);
		
		JLabel lblChnPhpTnh = new JLabel("Chọn phép tính");
		lblChnPhpTnh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblChnPhpTnh.setBounds(45, 108, 216, 31);
		contentPane.add(lblChnPhpTnh);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblKtQu.setBounds(45, 224, 111, 31);
		contentPane.add(lblKtQu);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA.setBounds(175, 35, 159, 31);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtB.setColumns(10);
		txtB.setBounds(175, 77, 159, 31);
		contentPane.add(txtB);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtKQ.setColumns(10);
		txtKQ.setBounds(175, 226, 159, 31);
		contentPane.add(txtKQ);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xử lí cộng 
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCong.setBounds(45, 155, 89, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTru.setBounds(154, 155, 89, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("x");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNhan.setBounds(268, 155, 89, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton(":");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChia.setBounds(382, 155, 89, 23);
		contentPane.add(btnChia);
	}

		protected void HamXuLyChia() {
		// TODO Auto-generated method stub
			String str_soA = txtA.getText();
			String str_soB = txtB.getText();
			double soA = Double.parseDouble(str_soA);
			double soB = Double.parseDouble(str_soB);
			double thuong = soA/soB;
			txtKQ.setText(String.valueOf(thuong));
	}

		protected void HamXuLyNhan() {
		// TODO Auto-generated method stub
			String str_soA = txtA.getText();
			String str_soB = txtB.getText();
			double soA = Double.parseDouble(str_soA);
			double soB = Double.parseDouble(str_soB);
			double tich = soA*soB;
			txtKQ.setText(String.valueOf(tich));
	}

		protected void HamXuLyTru() {
		// TODO Auto-generated method stub
			String str_soA = txtA.getText();
			String str_soB = txtB.getText();
			double soA = Double.parseDouble(str_soA);
			double soB = Double.parseDouble(str_soB);
			double hieu = soA-soB;
			txtKQ.setText(String.valueOf(hieu));
	}

		protected void HamXuLyCong() {
		// TODO Auto-generated method stub
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tong = soA+soB;
		txtKQ.setText(String.valueOf(tong));
		
	}
}
