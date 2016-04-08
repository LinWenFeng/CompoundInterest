package Pane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;


public class InvestPane extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Component button;
	public InvestPane() {
		setBackground(new Color(64, 224, 208));
		setLayout(null);
		
		JLabel label = new JLabel("我爱投资理财");
		label.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 18));
		label.setBounds(166, 20, 108, 21);
		add(label);
		
		JLabel label_1 = new JLabel("投资金额：");
		label_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		label_1.setBounds(63, 90, 77, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("投资年限：");
		label_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		label_2.setBounds(63, 143, 77, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("利率( %)：");
		label_3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		label_3.setBounds(63, 189, 77, 15);
		add(label_3);
		
		textField = new JTextField();
		textField.setBounds(150, 88, 90, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 141, 90, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150, 187, 90, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		button = new JButton("\u7ED3\u679C\uFF1A");
		button.setFont(new Font("宋体", Font.PLAIN, 13));
		button.setBounds(63, 243, 77, 23);
		add(button);

	}

}
