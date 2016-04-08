package Pane;
import java.awt.Component;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LoginPane extends JPanel {

	
	private static final long serialVersionUID = 1L;
	private JTextField user_name_tf;
	private JPasswordField password_tf;
	private Component login_button;
	private Component sign_up_button;
	public String username;
	public String password;
	public LoginPane() {
		setBackground(new Color(135, 206, 250));
		setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D\uFF1A");
		label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		label.setBounds(78, 105, 58, 15);
		add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801\uFF1A");
		label_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		label_1.setBounds(78, 138, 58, 15);
		add(label_1);
		
		login_button = new JButton("\u767B\u5F55");
		login_button.setFont(new Font("宋体", Font.PLAIN, 13));
		login_button.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			public void mouseClicked(MouseEvent e) {
				username=user_name_tf.getText();
				password=password_tf.getText();
				if(password.equals("123456")&&username.equals("LWF"))
				{
					JOptionPane.showMessageDialog(null, "登录成功");
				}
				
			}
		});
		login_button.setBounds(126, 197, 93, 23);
		add(login_button);
		
		sign_up_button = new JButton("\u6CE8\u518C");
		sign_up_button.setFont(new Font("宋体", Font.PLAIN, 13));
		sign_up_button.setBounds(229, 197, 93, 23);
		add(sign_up_button);
		
		user_name_tf = new JTextField();
		user_name_tf.setBounds(164, 103, 135, 21);
		add(user_name_tf);
		user_name_tf.setColumns(10);
		
		password_tf = new JPasswordField();
		password_tf.setBounds(164, 136, 135, 21);
		add(password_tf);
		
		JLabel label_2 = new JLabel("\u6B22\u8FCE\u4F7F\u7528");
		label_2.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 18));
		label_2.setBounds(178, 30, 84, 23);
		add(label_2);

	}
}
