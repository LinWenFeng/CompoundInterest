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



public class CompoundInterest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	/**
	 * Launch the application.
	 */
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
		setBounds(100, 100, 474, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		final JLabel L1 = new JLabel("\u5B58\u6B3E(\u4E07):");//存款
		L1.setBounds(62, 121, 90, 15);
		L1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		
		textfield1 = new JTextField();
		textfield1.setBounds(166, 115, 173, 21);
		textfield1.setColumns(10);
		textfield1.addKeyListener(keyAdapter); 
		L3 = new JLabel("\u5229\u7387( %):");//利率
		L3.setBounds(62, 186, 81, 15);
		L3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		
		textfield2 = new JTextField();
		textfield2.setBounds(166, 149, 173, 21);
		textfield2.setColumns(10);
		textfield2.addKeyListener(keyAdapter);  
		
		final JLabel L2 = new JLabel("\u672C\u606F(\u4E07):");//年限
		L2.setBounds(62, 155, 104, 15);
		L2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		
		textfield3 = new JTextField();
		textfield3.setBounds(166, 180, 173, 21);
		textfield3.setColumns(10);
		textfield3.addKeyListener(keyAdapter);  
		
		btnNewButton = new JButton("\u5E74\u9650(\u5E74)");//本息
		btnNewButton.setBounds(39, 236, 127, 23);
		textfield4 = new JTextField();
		textfield4.setBounds(166, 237, 173, 21);
		textfield4.setEnabled(false);
		textfield4.setForeground(Color.RED);
		textfield4.setColumns(10);
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(53, 10, 113, 21);
		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String itemstate=comboBox.getSelectedItem().toString();
				changeTextFieldTitle(L1, L2, itemstate);
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
		
		simpleRB = new JRadioButton("\u5355\u5229");
		simpleRB.setBounds(53, 60, 59, 23);
		simpleRB.setSelected(true);
		
		compoundRB = new JRadioButton("\u590D\u5229");
		compoundRB.setBounds(114, 60, 71, 23);
		ButtonGroup group=new ButtonGroup();
		group.add(simpleRB);
		group.add(compoundRB);
		JLabel L = new JLabel("\u529F\u80FD");
		L.setBounds(10, 13, 54, 15);
		L.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		final Calculate calculate=new Calculate(contentPane);
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
		
		JLabel label = new JLabel("\u65B9\u5F0F");
		label.setBounds(10, 62, 54, 15);
		label.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
		
		JLabel lbllwf = new JLabel("\u7248\u672C\u6240\u6709\u6743:LWF");
		lbllwf.setBounds(331, 297, 127, 23);
		lbllwf.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		contentPane.setLayout(null);
		contentPane.add(L1);
		contentPane.add(textfield1);
		contentPane.add(L3);
		contentPane.add(textfield2);
		contentPane.add(L2);
		contentPane.add(textfield3);
		contentPane.add(textfield4);
		contentPane.add(comboBox);
		contentPane.add(simpleRB);
		contentPane.add(compoundRB);
		contentPane.add(L);
		contentPane.add(btnNewButton);
		contentPane.add(label);
		contentPane.add(lbllwf);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, L1, textfield1, L3, textfield2, L2, textfield3, textfield4, comboBox, simpleRB, compoundRB, L, btnNewButton, label, lbllwf}));
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
