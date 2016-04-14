package Pane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;


public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CalculatePlane calculatePlane;
	private InvestPane investPane;
	private UserPane userPane;
	private LoginPane loginPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 418);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("��������");
		/*ѡ��˵����� ��������л�*/
		menu.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				investPane.setVisible(false);
				userPane.setVisible(false);
				loginPane.setVisible(false);
				calculatePlane.setVisible(true);
			}
		});
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("Ͷ�����");
		menu_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				calculatePlane.setVisible(false);
				userPane.setVisible(false);
				loginPane.setVisible(false);
				investPane.setVisible(true);
			}
		});
		menuBar.add(menu_1);
		
		JMenu menu_2 = new JMenu("�û���Ϣ");
		menu_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				calculatePlane.setVisible(false);
				investPane.setVisible(false);
				loginPane.setVisible(false);
				userPane.setVisible(true);
			}
		});
		menuBar.add(menu_2);
		
		JMenu menu_3 = new JMenu("�û���¼");
		menu_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				calculatePlane.setVisible(false);
				investPane.setVisible(false);
				userPane.setVisible(false);
				loginPane.setVisible(true);
			}
		});
		menuBar.add(menu_3);
		
		JMenu menu_4 = new JMenu("��¼��");
		menuBar.add(menu_4);
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		/*��Ӽ��������*/
		calculatePlane = new CalculatePlane();
		calculatePlane.setVisible(false);
		calculatePlane.setBounds(0, 0, 450, 418);
		contentPane.add(calculatePlane,BorderLayout.CENTER);
		/*���Ͷ�����*/
		investPane=new InvestPane();
		investPane.setBounds(0, 0, 450, 418);
		investPane.setVisible(false);
		contentPane.add(investPane);
		/*����û����*/
		userPane=new UserPane();
		userPane.setBounds(0, 0, 450, 418);
		userPane.setVisible(false);
		contentPane.add(userPane);
		/*����û���¼���*/
		loginPane=new LoginPane();
		loginPane.setBounds(0, 0, 450, 418);
		loginPane.setVisible(true);
		contentPane.add(loginPane);
	}
}
