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
	String userName,passWord;
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
	private JPanel User_Panel;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JTextField User_name_tf;
	private JTextField User_remainde_tf;
	private JTextField User_sum_investment_tf;
	private JTextField User_income_tf;
	private JLabel label_8;
	private JPanel Invest_Panel;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JTextField Invest_money_tf;
	private JTextField Invest_year_tf;
	private JLabel label_12;
	private JMenu menu_2;
	private JMenu menu_3;
	private JMenuItem menuItem;
	private JMenuItem menuItem_1;
	private JLabel lblNewLabel;
	private JLabel label_14;
	private JTextField Invest_rate_tf;
	private JTextField Invest_simple_tf;
	private JTextField Invest_compound_tf;

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CompoundInterest() {
		setForeground(Color.CYAN);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Black\u72FC\\Pictures\\Saved Pictures\\273330960130575078.jpg"));
		setTitle("\u590D\u5229\u8BA1\u7B97\u56685.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 423);
		
		MenusDesign();
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		ButtonGroup group=new ButtonGroup();
		final Calculate calculate=new Calculate(contentPane);
		contentPane.setLayout(null);
		
		FunctionselectPaneDesign();
		
		Login_Panel_Design();
		
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
		
		User_Panel_Design();
		
		Invest_Panel_Design();
		
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

	public void Invest_Panel_Design() {
		label_9 = new JLabel("\u6211\u7231\u6295\u8D44\u7406\u8D22");
		label_9.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		label_9.setBounds(124, 25, 144, 25);
		Invest_Panel.add(label_9);
		
		label_10 = new JLabel("\u6295\u8D44\u91D1\u989D\uFF1A");
		label_10.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_10.setBounds(28, 99, 88, 15);
		Invest_Panel.add(label_10);
		
		label_11 = new JLabel("\u6295\u8D44\u5E74\u9650\uFF1A");
		label_11.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_11.setBounds(30, 162, 81, 15);
		Invest_Panel.add(label_11);
		
		Invest_money_tf = new JTextField();
		Invest_money_tf.setBounds(149, 98, 106, 21);
		Invest_Panel.add(Invest_money_tf);
		Invest_money_tf.setColumns(10);
		
		Invest_year_tf = new JTextField();
		Invest_year_tf.setBounds(149, 161, 106, 21);
		Invest_Panel.add(Invest_year_tf);
		Invest_year_tf.setColumns(10);
		
		Invest_rate_tf = new JTextField();
		Invest_rate_tf.setBounds(149, 207, 106, 21);
		Invest_Panel.add(Invest_rate_tf);
		Invest_rate_tf.setColumns(10);
		
		Invest_money_tf.addKeyListener(keyAdapter);
		Invest_year_tf.addKeyListener(keyAdapter); 
		Invest_rate_tf.addKeyListener(keyAdapter);
		
		
		label_12 = new JLabel("\u5230\u671F\u672C\u606F\uFF1A");
		label_12.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_12.setBounds(19, 301, 97, 15);
		Invest_Panel.add(label_12);
		
		JButton button = new JButton("\u8BA1\u7B97\u7ED3\u679C");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Invest_money_tf.getText().trim().equals("")||Invest_rate_tf.getText().trim().equals("")
						||Invest_year_tf.getText().trim().equals("")) 
				{
					JOptionPane.showMessageDialog(contentPane, "\u8BF7\u628A\u6570\u636E\u8F93\u5165\u5B8C\u6574");
				}
				else {
					Double simpleResult,compoundResult;
					Calculate calculate= new Calculate(contentPane);
					tf1_value=Double.parseDouble(Invest_money_tf.getText());
					tf2_value=Double.parseDouble(Invest_year_tf.getText());
					tf3_value=Double.parseDouble(Invest_rate_tf.getText());
					simpleResult=calculate.simpleInterest(4,tf1_value, tf2_value, tf3_value);
					Invest_simple_tf.setText(Double.toString(simpleResult));
					compoundResult=calculate.compoundInterest(4, tf1_value, tf2_value, tf3_value);
					Invest_compound_tf.setText(Double.toString(compoundResult));
				}
			}
		});
		button.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		button.setBounds(5, 234, 106, 23);
		Invest_Panel.add(button);
		
		JLabel label = new JLabel("\u5355\u5229\uFF1A");
		label.setFont(new Font("ËÎÌå", Font.PLAIN, 14));
		label.setBounds(107, 276, 54, 15);
		Invest_Panel.add(label);
		
		JLabel label_13 = new JLabel("\u590D\u5229\uFF1A");
		label_13.setFont(new Font("ËÎÌå", Font.PLAIN, 14));
		label_13.setBounds(106, 326, 54, 15);
		Invest_Panel.add(label_13);
		
		label_14 = new JLabel("\u5229\u7387(%)\uFF1A");
		label_14.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_14.setBounds(34, 209, 77, 15);
		Invest_Panel.add(label_14);
		
		Invest_simple_tf = new JTextField();
		Invest_simple_tf.setBounds(149, 273, 106, 21);
		Invest_Panel.add(Invest_simple_tf);
		Invest_simple_tf.setColumns(10);
		
		Invest_compound_tf = new JTextField();
		Invest_compound_tf.setBounds(149, 323, 106, 21);
		Invest_Panel.add(Invest_compound_tf);
		Invest_compound_tf.setColumns(10);
	}

	public void User_Panel_Design() {
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
		
		User_name_tf = new JTextField();
		User_name_tf.setBounds(96, 58, 66, 21);
		User_Panel.add(User_name_tf);
		User_name_tf.setColumns(10);
		
		User_remainde_tf = new JTextField();
		User_remainde_tf.setBounds(96, 107, 66, 21);
		User_Panel.add(User_remainde_tf);
		User_remainde_tf.setColumns(10);
		
		User_sum_investment_tf = new JTextField();
		User_sum_investment_tf.setBounds(96, 163, 66, 21);
		User_Panel.add(User_sum_investment_tf);
		User_sum_investment_tf.setColumns(10);
		
		User_income_tf = new JTextField();
		User_income_tf.setBounds(96, 220, 66, 21);
		User_Panel.add(User_income_tf);
		User_income_tf.setColumns(10);
		
		label_8 = new JLabel("\u7528\u6237\u5177\u4F53\u4FE1\u606F");
		label_8.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		label_8.setBounds(96, 10, 112, 15);
		User_Panel.add(label_8);
	}

	public void Login_Panel_Design() {
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
		button.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				userName=textField.getText();
				passWord=passwordField.getText();
				if(userName.equals("LWF")&&passWord.equals("123456")){
					lblNewLabel.setText("µÇÂ¼³É¹¦");
					Login_Panel.setVisible(false);
					User_Panel.setVisible(true);
					User_name_tf.setText(userName);
				}
				else {
					lblNewLabel.setText("µÇÂ¼Ê§°Ü");
				}
			}
		});
		button.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		button.setBounds(12, 221, 93, 23);
		Login_Panel.add(button);
		
		button_1 = new JButton("\u6CE8\u518C");
		button_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		button_1.setBounds(113, 221, 93, 23);
		Login_Panel.add(button_1);
		
		lblNewLabel = new JLabel("\u8BF7\u767B\u5F55\u60A8\u7684\u8D26\u6237");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
		lblNewLabel.setBounds(100, 33, 182, 32);
		Login_Panel.add(lblNewLabel);
	}

	public void FunctionselectPaneDesign() {
		Login_Panel = new JPanel();
		Login_Panel.setBackground(new Color(72, 209, 204));
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
		
		Invest_Panel = new JPanel();
		Invest_Panel.setBackground(new Color(255, 250, 205));
		Invest_Panel.setBounds(0, 0, 359, 363);
		contentPane.add(Invest_Panel);
		Invest_Panel.setLayout(null);
		Invest_Panel.setVisible(false);
	}

	public void MenusDesign() {
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
				Invest_Panel.setVisible(true);
			}
		});
		menuBar.add(menu_2);
		
		menu_3 = new JMenu("\u7528\u6237\u767B\u5F55");
		menu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Calculate_Panel.setVisible(false);
				User_Panel.setVisible(false);
				Invest_Panel.setVisible(false);
				Login_Panel.setVisible(true);
			}
		});
		menuBar.add(menu_3);
		
		menuItem = new JMenuItem("\u5207\u6362\u7528\u6237");
		menu_3.add(menuItem);
		
		menuItem_1 = new JMenuItem("\u9000\u51FA\u767B\u5F55");
		menu_3.add(menuItem_1);
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
