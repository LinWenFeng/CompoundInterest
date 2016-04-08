package Pane;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;


public class UserPane extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public UserPane() {
		setBackground(new Color(127, 255, 212));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u5177\u4F53\u4FE1\u606F");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		lblNewLabel.setBounds(178, 10, 117, 21);
		add(lblNewLabel);
		
		JLabel label = new JLabel("\u7528\u6237\u540D\uFF1A");
		label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		label.setBounds(93, 64, 72, 15);
		add(label);
		
		JLabel lblNewLabel_1 = new JLabel("\u4F59\u989D\uFF1A");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(93, 106, 72, 15);
		add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("\u603B\u6295\u8D44\uFF1A");
		label_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		label_1.setBounds(93, 163, 72, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u7D2F\u79EF\u6536\u76CA\uFF1A");
		label_2.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 14));
		label_2.setBounds(93, 212, 72, 15);
		add(label_2);
		
		textField = new JTextField();
		textField.setBounds(189, 62, 106, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 104, 106, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(189, 161, 106, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(189, 210, 106, 21);
		add(textField_3);
		textField_3.setColumns(10);

	}
}
