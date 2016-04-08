package Pane;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import calculate.Calculate;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;


public class CalculatePlane extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	int functionselect=1;
	private AbstractButton compoundRB;
	private JRadioButton simpleRB;
	private JButton button;
	private JLabel L1;
	private JLabel L2;
	private JLabel L3;
	private double tf1_value;
	private double tf2_value;
	private double tf3_value;
	private double result;
	
	KeyAdapter keyAdapter=new KeyAdapter(){  
        @Override
		public void keyTyped(KeyEvent e) {  
            int keyChar =e.getKeyChar();                 
            if((keyChar>=KeyEvent.VK_0 &&keyChar<=KeyEvent.VK_9)||keyChar==KeyEvent.VK_PERIOD){
            }
            else
                e.consume(); 
        }
	};
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CalculatePlane() {
		setBackground(new Color(224, 255, 255));
		setLayout(null);
		
		JLabel label = new JLabel("\u529F\u80FD\u9009\u62E9\uFF1A");
		label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		label.setBackground(new Color(0, 191, 255));
		label.setBounds(46, 79, 79, 15);
		add(label);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String itemstate=comboBox.getSelectedItem().toString();
				if(itemstate.equals("估算存期"))
				{
					functionselect=1;
					simpleRB.setEnabled(true);
					L1.setText("存款(元):");
					L2.setText("本息(元):");
					L3.setText("利率(%):");
					button.setText("年限(年):");
					emptyJTextField();
				}
				
				else if(itemstate.equals("估算存款"))
				{
					functionselect=2;
					simpleRB.setEnabled(true);
					L1.setText("本息(元):");
					L2.setText("年限(年):");
					L3.setText("利率(%):");
					button.setText("存款(元):");
					emptyJTextField();
				}
				else if(itemstate.equals("估算利率"))
				{
					functionselect=3;
					simpleRB.setEnabled(true);
					L1.setText("存款(元):");
					L2.setText("本息(元):");
					L3.setText("年限(年):");
					button.setText("利率(%):");
					emptyJTextField();
				}
				else if(itemstate.equals("估算本息"))
				{
					functionselect=4;
					simpleRB.setEnabled(true);
					L1.setText("存款(元):");
					L2.setText("年限(年):");
					L3.setText("利率(%):");
					button.setText("本息(元):");
					emptyJTextField();
				}
				else if(itemstate.equals("分期还款"))
				{
					functionselect=5;
					simpleRB.setEnabled(false);
					compoundRB.setSelected(isEnabled());
					L1.setText("贷款(元):");
					L2.setText("年限(年):");
					L3.setText("利率(%):");
					button.setText("等额月还款(元)");
					emptyJTextField();
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"估算存期", "估算存款", "估算利率", "估算本息", "分期还款"}));
		comboBox.setBounds(140, 76, 156, 21);
		add(comboBox);
		
		JLabel label_1 = new JLabel("\u8FD0\u7B97\u65B9\u5F0F\uFF1A");
		label_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		label_1.setBounds(46, 107, 79, 15);
		add(label_1);
		
		simpleRB = new JRadioButton("单利");
		simpleRB.setSelected(true);
		simpleRB.setBounds(140, 105, 79, 23);
		add(simpleRB);
		
		compoundRB = new JRadioButton("复利");
		compoundRB.setBounds(215, 105, 79, 23);
		add(compoundRB);
		ButtonGroup group=new ButtonGroup();
		group.add(compoundRB);
		group.add(simpleRB);
		L1 = new JLabel("存款(元)：");
		L1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 14));
		L1.setBounds(46, 145, 87, 15);
		add(L1);
		
		L2 = new JLabel("本息(元)：");
		L2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		L2.setBounds(46, 183, 87, 15);
		add(L2);
		
		L3 = new JLabel("利率(%)：");
		L3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		L3.setBounds(50, 223, 71, 15);
		add(L3);
		
		textField1 = new JTextField();
		textField1.setBounds(143, 142, 153, 21);
		add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(143, 180, 153, 21);
		add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(143, 220, 153, 21);
		add(textField3);
		textField3.setColumns(10);
		
		textField1.addKeyListener(keyAdapter);  
		textField2.addKeyListener(keyAdapter);  
		textField3.addKeyListener(keyAdapter); 
		
		button = new JButton("\u5E74\u9650(\u5E74)\uFF1A");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Calculate calculate=new Calculate(null);
				if(isTextFieldempty()) {
					JOptionPane.showMessageDialog(null, "请把数据输入完整！");
				}
				else {
					getTextFieldValue();
					if(simpleRB.isSelected()){
						result=calculate.simpleInterest(functionselect,tf1_value, tf2_value, tf3_value);
						textField4.setText(Double.toString(result));
					}
					else {
						
						result=calculate.compoundInterest(functionselect, tf1_value, tf2_value, tf3_value);
						textField4.setText(Double.toString(result));
					}
				}
			}
		});
		button.setBounds(12, 267, 121, 23);
		add(button);
		
		textField4 = new JTextField();
		textField4.setEnabled(false);
		textField4.setBounds(143, 268, 153, 21);
		add(textField4);
		textField4.setColumns(10);
		
		JLabel label_5 = new JLabel("\u8BA1\u7B97\u5668\u529F\u80FD\u533A");
		label_5.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 16));
		label_5.setBounds(144, 25, 101, 15);
		add(label_5);
	}
	public void getTextFieldValue() {
		tf1_value=Double.parseDouble(textField1.getText());
		tf2_value=Double.parseDouble(textField2.getText());
		tf3_value=Double.parseDouble(textField3.getText());
}
	public boolean isTextFieldempty() {
		if(textField1.getText().trim().equals("")||textField2.getText().trim().equals("")
				||textField3.getText().trim().equals("")) 
		return true;
		else 
		return false;
	}
	/*
	 * 清空输入框里的内容
	 * */
	
	public void  emptyJTextField() {
		textField1.setText(null);
		textField2.setText(null);
		textField3.setText(null);
		textField4.setText(null);
	}
}
