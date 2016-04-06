package JSQ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JRadioButton;

import java.awt.Toolkit;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

import javax.swing.JPasswordField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class CompoundInterest extends JFrame {

	
	private static final long serialVersionUID = 1L;
	protected static JPanel Calculate_Panel = null;
	private static JPanel Login_Panel;
	private JPanel contentPane;
	private JTextField textfield1;
	private JTextField textfield2;
	private JTextField textfield3;
	private JTextField textfield4;
	private JLabel L3;
	final JButton btnNewButton;
	double tf1_value,tf2_value,tf3_value;
	int functionselect=1;
	private JRadioButton simpleRB;
	private JRadioButton compoundRB;
	double result;
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
	private JLabel label_1;
	private JLabel label_2;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel label_3;
	private JButton button_1;
	private JLabel lblNewLabel;
	private JPanel User_Panel;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel label_8;
	private JPanel InvestPanel;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel label_12;
	private JMenu menu_2;
	private JMenu menu_3;
	private JMenuItem menuItem;
	private JMenuItem menuItem_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CompoundInterest frame = new CompoundInterest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CompoundInterest() {
		setForeground(Color.CYAN);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Black\u72FC\\Pictures\\Saved Pictures\\273330960130575078.jpg"));
		setTitle("\u590D\u5229\u8BA1\u7B97\u56684.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 423);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u8BA1\u7B97\u533A");
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Calculate_Panel.setVisible(true);
				Login_Panel.setVisible(false);
			}
		});
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("\u7528\u6237\u4FE1\u606F");
		menu_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Calculate_Panel.setVisible(false);
				Login_Panel.setVisible(false);
				User_Panel.setVisible(true);
			}
		});
		menuBar.add(menu_1);
		
		menu_2 = new JMenu("\u6295\u8D44\u7406\u8D22");
		menu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Calculate_Panel.setVisible(false);
				Login_Panel.setVisible(false);
				User_Panel.setVisible(false);
				InvestPanel.setVisible(true);
			}
		});
		menuBar.add(menu_2);
		
		menu_3 = new JMenu("\u7528\u6237\u767B\u5F55");
		menu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Calculate_Panel.setVisible(false);
				User_Panel.setVisible(false);
				InvestPanel.setVisible(false);
				Login_Panel.setVisible(true);
			}
		});
		menuBar.add(menu_3);
		
		menuItem = new JMenuItem("\u5207\u6362\u7528\u6237");
		menu_3.add(menuItem);
		
		menuItem_1 = new JMenuItem("\u9000\u51FA\u767B\u5F55");
		menu_3.add(menuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		ButtonGroup group=new ButtonGroup();
		final Calculate calculate=new Calculate(contentPane);
		contentPane.setLayout(null);
		
		Login_Panel = new JPanel();
		Login_Panel.setBackground(new Color(240, 248, 255));
		Login_Panel.setBounds(0, 0, 359, 363);
		contentPane.add(Login_Panel);
		Login_Panel.setLayout(null);
		
		Calculate_Panel = new JPanel();
		Calculate_Panel.setBackground(new Color(224, 255, 255));
		Calculate_Panel.setBounds(0, 0, 359, 363);
		contentPane.add(Calculate_Panel);
		Calculate_Panel.setLayout(null);
		Calculate_Panel.setVisible(false);
		
		User_Panel = new JPanel();
		User_Panel.setBackground(new Color(250, 240, 230));
		User_Panel.setBounds(0, 0, 359, 363);
		contentPane.add(User_Panel);
		User_Panel.setLayout(null);
		User_Panel.setVisible(false);
		
		label_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_1.setBounds(10, 137, 71, 15);
		Login_Panel.add(label_1);
		
		label_2 = new JLabel("\u7528\u6237\u5BC6\u7801\uFF1A");
		label_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_2.setBounds(10, 162, 93, 23);
		Login_Panel.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(113, 136, 90, 21);
		Login_Panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(113, 163, 90, 21);
		Login_Panel.add(passwordField);
		
		JButton button = new JButton("\u767B\u5F55");
		button.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		button.setBounds(12, 221, 93, 23);
		Login_Panel.add(button);
		
		button_1 = new JButton("\u6CE8\u518C");
		button_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		button_1.setBounds(113, 221, 93, 23);
		Login_Panel.add(button_1);
		
		lblNewLabel = new JLabel("\u8BF7\u767B\u5F55\u60A8\u7684\u8D26\u6237");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblNewLabel.setBounds(62, 35, 182, 32);
		Login_Panel.add(lblNewLabel);
		
		final JLabel L1_1 = new JLabel("\u5B58\u6B3E(\u4E07):");
		L1_1.setBounds(51, 160, 90, 15);
		Calculate_Panel.add(L1_1);
		L1_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		
		textfield1 = new JTextField();
		textfield1.setBounds(153, 149, 173, 21);
		Calculate_Panel.add(textfield1);
		textfield1.setColumns(10);
		
		final JLabel L2_1 = new JLabel("\u672C\u606F(\u4E07):");
		L2_1.setBounds(51, 190, 104, 15);
		Calculate_Panel.add(L2_1);
		L2_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		L3 = new JLabel("\u5229\u7387( %):");
		L3.setBounds(51, 224, 81, 15);
		Calculate_Panel.add(L3);
		L3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		
		textfield2 = new JTextField();
		textfield2.setBounds(154, 185, 173, 21);
		Calculate_Panel.add(textfield2);
		textfield2.setColumns(10);
		
		textfield3 = new JTextField();
		textfield3.setBounds(155, 221, 173, 21);
		Calculate_Panel.add(textfield3);
		textfield3.setColumns(10);
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(48, 65, 113, 21);
		Calculate_Panel.add(comboBox);
		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String itemstate=comboBox.getSelectedItem().toString();
				changeTextFieldTitle(L1_1, L2_1, itemstate);
			}

			public void changeTextFieldTitle(final JLabel L1, final JLabel L2,
					String itemstate) {
				if(itemstate.equals("\u4F30\u7B97\u5B58\u671F"))
				{
					functionselect=1;
					simpleRB.setEnabled(true);
					L1.setText("\u5B58\u6B3E(\u4E07):");
					L2.setText("\u672C\u606F(\u4E07):");
					L3.setText("\u5229\u7387(%):");
					btnNewButton.setText("\u5E74\u9650(\u5E74)");
					emptyJTextField();
				}
				else if(itemstate.equals("\u4F30\u7B97\u5B58\u989D")) {
					functionselect=2;
					simpleRB.setEnabled(true);
					L1.setText("\u672C\u606F(\u4E07)");
					L2.setText("\u5E74\u9650(\u5E74):");
					L3.setText("\u5229\u7387(%):");
					btnNewButton.setText("\u5B58\u6B3E(\u4E07)");
					emptyJTextField();
				}
				else if(itemstate.equals("\u4F30\u7B97\u5229\u7387")) {
					functionselect=3;
					simpleRB.setEnabled(true);
					L1.setText("\u5B58\u6B3E(\u4E07):");
					L2.setText("\u672C\u606F(\u4E07):");
					L3.setText("\u5E74\u9650(\u5E74):");
					btnNewButton.setText("\u5229\u7387(%)");
					emptyJTextField();
				}
				else if(itemstate.equals("\u4F30\u7B97\u672C\u606F")){
					functionselect=4;
					simpleRB.setEnabled(true);
					L1.setText("\u5B58\u6B3E(\u4E07):");
					L2.setText("\u5E74\u9650(\u5E74):");
					L3.setText("\u5229\u7387(%):");
					btnNewButton.setText("\u672C\u606F(\u4E07)");
					emptyJTextField();
				}
				else {
					functionselect=5;
					simpleRB.setEnabled(false);
					compoundRB.setSelected(isActive());
					L1.setText("\u8D37\u6B3E(\u4E07)");
					L2.setText("\u5E74\u9650(\u5E74):");
					L3.setText("\u5229\u7387(%):");
					btnNewButton.setText("\u7B49\u989D\u6708\u8FD8\u6B3E(\u4E07)");
					emptyJTextField();
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u4F30\u7B97\u5B58\u671F", "\u4F30\u7B97\u5B58\u989D", 
											"\u4F30\u7B97\u5229\u7387","\u4F30\u7B97\u672C\u606F", "\u5206\u671F\u8FD8\u6B3E"}));
		JLabel L = new JLabel("\u529F\u80FD");
		L.setBounds(10, 65, 54, 15);
		Calculate_Panel.add(L);
		L.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		
		JLabel label = new JLabel("\u65B9\u5F0F");
		label.setBounds(10, 111, 54, 15);
		Calculate_Panel.add(label);
		label.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		
		simpleRB = new JRadioButton("\u5355\u5229");
		simpleRB.setBounds(51, 107, 59, 23);
		Calculate_Panel.add(simpleRB);
		simpleRB.setSelected(true);
		group.add(simpleRB);
		
		compoundRB = new JRadioButton("\u590D\u5229");
		compoundRB.setBounds(112, 107, 71, 23);
		Calculate_Panel.add(compoundRB);
		group.add(compoundRB);
		
		btnNewButton = new JButton("\u5E74\u9650(\u5E74)");
		btnNewButton.setBounds(24, 271, 127, 23);
		Calculate_Panel.add(btnNewButton);
		textfield4 = new JTextField();
		textfield4.setBounds(158, 271, 173, 21);
		Calculate_Panel.add(textfield4);
		textfield4.setEnabled(false);
		textfield4.setForeground(Color.RED);
		textfield4.setColumns(10);
		
		label_3 = new JLabel("\u8BA1\u7B97\u5668\u529F\u80FD\u533A");
		label_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
		label_3.setBounds(128, 10, 113, 34);
		Calculate_Panel.add(label_3);
		
		
		label_4 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_4.setBounds(10, 59, 73, 15);
		User_Panel.add(label_4);
		
		label_5 = new JLabel("\u4F59\u989D\uFF1A");
		label_5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_5.setBounds(30, 105, 88, 21);
		User_Panel.add(label_5);
		
		label_6 = new JLabel("\u603B\u6295\u8D44\uFF1A");
		label_6.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_6.setBounds(10, 164, 73, 15);
		User_Panel.add(label_6);
		
		label_7 = new JLabel("\u7D2F\u79EF\u6536\u76CA\uFF1A");
		label_7.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_7.setBounds(10, 221, 88, 15);
		User_Panel.add(label_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 58, 66, 21);
		User_Panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 107, 66, 21);
		User_Panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(96, 163, 66, 21);
		User_Panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(96, 220, 66, 21);
		User_Panel.add(textField_4);
		textField_4.setColumns(10);
		
		label_8 = new JLabel("\u7528\u6237\u5177\u4F53\u4FE1\u606F");
		label_8.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_8.setBounds(96, 10, 112, 15);
		User_Panel.add(label_8);
		
		InvestPanel = new JPanel();
		InvestPanel.setBackground(new Color(255, 250, 205));
		InvestPanel.setBounds(0, 0, 359, 363);
		contentPane.add(InvestPanel);
		InvestPanel.setLayout(null);
		InvestPanel.setVisible(false);
		
		label_9 = new JLabel("\u6211\u7231\u6295\u8D44\u7406\u8D22");
		label_9.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		label_9.setBounds(124, 25, 144, 25);
		InvestPanel.add(label_9);
		
		label_10 = new JLabel("\u6295\u8D44\u91D1\u989D\uFF1A");
		label_10.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_10.setBounds(10, 99, 88, 15);
		InvestPanel.add(label_10);
		
		label_11 = new JLabel("\u6295\u8D44\u5E74\u9650\uFF1A");
		label_11.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_11.setBounds(10, 167, 81, 15);
		InvestPanel.add(label_11);
		
		textField_5 = new JTextField();
		textField_5.setBounds(106, 94, 91, 21);
		InvestPanel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(108, 162, 89, 21);
		InvestPanel.add(textField_6);
		textField_6.setColumns(10);
		
		label_12 = new JLabel("\u63A8\u8350\u6295\u8D44\u65B9\u5F0F\uFF1A");
		label_12.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_12.setBounds(16, 235, 124, 15);
		InvestPanel.add(label_12);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, L1_1, textfield1, L3, textfield2, L2_1, textfield3, textfield4, comboBox, simpleRB, compoundRB, L, btnNewButton, label}));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(isTextFieldempty()) {
					JOptionPane.showMessageDialog(contentPane, "\u8BF7\u628A\u6570\u636E\u8F93\u5165\u5B8C\u6574");
				}
				else {
					getTextFieldValue();
					if(simpleRB.isSelected()){
						result=calculate.simpleInterest(functionselect,tf1_value, tf2_value, tf3_value);
						textfield4.setText(Double.toString(result));
					}
					else {
						
						result=calculate.compoundInterest(functionselect, tf1_value, tf2_value, tf3_value);
						textfield4.setText(Double.toString(result));
					}
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		textfield3.addKeyListener(keyAdapter);  
		textfield2.addKeyListener(keyAdapter);  
		textfield1.addKeyListener(keyAdapter); 
	}
	public void getTextFieldValue() {
			tf1_value=Double.parseDouble(textfield1.getText());
			tf2_value=Double.parseDouble(textfield2.getText());
			tf3_value=Double.parseDouble(textfield3.getText());
	};
	public boolean isTextFieldempty() {
		if(textfield1.getText().trim().equals("")||textfield2.getText().trim().equals("")
				||textfield3.getText().trim().equals("")) 
		return true;
		else 
		return false;
	}
	public void  emptyJTextField() {
		textfield1.setText(null);
		textfield2.setText(null);
		textfield3.setText(null);
		textfield4.setText(null);
	}
}
