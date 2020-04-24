package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import model.Element;
import javax.swing.ToolTipManager;
import java.awt.SystemColor;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TheElements extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;

	public TheElements() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1768, 974);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Electronic Distribution");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Mnemonics");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display("resources/Elements/Electronic Distribution.png");
			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenu mnNewMenu_1 = new JMenu("Common Molecules");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmView = new JMenuItem("View");
		mntmView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display("resources/Elements/Common Molecule.jpg");
			}
		});
		mnNewMenu_1.add(mntmView);

		JMenu mnNewMenu_2 = new JMenu("Groups");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_6 = new JMenu("Alkali Metals");
		mnNewMenu_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		
		mnNewMenu_2.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Lithium");
		mntmNewMenuItem_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_6.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_7 = new JMenu("Alkali Earth Metals");
		mnNewMenu_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_2.add(mnNewMenu_7);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_7.add(mntmNewMenuItem_1_1);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("New menu item");
		mnNewMenu_7.add(mntmNewMenuItem_2_1);
		
		JMenuItem mntmNewMenuItem_3_1 = new JMenuItem("New menu item");
		mnNewMenu_7.add(mntmNewMenuItem_3_1);
		
		JMenuItem mntmNewMenuItem_4_1 = new JMenuItem("New menu item");
		mnNewMenu_7.add(mntmNewMenuItem_4_1);
		
		JMenuItem mntmNewMenuItem_5_1 = new JMenuItem("New menu item");
		mnNewMenu_7.add(mntmNewMenuItem_5_1);
		
		JMenuItem mntmNewMenuItem_6_1 = new JMenuItem("New menu item");
		mnNewMenu_7.add(mntmNewMenuItem_6_1);
		
		JMenu mnNewMenu_8 = new JMenu("Transition Metals");
		mnNewMenu_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_2.add(mnNewMenu_8);
		
		JMenuItem mntmNewMenuItem_1_5 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_1_5);
		
		JMenuItem mntmNewMenuItem_2_5 = new JMenuItem("New menu item");
		mntmNewMenuItem_2_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_2_5);
		
		JMenuItem mntmNewMenuItem_3_5 = new JMenuItem("New menu item");
		mntmNewMenuItem_3_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_3_5);
		
		JMenuItem mntmNewMenuItem_4_5 = new JMenuItem("New menu item");
		mntmNewMenuItem_4_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_4_5);
		
		JMenuItem mntmNewMenuItem_5_5 = new JMenuItem("New menu item");
		mntmNewMenuItem_5_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_5_5);
		
		JMenuItem mntmNewMenuItem_6_5 = new JMenuItem("New menu item");
		mntmNewMenuItem_6_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_6_5);
		
		JMenuItem mntmNewMenuItem_1_2 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_1_2);
		
		JMenuItem mntmNewMenuItem_2_2 = new JMenuItem("New menu item");
		mntmNewMenuItem_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_2_2);
		
		JMenuItem mntmNewMenuItem_3_2 = new JMenuItem("New menu item");
		mntmNewMenuItem_3_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_3_2);
		
		JMenuItem mntmNewMenuItem_4_2 = new JMenuItem("New menu item");
		mntmNewMenuItem_4_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_4_2);
		
		JMenuItem mntmNewMenuItem_5_2 = new JMenuItem("New menu item");
		mntmNewMenuItem_5_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_5_2);
		
		JMenuItem mntmNewMenuItem_6_2 = new JMenuItem("New menu item");
		mntmNewMenuItem_6_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_6_2);
		
		JMenuItem mntmNewMenuItem_1_3 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_1_3);
		
		JMenuItem mntmNewMenuItem_2_3 = new JMenuItem("New menu item");
		mntmNewMenuItem_2_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_2_3);
		
		JMenuItem mntmNewMenuItem_3_3 = new JMenuItem("New menu item");
		mntmNewMenuItem_3_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_3_3);
		
		JMenuItem mntmNewMenuItem_4_3 = new JMenuItem("New menu item");
		mntmNewMenuItem_4_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_4_3);
		
		JMenuItem mntmNewMenuItem_5_3 = new JMenuItem("New menu item");
		mntmNewMenuItem_5_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_5_3);
		
		JMenuItem mntmNewMenuItem_6_3 = new JMenuItem("New menu item");
		mntmNewMenuItem_6_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_6_3);
		
		JMenuItem mntmNewMenuItem_1_4 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_1_4);
		
		JMenuItem mntmNewMenuItem_2_4 = new JMenuItem("New menu item");
		mntmNewMenuItem_2_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_2_4);
		
		JMenuItem mntmNewMenuItem_3_4 = new JMenuItem("New menu item");
		mntmNewMenuItem_3_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_3_4);
		
		JMenuItem mntmNewMenuItem_4_4 = new JMenuItem("New menu item");
		mntmNewMenuItem_4_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_4_4);
		
		JMenuItem mntmNewMenuItem_5_4 = new JMenuItem("New menu item");
		mntmNewMenuItem_5_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_5_4);
		
		JMenuItem mntmNewMenuItem_6_4 = new JMenuItem("New menu item");
		mntmNewMenuItem_6_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_8.add(mntmNewMenuItem_6_4);
		
		JMenu mnNewMenu_9 = new JMenu("Metaloids/Semi-Metals");
		mnNewMenu_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_2.add(mnNewMenu_9);
		
		JMenuItem mntmNewMenuItem_1_1_1 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_9.add(mntmNewMenuItem_1_1_1);
		
		JMenuItem mntmNewMenuItem_2_1_1 = new JMenuItem("New menu item");
		mnNewMenu_9.add(mntmNewMenuItem_2_1_1);
		
		JMenuItem mntmNewMenuItem_3_1_1 = new JMenuItem("New menu item");
		mnNewMenu_9.add(mntmNewMenuItem_3_1_1);
		
		JMenuItem mntmNewMenuItem_4_1_1 = new JMenuItem("New menu item");
		mnNewMenu_9.add(mntmNewMenuItem_4_1_1);
		
		JMenuItem mntmNewMenuItem_5_1_1 = new JMenuItem("New menu item");
		mnNewMenu_9.add(mntmNewMenuItem_5_1_1);
		
		JMenuItem mntmNewMenuItem_6_1_1 = new JMenuItem("New menu item");
		mnNewMenu_9.add(mntmNewMenuItem_6_1_1);
		
		JMenu mnNewMenu_10 = new JMenu("Basic Metals");
		mnNewMenu_10.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_2.add(mnNewMenu_10);
		
		JMenuItem mntmNewMenuItem_1_1_2 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_10.add(mntmNewMenuItem_1_1_2);
		
		JMenuItem mntmNewMenuItem_2_1_2 = new JMenuItem("New menu item");
		mnNewMenu_10.add(mntmNewMenuItem_2_1_2);
		
		JMenuItem mntmNewMenuItem_3_1_2 = new JMenuItem("New menu item");
		mnNewMenu_10.add(mntmNewMenuItem_3_1_2);
		
		JMenuItem mntmNewMenuItem_4_1_2 = new JMenuItem("New menu item");
		mnNewMenu_10.add(mntmNewMenuItem_4_1_2);
		
		JMenuItem mntmNewMenuItem_5_1_2 = new JMenuItem("New menu item");
		mnNewMenu_10.add(mntmNewMenuItem_5_1_2);
		
		JMenuItem mntmNewMenuItem_6_1_2 = new JMenuItem("New menu item");
		mnNewMenu_10.add(mntmNewMenuItem_6_1_2);
		
		JMenu mnNewMenu_11 = new JMenu("Non-Metals");
		mnNewMenu_11.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_2.add(mnNewMenu_11);
		
		JMenuItem mntmNewMenuItem_1_1_3 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_1_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_11.add(mntmNewMenuItem_1_1_3);
		
		JMenuItem mntmNewMenuItem_2_1_3 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_2_1_3);
		
		JMenuItem mntmNewMenuItem_3_1_3 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_3_1_3);
		
		JMenuItem mntmNewMenuItem_4_1_3 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_4_1_3);
		
		JMenuItem mntmNewMenuItem_5_1_3 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_5_1_3);
		
		JMenuItem mntmNewMenuItem_6_1_3 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_6_1_3);
		
		JMenu mnNewMenu_12 = new JMenu("Lanthanides");
		mnNewMenu_12.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_2.add(mnNewMenu_12);
		
		JMenuItem mntmNewMenuItem_1_1_5 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_1_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_12.add(mntmNewMenuItem_1_1_5);
		
		JMenuItem mntmNewMenuItem_2_1_5 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_2_1_5);
		
		JMenuItem mntmNewMenuItem_3_1_5 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_3_1_5);
		
		JMenuItem mntmNewMenuItem_4_1_5 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_4_1_5);
		
		JMenuItem mntmNewMenuItem_5_1_5 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_5_1_5);
		
		JMenuItem mntmNewMenuItem_6_1_5 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_6_1_5);
		
		JMenuItem mntmNewMenuItem_1_1_4 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_1_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_12.add(mntmNewMenuItem_1_1_4);
		
		JMenuItem mntmNewMenuItem_2_1_4 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_2_1_4);
		
		JMenuItem mntmNewMenuItem_3_1_4 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_3_1_4);
		
		JMenuItem mntmNewMenuItem_4_1_4 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_4_1_4);
		
		JMenuItem mntmNewMenuItem_5_1_4 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_5_1_4);
		
		JMenuItem mntmNewMenuItem_6_1_4 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_6_1_4);
		
		JMenu mnNewMenu_13 = new JMenu("Actinides");
		mnNewMenu_13.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_2.add(mnNewMenu_13);
		
		JMenuItem mntmNewMenuItem_1_1_7 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_1_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_13.add(mntmNewMenuItem_1_1_7);
		
		JMenuItem mntmNewMenuItem_2_1_7 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_2_1_7);
		
		JMenuItem mntmNewMenuItem_3_1_7 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_3_1_7);
		
		JMenuItem mntmNewMenuItem_4_1_7 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_4_1_7);
		
		JMenuItem mntmNewMenuItem_5_1_7 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_5_1_7);
		
		JMenuItem mntmNewMenuItem_6_1_7 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_6_1_7);
		
		JMenuItem mntmNewMenuItem_1_1_6 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_1_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_13.add(mntmNewMenuItem_1_1_6);
		
		JMenuItem mntmNewMenuItem_2_1_6 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_2_1_6);
		
		JMenuItem mntmNewMenuItem_3_1_6 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_3_1_6);
		
		JMenuItem mntmNewMenuItem_4_1_6 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_4_1_6);
		
		JMenuItem mntmNewMenuItem_5_1_6 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_5_1_6);
		
		JMenuItem mntmNewMenuItem_6_1_6 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_6_1_6);
		
		JMenu mnNewMenu_14 = new JMenu("Noble Gases");
		mnNewMenu_14.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_2.add(mnNewMenu_14);
		
		JMenuItem mntmNewMenuItem_1_1_8 = new JMenuItem("Lithium");
		mntmNewMenuItem_1_1_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		mnNewMenu_14.add(mntmNewMenuItem_1_1_8);
		
		JMenuItem mntmNewMenuItem_2_1_8 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_2_1_8);
		
		JMenuItem mntmNewMenuItem_3_1_8 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_3_1_8);
		
		JMenuItem mntmNewMenuItem_4_1_8 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_4_1_8);
		
		JMenuItem mntmNewMenuItem_5_1_8 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_5_1_8);
		
		JMenuItem mntmNewMenuItem_6_1_8 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_6_1_8);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnNewMenu_2.add(menuBar_1);
		
		JMenu mnNewMenu_3 = new JMenu("Blocks");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Element Etymologies");
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("About");
		menuBar.add(mnNewMenu_5);

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/1.JPG");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.H, panel);
			}
		});
		panel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel.setBounds(126, 223, 75, 61);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label = new JLabel("1");
		panel.add(label);

		JLabel lblNewLabel = new JLabel("     H");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 20));
		panel.add(lblNewLabel);

		JLabel lblHydrogen = new JLabel("     Hydrogen");
		lblHydrogen.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblHydrogen);
		lblHydrogen.setFont(new Font("Georgia", Font.PLAIN, 10));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/2.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.He, panel_1);
			}
		});
		panel_1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_1.setBounds(1435, 223, 75, 61);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_1 = new JLabel("2");
		panel_1.add(label_1);

		JLabel lblNewLabel_1 = new JLabel("    He");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_1.add(lblNewLabel_1);

		JLabel lblHydrogen_1 = new JLabel("       Helium");
		lblHydrogen_1.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_1.setAlignmentX(0.5f);
		panel_1.add(lblHydrogen_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(139, 69, 19));
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/3.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Li, panel_2);
			}
		});
		panel_2.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_2.setBounds(126, 286, 75, 61);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_2 = new JLabel("3");
		panel_2.add(label_2);

		JLabel lblNewLabel_2 = new JLabel("     Li");
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_2.add(lblNewLabel_2);

		JLabel lblHydrogen_2 = new JLabel("        Lithum");
		lblHydrogen_2.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_2.setAlignmentX(0.5f);
		panel_2.add(lblHydrogen_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(139, 69, 19));
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/11.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Na, panel_3);
			}
		});
		panel_3.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_3.setBounds(126, 349, 75, 61);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_3 = new JLabel("11");
		panel_3.add(label_3);

		JLabel lblNewLabel_3 = new JLabel("    Na");
		lblNewLabel_3.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_3.add(lblNewLabel_3);

		JLabel lblHydrogen_3 = new JLabel("        Sodium");
		lblHydrogen_3.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_3.setAlignmentX(0.5f);
		panel_3.add(lblHydrogen_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(139, 69, 19));
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/19.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.K, panel_4);
			}
		});
		panel_4.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_4.setBounds(126, 412, 75, 61);
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_4 = new JLabel("19");
		panel_4.add(label_4);

		JLabel lblNewLabel_4 = new JLabel("     K");
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_4.add(lblNewLabel_4);

		JLabel lblHydrogen_4 = new JLabel("    Potassium");
		lblHydrogen_4.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_4.setAlignmentX(0.5f);
		panel_4.add(lblHydrogen_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(139, 69, 19));
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/37.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Rb, panel_5);
			}
		});
		panel_5.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_5.setBounds(126, 475, 75, 61);
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_5 = new JLabel("37");
		panel_5.add(label_5);

		JLabel lblNewLabel_5 = new JLabel("    Rb");
		lblNewLabel_5.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_5.add(lblNewLabel_5);

		JLabel lblHydrogen_5 = new JLabel("    Rubidium");
		lblHydrogen_5.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_5.setAlignmentX(0.5f);
		panel_5.add(lblHydrogen_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(139, 69, 19));
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/55.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Cs, panel_6);
			}
		});
		panel_6.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_6.setBounds(126, 538, 75, 61);
		contentPane.add(panel_6);
		panel_6.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_6 = new JLabel("55");
		panel_6.add(label_6);

		JLabel lblNewLabel_6 = new JLabel("    Cs");
		lblNewLabel_6.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_6.add(lblNewLabel_6);

		JLabel lblHydrogen_6 = new JLabel("        Cesium");
		lblHydrogen_6.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_6.setAlignmentX(0.5f);
		panel_6.add(lblHydrogen_6);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(139, 69, 19));
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/8.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Fr, panel_7);
			}
		});
		panel_7.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_7.setBounds(126, 601, 75, 61);
		contentPane.add(panel_7);
		panel_7.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_7 = new JLabel("87");
		panel_7.add(label_7);

		JLabel lblNewLabel_7 = new JLabel("    Fr");
		lblNewLabel_7.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_7.add(lblNewLabel_7);

		JLabel lblHydrogen_7 = new JLabel("    Francium");
		lblHydrogen_7.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_7.setAlignmentX(0.5f);
		panel_7.add(lblHydrogen_7);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(139, 0, 0));
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/4.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Be, panel_8);
			}
		});
		panel_8.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_8.setBounds(203, 286, 75, 61);
		contentPane.add(panel_8);
		panel_8.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_8 = new JLabel("4");
		panel_8.add(label_8);

		JLabel lblNewLabel_8 = new JLabel("    Be");
		lblNewLabel_8.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_8.add(lblNewLabel_8);

		JLabel lblHydrogen_8 = new JLabel("     Berylium");
		lblHydrogen_8.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_8.setAlignmentX(0.5f);
		panel_8.add(lblHydrogen_8);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(139, 0, 0));
		panel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/12.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Mg, panel_9);
			}
		});
		panel_9.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_9.setBounds(203, 349, 75, 61);
		contentPane.add(panel_9);
		panel_9.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_9 = new JLabel("12");
		panel_9.add(label_9);

		JLabel lblNewLabel_9 = new JLabel("    Mg");
		lblNewLabel_9.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_9.add(lblNewLabel_9);

		JLabel lblHydrogen_9 = new JLabel("   Magnisium");
		lblHydrogen_9.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_9.setAlignmentX(0.5f);
		panel_9.add(lblHydrogen_9);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(139, 0, 0));
		panel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/20.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ca, panel_10);
			}
		});
		panel_10.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_10.setBounds(203, 412, 75, 61);
		contentPane.add(panel_10);
		panel_10.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_10 = new JLabel("20");
		panel_10.add(label_10);

		JLabel lblNewLabel_10 = new JLabel("    Ca");
		lblNewLabel_10.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_10.add(lblNewLabel_10);

		JLabel lblHydrogen_10 = new JLabel("      Calcium");
		lblHydrogen_10.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_10.setAlignmentX(0.5f);
		panel_10.add(lblHydrogen_10);

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(139, 0, 0));
		panel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/38.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Sr, panel_11);
			}
		});
		panel_11.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_11.setBounds(203, 475, 75, 61);
		contentPane.add(panel_11);
		panel_11.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_11 = new JLabel("38");
		panel_11.add(label_11);

		JLabel lblNewLabel_11 = new JLabel("    Sr");
		lblNewLabel_11.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_11.add(lblNewLabel_11);

		JLabel lblHydrogen_11 = new JLabel("    Strontium");
		lblHydrogen_11.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_11.setAlignmentX(0.5f);
		panel_11.add(lblHydrogen_11);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(139, 0, 0));
		panel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/56.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ba, panel_12);
			}
		});
		panel_12.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_12.setBounds(203, 538, 75, 61);
		contentPane.add(panel_12);
		panel_12.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_12 = new JLabel("56");
		panel_12.add(label_12);

		JLabel lblNewLabel_12 = new JLabel("    Ba");
		lblNewLabel_12.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_12.add(lblNewLabel_12);

		JLabel lblHydrogen_12 = new JLabel("        Barium");
		lblHydrogen_12.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_12.setAlignmentX(0.5f);
		panel_12.add(lblHydrogen_12);

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(139, 0, 0));
		panel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/88.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ra, panel_13);
			}
		});
		panel_13.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_13.setBounds(203, 601, 75, 61);
		contentPane.add(panel_13);
		panel_13.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_13 = new JLabel("        88");
		label_13.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_13.add(label_13);

		JLabel lblNewLabel_13 = new JLabel("    Ra");
		lblNewLabel_13.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_13.add(lblNewLabel_13);

		JLabel lblHydrogen_13 = new JLabel("       Radium");
		lblHydrogen_13.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_13.setAlignmentX(0.5f);
		panel_13.add(lblHydrogen_13);

		JPanel panel_16 = new JPanel();
		panel_16.setBackground(SystemColor.activeCaption);
		panel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/21.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Sc, panel_16);
			}
		});
		panel_16.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_16.setBounds(280, 412, 75, 61);
		contentPane.add(panel_16);
		panel_16.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_16 = new JLabel("21");
		panel_16.add(label_16);

		JLabel lblNewLabel_16 = new JLabel("    Sc");
		lblNewLabel_16.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_16.add(lblNewLabel_16);

		JLabel lblHydrogen_16 = new JLabel("    Scandium");
		lblHydrogen_16.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_16.setAlignmentX(0.5f);
		panel_16.add(lblHydrogen_16);

		JPanel panel_17 = new JPanel();
		panel_17.setBackground(SystemColor.activeCaption);
		panel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/39.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Y, panel_17);
			}
		});
		panel_17.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_17.setBounds(280, 475, 75, 61);
		contentPane.add(panel_17);
		panel_17.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_17 = new JLabel("39");
		panel_17.add(label_17);

		JLabel lblNewLabel_17 = new JLabel("     Y");
		lblNewLabel_17.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_17.add(lblNewLabel_17);

		JLabel lblHydrogen_17 = new JLabel("      Yttrium");
		lblHydrogen_17.setBackground(new Color(105, 105, 105));
		lblHydrogen_17.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_17.setAlignmentX(0.5f);
		panel_17.add(lblHydrogen_17);

		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(255, 0, 0));
		panel_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/57.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.La, panel_18);
			}
		});
		panel_18.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_18.setBounds(280, 685, 75, 61);
		contentPane.add(panel_18);
		panel_18.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_18 = new JLabel("57");
		panel_18.add(label_18);

		JLabel lblNewLabel_18 = new JLabel("    La");
		lblNewLabel_18.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_18.add(lblNewLabel_18);

		JLabel lblHydrogen_18 = new JLabel("  Lanthanum");
		lblHydrogen_18.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_18.setAlignmentX(0.5f);
		panel_18.add(lblHydrogen_18);

		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 255, 0));
		panel_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/89.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ac, panel_19);
			}
		});
		panel_19.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_19.setBounds(280, 748, 75, 61);
		contentPane.add(panel_19);
		panel_19.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_19 = new JLabel("        89");
		label_19.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_19.add(label_19);

		JLabel lblNewLabel_19 = new JLabel("    Ac");
		lblNewLabel_19.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_19.add(lblNewLabel_19);

		JLabel lblHydrogen_19 = new JLabel("    Actinium");
		lblHydrogen_19.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_19.setAlignmentX(0.5f);
		panel_19.add(lblHydrogen_19);

		JPanel panel_20 = new JPanel();
		panel_20.setBackground(SystemColor.activeCaption);
		panel_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/22.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ti, panel_20);
			}
		});
		panel_20.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_20.setBounds(357, 412, 75, 61);
		contentPane.add(panel_20);
		panel_20.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_20 = new JLabel("22");
		panel_20.add(label_20);

		JLabel lblNewLabel_20 = new JLabel("    Ti");
		lblNewLabel_20.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_20.add(lblNewLabel_20);

		JLabel lblHydrogen_20 = new JLabel("     Titanium");
		lblHydrogen_20.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_20.setAlignmentX(0.5f);
		panel_20.add(lblHydrogen_20);

		JPanel panel_21 = new JPanel();
		panel_21.setBackground(SystemColor.activeCaption);
		panel_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/40.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Zr, panel_21);
			}
		});
		panel_21.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_21.setBounds(357, 475, 75, 61);
		contentPane.add(panel_21);
		panel_21.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_21 = new JLabel("40");
		panel_21.add(label_21);

		JLabel lblNewLabel_21 = new JLabel("    Zr");
		lblNewLabel_21.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_21.add(lblNewLabel_21);

		JLabel lblHydrogen_21 = new JLabel("    Zirconium");
		lblHydrogen_21.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_21.setAlignmentX(0.5f);
		panel_21.add(lblHydrogen_21);

		JPanel panel_22 = new JPanel();
		panel_22.setBackground(SystemColor.activeCaption);
		panel_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/72.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Hf, panel_22);
			}
		});
		panel_22.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_22.setBounds(357, 538, 75, 61);
		contentPane.add(panel_22);
		panel_22.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_22 = new JLabel("72");
		panel_22.add(label_22);

		JLabel lblNewLabel_22 = new JLabel("    Hf");
		lblNewLabel_22.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_22.add(lblNewLabel_22);

		JLabel lblHydrogen_22 = new JLabel("     Halfnium");
		lblHydrogen_22.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_22.setAlignmentX(0.5f);
		panel_22.add(lblHydrogen_22);

		JPanel panel_23 = new JPanel();
		panel_23.setBackground(SystemColor.activeCaption);
		panel_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/104.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Rf, panel_23);
			}
		});
		panel_23.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_23.setBounds(357, 601, 75, 61);
		contentPane.add(panel_23);
		panel_23.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_23 = new JLabel("      104");
		label_23.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_23.add(label_23);

		JLabel lblNewLabel_23 = new JLabel("    Rf");
		lblNewLabel_23.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_23.add(lblNewLabel_23);

		JLabel lblHydrogen_23 = new JLabel("  Rutherfordium");
		lblHydrogen_23.setFont(new Font("Georgia", Font.BOLD, 8));
		lblHydrogen_23.setAlignmentX(0.5f);
		panel_23.add(lblHydrogen_23);

		JPanel panel_24 = new JPanel();
		panel_24.setBackground(SystemColor.activeCaption);
		panel_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/105.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Db, panel_24);
			}
		});
		panel_24.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_24.setBounds(434, 601, 75, 61);
		contentPane.add(panel_24);
		panel_24.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_24 = new JLabel("      105");
		label_24.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_24.add(label_24);

		JLabel lblNewLabel_24 = new JLabel("    Db");
		lblNewLabel_24.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_24.add(lblNewLabel_24);

		JLabel lblHydrogen_24 = new JLabel("     Dubnium");
		lblHydrogen_24.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_24.setAlignmentX(0.5f);
		panel_24.add(lblHydrogen_24);

		JPanel panel_25 = new JPanel();
		panel_25.setBackground(SystemColor.activeCaption);
		panel_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/73.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ta, panel_25);
			}
		});
		panel_25.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_25.setBounds(434, 538, 75, 61);
		contentPane.add(panel_25);
		panel_25.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_25 = new JLabel("73");
		panel_25.add(label_25);

		JLabel lblNewLabel_25 = new JLabel("    Ta");
		lblNewLabel_25.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_25.add(lblNewLabel_25);

		JLabel lblHydrogen_25 = new JLabel("     Tantalum");
		lblHydrogen_25.setBackground(new Color(105, 105, 105));
		lblHydrogen_25.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_25.setAlignmentX(0.5f);
		panel_25.add(lblHydrogen_25);

		JPanel panel_26 = new JPanel();
		panel_26.setBackground(SystemColor.activeCaption);
		panel_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/41.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Nb, panel_26);
			}
		});
		panel_26.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_26.setBounds(434, 475, 75, 61);
		contentPane.add(panel_26);
		panel_26.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_26 = new JLabel("41");
		panel_26.add(label_26);

		JLabel lblNewLabel_26 = new JLabel("    Nb");
		lblNewLabel_26.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_26.add(lblNewLabel_26);

		JLabel lblHydrogen_26 = new JLabel("      Niobium");
		lblHydrogen_26.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_26.setAlignmentX(0.5f);
		panel_26.add(lblHydrogen_26);

		JPanel panel_27 = new JPanel();
		panel_27.setBackground(SystemColor.activeCaption);
		panel_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/23.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.V, panel_27);
			}
		});
		panel_27.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_27.setBounds(434, 412, 75, 61);
		contentPane.add(panel_27);
		panel_27.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_27 = new JLabel("23");
		panel_27.add(label_27);

		JLabel lblNewLabel_27 = new JLabel("     V");
		lblNewLabel_27.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_27.add(lblNewLabel_27);

		JLabel lblHydrogen_27 = new JLabel("   Vanadium");
		lblHydrogen_27.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_27.setAlignmentX(0.5f);
		panel_27.add(lblHydrogen_27);

		JPanel panel_28 = new JPanel();
		panel_28.setBackground(SystemColor.activeCaption);
		panel_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/24.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Cr, panel_28);
			}
		});
		panel_28.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_28.setBounds(511, 412, 75, 61);
		contentPane.add(panel_28);
		panel_28.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_28 = new JLabel("24");
		panel_28.add(label_28);

		JLabel lblNewLabel_28 = new JLabel("    Cr");
		lblNewLabel_28.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_28.add(lblNewLabel_28);

		JLabel lblHydrogen_28 = new JLabel("   Chromium");
		lblHydrogen_28.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_28.setAlignmentX(0.5f);
		panel_28.add(lblHydrogen_28);

		JPanel panel_29 = new JPanel();
		panel_29.setBackground(SystemColor.activeCaption);
		panel_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/42.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Mo, panel_29);
			}
		});
		panel_29.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_29.setBounds(511, 475, 75, 61);
		contentPane.add(panel_29);
		panel_29.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_29 = new JLabel("42");
		panel_29.add(label_29);

		JLabel lblNewLabel_29 = new JLabel("    Mo");
		lblNewLabel_29.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_29.add(lblNewLabel_29);

		JLabel lblHydrogen_29 = new JLabel("Molybdenum");
		lblHydrogen_29.setBackground(new Color(105, 105, 105));
		lblHydrogen_29.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_29.setAlignmentX(0.5f);
		panel_29.add(lblHydrogen_29);

		JPanel panel_30 = new JPanel();
		panel_30.setBackground(SystemColor.activeCaption);
		panel_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/74.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.W, panel_30);
			}
		});
		panel_30.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_30.setBounds(511, 538, 75, 61);
		contentPane.add(panel_30);
		panel_30.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_30 = new JLabel("74");
		panel_30.add(label_30);

		JLabel lblNewLabel_30 = new JLabel("     W");
		lblNewLabel_30.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_30.add(lblNewLabel_30);

		JLabel lblHydrogen_30 = new JLabel("      Tungsten");
		lblHydrogen_30.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_30.setAlignmentX(0.5f);
		panel_30.add(lblHydrogen_30);

		JPanel panel_31 = new JPanel();
		panel_31.setBackground(SystemColor.activeCaption);
		panel_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/106.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Sg, panel_31);
			}
		});
		panel_31.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_31.setBounds(511, 601, 75, 61);
		contentPane.add(panel_31);
		panel_31.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_31 = new JLabel("      106");
		label_31.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_31.add(label_31);

		JLabel lblNewLabel_31 = new JLabel("    Sg");
		lblNewLabel_31.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_31.add(lblNewLabel_31);

		JLabel lblHydrogen_31 = new JLabel("  Seaborgium");
		lblHydrogen_31.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_31.setAlignmentX(0.5f);
		panel_31.add(lblHydrogen_31);

		JPanel panel_32 = new JPanel();
		panel_32.setBackground(SystemColor.activeCaption);
		panel_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/25.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Mn, panel_32);
			}
		});
		panel_32.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_32.setBounds(588, 412, 75, 61);
		contentPane.add(panel_32);
		panel_32.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_32 = new JLabel("25");
		panel_32.add(label_32);

		JLabel lblNewLabel_32 = new JLabel("   Mn");
		lblNewLabel_32.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_32.add(lblNewLabel_32);

		JLabel lblHydrogen_32 = new JLabel("   Manganese");
		lblHydrogen_32.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_32.setAlignmentX(0.5f);
		panel_32.add(lblHydrogen_32);

		JPanel panel_33 = new JPanel();
		panel_33.setBackground(SystemColor.activeCaption);
		panel_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/43.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Tc, panel_33);
			}
		});
		panel_33.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_33.setBounds(588, 475, 75, 61);
		contentPane.add(panel_33);
		panel_33.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_33 = new JLabel("        43");
		label_33.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_33.add(label_33);

		JLabel lblNewLabel_33 = new JLabel("    Tc");
		lblNewLabel_33.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_33.add(lblNewLabel_33);

		JLabel lblHydrogen_33 = new JLabel("  Technetium");
		lblHydrogen_33.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_33.setAlignmentX(0.5f);
		panel_33.add(lblHydrogen_33);

		JPanel panel_34 = new JPanel();
		panel_34.setBackground(SystemColor.activeCaption);
		panel_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/75.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Re, panel_34);
			}
		});
		panel_34.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_34.setBounds(588, 538, 75, 61);
		contentPane.add(panel_34);
		panel_34.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_34 = new JLabel("75");
		panel_34.add(label_34);

		JLabel lblNewLabel_34 = new JLabel("    Re");
		lblNewLabel_34.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_34.add(lblNewLabel_34);

		JLabel lblHydrogen_34 = new JLabel("     Rhenium");
		lblHydrogen_34.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_34.setAlignmentX(0.5f);
		panel_34.add(lblHydrogen_34);

		JPanel panel_35 = new JPanel();
		panel_35.setBackground(SystemColor.activeCaption);
		panel_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/107.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Bh, panel_35);
			}
		});
		panel_35.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_35.setBounds(588, 601, 75, 61);
		contentPane.add(panel_35);
		panel_35.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_35 = new JLabel("      107");
		label_35.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_35.add(label_35);

		JLabel lblNewLabel_35 = new JLabel("    Bh");
		lblNewLabel_35.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_35.add(lblNewLabel_35);

		JLabel lblHydrogen_35 = new JLabel("      Bohrium");
		lblHydrogen_35.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_35.setAlignmentX(0.5f);
		panel_35.add(lblHydrogen_35);

		JPanel panel_36 = new JPanel();
		panel_36.setBackground(SystemColor.activeCaption);
		panel_36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/26.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Fe, panel_36);
			}
		});
		panel_36.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_36.setBounds(665, 412, 75, 61);
		contentPane.add(panel_36);
		panel_36.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_36 = new JLabel("26");
		panel_36.add(label_36);

		JLabel lblNewLabel_36 = new JLabel("    Fe");
		lblNewLabel_36.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_36.add(lblNewLabel_36);

		JLabel lblHydrogen_36 = new JLabel("            Iron");
		lblHydrogen_36.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_36.setAlignmentX(0.5f);
		panel_36.add(lblHydrogen_36);

		JPanel panel_37 = new JPanel();
		panel_37.setBackground(SystemColor.activeCaption);
		panel_37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/44.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ru, panel_37);
			}
		});
		panel_37.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_37.setBounds(665, 475, 75, 61);
		contentPane.add(panel_37);
		panel_37.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_37 = new JLabel("44");
		panel_37.add(label_37);

		JLabel lblNewLabel_37 = new JLabel("    Ru");
		lblNewLabel_37.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_37.add(lblNewLabel_37);

		JLabel lblHydrogen_37 = new JLabel("  Ruthenium");
		lblHydrogen_37.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_37.setAlignmentX(0.5f);
		panel_37.add(lblHydrogen_37);

		JPanel panel_38 = new JPanel();
		panel_38.setBackground(SystemColor.activeCaption);
		panel_38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/76.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Os, panel_38);
			}
		});
		panel_38.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_38.setBounds(665, 538, 75, 61);
		contentPane.add(panel_38);
		panel_38.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_38 = new JLabel("76");
		panel_38.add(label_38);

		JLabel lblNewLabel_38 = new JLabel("    Os");
		lblNewLabel_38.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_38.add(lblNewLabel_38);

		JLabel lblHydrogen_38 = new JLabel("       Osmium");
		lblHydrogen_38.setBackground(SystemColor.activeCaption);
		lblHydrogen_38.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_38.setAlignmentX(0.5f);
		panel_38.add(lblHydrogen_38);

		JPanel panel_39 = new JPanel();
		panel_39.setBackground(SystemColor.activeCaption);
		panel_39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/108.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Hs, panel_39);
			}
		});
		panel_39.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_39.setBounds(665, 601, 75, 61);
		contentPane.add(panel_39);
		panel_39.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_39 = new JLabel("      108");
		label_39.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_39.add(label_39);

		JLabel lblNewLabel_39 = new JLabel("    Hs");
		lblNewLabel_39.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_39.add(lblNewLabel_39);

		JLabel lblHydrogen_39 = new JLabel("      Hassium");
		lblHydrogen_39.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_39.setAlignmentX(0.5f);
		panel_39.add(lblHydrogen_39);

		JPanel panel_40 = new JPanel();
		panel_40.setBackground(SystemColor.activeCaption);
		panel_40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/27.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Co, panel_40);
			}
		});
		panel_40.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_40.setBounds(742, 412, 75, 61);
		contentPane.add(panel_40);
		panel_40.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_40 = new JLabel("27");
		panel_40.add(label_40);

		JLabel lblNewLabel_40 = new JLabel("    Co");
		lblNewLabel_40.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_40.add(lblNewLabel_40);

		JLabel lblHydrogen_40 = new JLabel("         Cobalt");
		lblHydrogen_40.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_40.setAlignmentX(0.5f);
		panel_40.add(lblHydrogen_40);

		JPanel panel_41 = new JPanel();
		panel_41.setBackground(SystemColor.activeCaption);
		panel_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/45.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Rh, panel_41);
			}
		});
		panel_41.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_41.setBounds(742, 475, 75, 61);
		contentPane.add(panel_41);
		panel_41.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_41 = new JLabel("45");
		panel_41.add(label_41);

		JLabel lblNewLabel_41 = new JLabel("    Rh");
		lblNewLabel_41.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_41.add(lblNewLabel_41);

		JLabel lblHydrogen_41 = new JLabel("      Rhodium");
		lblHydrogen_41.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_41.setAlignmentX(0.5f);
		panel_41.add(lblHydrogen_41);

		JPanel panel_42 = new JPanel();
		panel_42.setBackground(SystemColor.activeCaption);
		panel_42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/77.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ir, panel_42);
			}
		});
		panel_42.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_42.setBounds(742, 538, 75, 61);
		contentPane.add(panel_42);
		panel_42.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_42 = new JLabel("77");
		panel_42.add(label_42);

		JLabel lblNewLabel_42 = new JLabel("    Ir");
		lblNewLabel_42.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_42.add(lblNewLabel_42);

		JLabel lblHydrogen_42 = new JLabel("       Iridium");
		lblHydrogen_42.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_42.setAlignmentX(0.5f);
		panel_42.add(lblHydrogen_42);

		JPanel panel_43 = new JPanel();
		panel_43.setBackground(SystemColor.activeCaption);
		panel_43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/109.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Mt, panel_43);
			}
		});
		panel_43.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_43.setBounds(742, 601, 75, 61);
		contentPane.add(panel_43);
		panel_43.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_43 = new JLabel("      109");
		label_43.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_43.add(label_43);

		JLabel lblNewLabel_43 = new JLabel("    Mt");
		lblNewLabel_43.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_43.add(lblNewLabel_43);

		JLabel lblHydrogen_43 = new JLabel("  Meitnerium");
		lblHydrogen_43.setBackground(new Color(105, 105, 105));
		lblHydrogen_43.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_43.setAlignmentX(0.5f);
		panel_43.add(lblHydrogen_43);

		JPanel panel_44 = new JPanel();
		panel_44.setBackground(SystemColor.activeCaption);
		panel_44.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/28.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ni, panel_44);
			}
		});
		panel_44.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_44.setBounds(819, 412, 75, 61);
		contentPane.add(panel_44);
		panel_44.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_44 = new JLabel("28");
		panel_44.add(label_44);

		JLabel lblNewLabel_44 = new JLabel("    Ni");
		lblNewLabel_44.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_44.add(lblNewLabel_44);

		JLabel lblHydrogen_44 = new JLabel("         Nickel");
		lblHydrogen_44.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_44.setAlignmentX(0.5f);
		panel_44.add(lblHydrogen_44);

		JPanel panel_45 = new JPanel();
		panel_45.setBackground(SystemColor.activeCaption);
		panel_45.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/46.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Pd, panel_45);
			}
		});
		panel_45.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_45.setBounds(819, 475, 75, 61);
		contentPane.add(panel_45);
		panel_45.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_45 = new JLabel("46");
		panel_45.add(label_45);

		JLabel lblNewLabel_45 = new JLabel("    Pd");
		lblNewLabel_45.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_45.add(lblNewLabel_45);

		JLabel lblHydrogen_45 = new JLabel("   Palladium");
		lblHydrogen_45.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_45.setAlignmentX(0.5f);
		panel_45.add(lblHydrogen_45);

		JPanel panel_46 = new JPanel();
		panel_46.setBackground(SystemColor.activeCaption);
		panel_46.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/78.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Pt, panel_46);
			}
		});
		panel_46.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_46.setBounds(819, 538, 75, 61);
		contentPane.add(panel_46);
		panel_46.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_46 = new JLabel("78");
		panel_46.add(label_46);

		JLabel lblNewLabel_46 = new JLabel("    Pt");
		lblNewLabel_46.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_46.add(lblNewLabel_46);

		JLabel lblHydrogen_46 = new JLabel("     Platinum");
		lblHydrogen_46.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_46.setAlignmentX(0.5f);
		panel_46.add(lblHydrogen_46);

		JPanel panel_47 = new JPanel();
		panel_47.setBackground(SystemColor.activeCaption);
		panel_47.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/110.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ds, panel_47);
			}
		});
		panel_47.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_47.setBounds(819, 601, 75, 61);
		contentPane.add(panel_47);
		panel_47.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_47 = new JLabel("      110");
		label_47.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_47.add(label_47);

		JLabel lblNewLabel_47 = new JLabel("    Ds");
		lblNewLabel_47.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_47.add(lblNewLabel_47);

		JLabel lblHydrogen_47 = new JLabel(" Darmstadtium");
		lblHydrogen_47.setFont(new Font("Georgia", Font.BOLD, 8));
		lblHydrogen_47.setAlignmentX(0.5f);
		panel_47.add(lblHydrogen_47);

		JPanel panel_48 = new JPanel();
		panel_48.setBackground(SystemColor.activeCaption);
		panel_48.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/29.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Cu, panel_48);
			}
		});
		panel_48.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_48.setBounds(896, 412, 75, 61);
		contentPane.add(panel_48);
		panel_48.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_48 = new JLabel("29");
		panel_48.add(label_48);

		JLabel lblNewLabel_48 = new JLabel("    Cu");
		lblNewLabel_48.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_48.add(lblNewLabel_48);

		JLabel lblHydrogen_48 = new JLabel("         Copper");
		lblHydrogen_48.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_48.setAlignmentX(0.5f);
		panel_48.add(lblHydrogen_48);

		JPanel panel_49 = new JPanel();
		panel_49.setBackground(SystemColor.activeCaption);
		panel_49.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/47.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ag, panel_49);
			}
		});
		panel_49.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_49.setBounds(896, 475, 75, 61);
		contentPane.add(panel_49);
		panel_49.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_49 = new JLabel("47");
		panel_49.add(label_49);

		JLabel lblNewLabel_49 = new JLabel("    Ag");
		lblNewLabel_49.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_49.add(lblNewLabel_49);

		JLabel lblHydrogen_49 = new JLabel("          Silver");
		lblHydrogen_49.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_49.setAlignmentX(0.5f);
		panel_49.add(lblHydrogen_49);

		JPanel panel_50 = new JPanel();
		panel_50.setBackground(SystemColor.activeCaption);
		panel_50.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/79.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Au, panel_50);
			}
		});
		panel_50.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_50.setBounds(896, 538, 75, 61);
		contentPane.add(panel_50);
		panel_50.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_50 = new JLabel("79");
		panel_50.add(label_50);

		JLabel lblNewLabel_50 = new JLabel("    Au");
		lblNewLabel_50.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_50.add(lblNewLabel_50);

		JLabel lblHydrogen_50 = new JLabel("           Gold");
		lblHydrogen_50.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_50.setAlignmentX(0.5f);
		panel_50.add(lblHydrogen_50);

		JPanel panel_51 = new JPanel();
		panel_51.setBackground(SystemColor.activeCaption);
		panel_51.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.H, panel_51);
			}
		});
		panel_51.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_51.setBounds(896, 601, 75, 61);
		contentPane.add(panel_51);
		panel_51.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_51 = new JLabel("1");
		panel_51.add(label_51);

		JLabel lblNewLabel_51 = new JLabel("     H");
		lblNewLabel_51.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_51.add(lblNewLabel_51);

		JLabel lblHydrogen_51 = new JLabel("     Hydrogen");
		lblHydrogen_51.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_51.setAlignmentX(0.5f);
		panel_51.add(lblHydrogen_51);

		JPanel panel_52 = new JPanel();
		panel_52.setBackground(SystemColor.activeCaption);
		panel_52.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/30.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Zn, panel_52);
			}
		});
		panel_52.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_52.setBounds(973, 412, 75, 61);
		contentPane.add(panel_52);
		panel_52.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_52 = new JLabel("30");
		panel_52.add(label_52);

		JLabel lblNewLabel_52 = new JLabel("    Zn");
		lblNewLabel_52.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_52.add(lblNewLabel_52);

		JLabel lblHydrogen_52 = new JLabel("            Zinc");
		lblHydrogen_52.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_52.setAlignmentX(0.5f);
		panel_52.add(lblHydrogen_52);

		JPanel panel_53 = new JPanel();
		panel_53.setBackground(SystemColor.activeCaption);
		panel_53.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/48.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Cd, panel_53);
			}
		});
		panel_53.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_53.setBounds(973, 475, 75, 61);
		contentPane.add(panel_53);
		panel_53.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_53 = new JLabel("48");
		panel_53.add(label_53);

		JLabel lblNewLabel_53 = new JLabel("    Cd");
		lblNewLabel_53.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_53.add(lblNewLabel_53);

		JLabel lblHydrogen_53 = new JLabel("    Cadmium");
		lblHydrogen_53.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_53.setAlignmentX(0.5f);
		panel_53.add(lblHydrogen_53);

		JPanel panel_54 = new JPanel();
		panel_54.setBackground(SystemColor.activeCaption);
		panel_54.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/80.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Hg, panel_54);
			}
		});
		panel_54.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_54.setBounds(973, 538, 75, 61);
		contentPane.add(panel_54);
		panel_54.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_54 = new JLabel("80");
		panel_54.add(label_54);

		JLabel lblNewLabel_54 = new JLabel("    Hg");
		lblNewLabel_54.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_54.add(lblNewLabel_54);

		JLabel lblHydrogen_54 = new JLabel("       Mercury");
		lblHydrogen_54.setBackground(new Color(105, 105, 105));
		lblHydrogen_54.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_54.setAlignmentX(0.5f);
		panel_54.add(lblHydrogen_54);

		JPanel panel_55 = new JPanel();
		panel_55.setBackground(SystemColor.activeCaption);
		panel_55.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.H, panel_55);
			}
		});
		panel_55.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_55.setBounds(973, 601, 75, 61);
		contentPane.add(panel_55);
		panel_55.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_55 = new JLabel("1");
		panel_55.add(label_55);

		JLabel lblNewLabel_55 = new JLabel("     H");
		lblNewLabel_55.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_55.add(lblNewLabel_55);

		JLabel lblHydrogen_55 = new JLabel("     Hydrogen");
		lblHydrogen_55.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_55.setAlignmentX(0.5f);
		panel_55.add(lblHydrogen_55);

		JPanel panel_56 = new JPanel();
		panel_56.setBackground(new Color(224, 255, 255));
		panel_56.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/31.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ga, panel_56);
			}
		});
		panel_56.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_56.setBounds(1050, 412, 75, 61);
		contentPane.add(panel_56);
		panel_56.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_56 = new JLabel("31");
		panel_56.add(label_56);

		JLabel lblNewLabel_56 = new JLabel("    Ga");
		lblNewLabel_56.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_56.add(lblNewLabel_56);

		JLabel lblHydrogen_56 = new JLabel("       Gallium");
		lblHydrogen_56.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_56.setAlignmentX(0.5f);
		panel_56.add(lblHydrogen_56);

		JPanel panel_57 = new JPanel();
		panel_57.setBackground(new Color(224, 255, 255));
		panel_57.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/49.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.In, panel_57);
			}
		});
		panel_57.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_57.setBounds(1050, 475, 75, 61);
		contentPane.add(panel_57);
		panel_57.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_57 = new JLabel("49");
		panel_57.add(label_57);

		JLabel lblNewLabel_57 = new JLabel("    In");
		lblNewLabel_57.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_57.add(lblNewLabel_57);

		JLabel lblHydrogen_57 = new JLabel("        Indium");
		lblHydrogen_57.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_57.setAlignmentX(0.5f);
		panel_57.add(lblHydrogen_57);

		JPanel panel_58 = new JPanel();
		panel_58.setBackground(new Color(224, 255, 255));
		panel_58.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/81.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Tl, panel_58);
			}
		});
		panel_58.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_58.setBounds(1050, 538, 75, 61);
		contentPane.add(panel_58);
		panel_58.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_58 = new JLabel("81");
		panel_58.add(label_58);

		JLabel lblNewLabel_58 = new JLabel("    Tl");
		lblNewLabel_58.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_58.add(lblNewLabel_58);

		JLabel lblHydrogen_58 = new JLabel("     Thallium");
		lblHydrogen_58.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_58.setAlignmentX(0.5f);
		panel_58.add(lblHydrogen_58);

		JPanel panel_59 = new JPanel();
		panel_59.setBackground(new Color(224, 255, 255));
		panel_59.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.H, panel_59);
			}
		});
		panel_59.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_59.setBounds(1050, 601, 75, 61);
		contentPane.add(panel_59);
		panel_59.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_59 = new JLabel("1");
		panel_59.add(label_59);

		JLabel lblNewLabel_59 = new JLabel("     H");
		lblNewLabel_59.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_59.add(lblNewLabel_59);

		JLabel lblHydrogen_59 = new JLabel("     Hydrogen");
		lblHydrogen_59.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_59.setAlignmentX(0.5f);
		panel_59.add(lblHydrogen_59);

		JPanel panel_62 = new JPanel();
		panel_62.setBackground(new Color(135, 206, 250));
		panel_62.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/15.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.P, panel_62);
			}
		});
		panel_62.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_62.setBounds(1204, 349, 75, 61);
		contentPane.add(panel_62);
		panel_62.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_62 = new JLabel("15");
		panel_62.add(label_62);

		JLabel lblNewLabel_62 = new JLabel("     P");
		lblNewLabel_62.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_62.add(lblNewLabel_62);

		JLabel lblHydrogen_62 = new JLabel("  Phosphorus");
		lblHydrogen_62.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_62.setAlignmentX(0.5f);
		panel_62.add(lblHydrogen_62);

		JPanel panel_63 = new JPanel();
		panel_63.setBackground(new Color(240, 230, 140));
		panel_63.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/5.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.B, panel_63);
			}
		});
		panel_63.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_63.setBounds(1050, 286, 75, 61);
		contentPane.add(panel_63);
		panel_63.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_63 = new JLabel("5");
		panel_63.add(label_63);

		JLabel lblNewLabel_63 = new JLabel("     B");
		lblNewLabel_63.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_63.add(lblNewLabel_63);

		JLabel lblHydrogen_63 = new JLabel("          Boron");
		lblHydrogen_63.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_63.setAlignmentX(0.5f);
		panel_63.add(lblHydrogen_63);

		JPanel panel_64 = new JPanel();
		panel_64.setBackground(new Color(224, 255, 255));
		panel_64.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.H, panel_64);
			}
		});
		panel_64.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_64.setBounds(1127, 601, 75, 61);
		contentPane.add(panel_64);
		panel_64.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_64 = new JLabel("1");
		panel_64.add(label_64);

		JLabel lblNewLabel_64 = new JLabel("     H");
		lblNewLabel_64.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_64.add(lblNewLabel_64);

		JLabel lblHydrogen_64 = new JLabel("     Hydrogen");
		lblHydrogen_64.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_64.setAlignmentX(0.5f);
		panel_64.add(lblHydrogen_64);

		JPanel panel_65 = new JPanel();
		panel_65.setBackground(new Color(224, 255, 255));
		panel_65.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/82.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Pb, panel_65);
			}
		});
		panel_65.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_65.setBounds(1127, 538, 75, 61);
		contentPane.add(panel_65);
		panel_65.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_65 = new JLabel("82");
		panel_65.add(label_65);

		JLabel lblNewLabel_65 = new JLabel("    Pb");
		lblNewLabel_65.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_65.add(lblNewLabel_65);

		JLabel lblHydrogen_65 = new JLabel("           Lead");
		lblHydrogen_65.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_65.setAlignmentX(0.5f);
		panel_65.add(lblHydrogen_65);

		JPanel panel_66 = new JPanel();
		panel_66.setBackground(new Color(224, 255, 255));
		panel_66.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/50.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Sn, panel_66);
			}
		});
		panel_66.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_66.setBounds(1127, 475, 75, 61);
		contentPane.add(panel_66);
		panel_66.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_66 = new JLabel("50");
		panel_66.add(label_66);

		JLabel lblNewLabel_66 = new JLabel("    Sn");
		lblNewLabel_66.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_66.add(lblNewLabel_66);

		JLabel lblHydrogen_66 = new JLabel("             Tin");
		lblHydrogen_66.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_66.setAlignmentX(0.5f);
		panel_66.add(lblHydrogen_66);

		JPanel panel_67 = new JPanel();
		panel_67.setBackground(new Color(240, 230, 140));
		panel_67.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/32.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ge, panel_67);
			}
		});
		panel_67.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_67.setBounds(1127, 412, 75, 61);
		contentPane.add(panel_67);
		panel_67.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_67 = new JLabel("32");
		panel_67.add(label_67);

		JLabel lblNewLabel_67 = new JLabel("    Ge");
		lblNewLabel_67.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_67.add(lblNewLabel_67);

		JLabel lblHydrogen_67 = new JLabel(" Germanium");
		lblHydrogen_67.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_67.setAlignmentX(0.5f);
		panel_67.add(lblHydrogen_67);

		JPanel panel_68 = new JPanel();
		panel_68.setBackground(new Color(135, 206, 250));
		panel_68.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/16.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.S, panel_68);
			}
		});
		panel_68.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_68.setBounds(1281, 349, 75, 61);
		contentPane.add(panel_68);
		panel_68.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_68 = new JLabel("16");
		panel_68.add(label_68);

		JLabel lblNewLabel_68 = new JLabel("     S");
		lblNewLabel_68.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_68.add(lblNewLabel_68);

		JLabel lblHydrogen_68 = new JLabel("         Sulfur");
		lblHydrogen_68.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_68.setAlignmentX(0.5f);
		panel_68.add(lblHydrogen_68);

		JPanel panel_69 = new JPanel();
		panel_69.setBackground(new Color(135, 206, 250));
		panel_69.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/6.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.C, panel_69);
			}
		});
		panel_69.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_69.setBounds(1127, 286, 75, 61);
		contentPane.add(panel_69);
		panel_69.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_69 = new JLabel("6");
		panel_69.add(label_69);

		JLabel lblNewLabel_69 = new JLabel("     C");
		lblNewLabel_69.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_69.add(lblNewLabel_69);

		JLabel lblHydrogen_69 = new JLabel("         Carbon");
		lblHydrogen_69.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_69.setAlignmentX(0.5f);
		panel_69.add(lblHydrogen_69);

		JPanel panel_70 = new JPanel();
		panel_70.setBackground(new Color(224, 255, 255));
		panel_70.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.H, panel_70);
			}
		});
		panel_70.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_70.setBounds(1204, 601, 75, 61);
		contentPane.add(panel_70);
		panel_70.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_70 = new JLabel("1");
		panel_70.add(label_70);

		JLabel lblNewLabel_70 = new JLabel("     H");
		lblNewLabel_70.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_70.add(lblNewLabel_70);

		JLabel lblHydrogen_70 = new JLabel("     Hydrogen");
		lblHydrogen_70.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_70.setAlignmentX(0.5f);
		panel_70.add(lblHydrogen_70);

		JPanel panel_71 = new JPanel();
		panel_71.setBackground(new Color(224, 255, 255));
		panel_71.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/83.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Bi, panel_71);
			}
		});
		panel_71.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_71.setBounds(1204, 538, 75, 61);
		contentPane.add(panel_71);
		panel_71.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_71 = new JLabel("83");
		panel_71.add(label_71);

		JLabel lblNewLabel_71 = new JLabel("    Bi");
		lblNewLabel_71.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_71.add(lblNewLabel_71);

		JLabel lblHydrogen_71 = new JLabel("      Bismuth");
		lblHydrogen_71.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_71.setAlignmentX(0.5f);
		panel_71.add(lblHydrogen_71);

		JPanel panel_72 = new JPanel();
		panel_72.setBackground(new Color(240, 230, 140));
		panel_72.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/51.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Sb, panel_72);
			}
		});
		panel_72.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_72.setBounds(1204, 475, 75, 61);
		contentPane.add(panel_72);
		panel_72.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_72 = new JLabel("51");
		panel_72.add(label_72);

		JLabel lblNewLabel_72 = new JLabel("    Sb");
		lblNewLabel_72.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_72.add(lblNewLabel_72);

		JLabel lblHydrogen_72 = new JLabel("     Antimony");
		lblHydrogen_72.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_72.setAlignmentX(0.5f);
		panel_72.add(lblHydrogen_72);

		JPanel panel_73 = new JPanel();
		panel_73.setBackground(new Color(240, 230, 140));
		panel_73.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/33.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.As, panel_73);
			}
		});
		panel_73.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_73.setBounds(1204, 412, 75, 61);
		contentPane.add(panel_73);
		panel_73.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_73 = new JLabel("33");
		panel_73.add(label_73);

		JLabel lblNewLabel_73 = new JLabel("    As");
		lblNewLabel_73.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_73.add(lblNewLabel_73);

		JLabel lblHydrogen_73 = new JLabel("        Arsenic");
		lblHydrogen_73.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_73.setAlignmentX(0.5f);
		panel_73.add(lblHydrogen_73);

		JPanel panel_74 = new JPanel();
		panel_74.setBackground(new Color(154, 205, 50));
		panel_74.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/17.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Cl, panel_74);
			}
		});
		panel_74.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_74.setBounds(1358, 349, 75, 61);
		contentPane.add(panel_74);
		panel_74.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_74 = new JLabel("17");
		panel_74.add(label_74);

		JLabel lblNewLabel_74 = new JLabel("     Cl");
		lblNewLabel_74.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_74.add(lblNewLabel_74);

		JLabel lblHydrogen_74 = new JLabel("       Chlorine");
		lblHydrogen_74.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_74.setAlignmentX(0.5f);
		panel_74.add(lblHydrogen_74);

		JPanel panel_75 = new JPanel();
		panel_75.setBackground(new Color(135, 206, 250));
		panel_75.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/7.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.N, panel_75);
			}
		});
		panel_75.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_75.setBounds(1204, 286, 75, 61);
		contentPane.add(panel_75);
		panel_75.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_75 = new JLabel("7");
		panel_75.add(label_75);

		JLabel lblNewLabel_75 = new JLabel("     N");
		lblNewLabel_75.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_75.add(lblNewLabel_75);

		JLabel lblHydrogen_75 = new JLabel("      Nitrogen");
		lblHydrogen_75.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_75.setAlignmentX(0.5f);
		panel_75.add(lblHydrogen_75);

		JPanel panel_76 = new JPanel();
		panel_76.setBackground(new Color(135, 206, 250));
		panel_76.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/8.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.O, panel_76);
			}
		});
		panel_76.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_76.setBounds(1281, 286, 75, 61);
		contentPane.add(panel_76);
		panel_76.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_76 = new JLabel("8");
		panel_76.add(label_76);

		JLabel lblNewLabel_76 = new JLabel("     O");
		lblNewLabel_76.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_76.add(lblNewLabel_76);

		JLabel lblHydrogen_76 = new JLabel("        Oxygen");
		lblHydrogen_76.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_76.setAlignmentX(0.5f);
		panel_76.add(lblHydrogen_76);

		JPanel panel_77 = new JPanel();
		panel_77.setBackground(SystemColor.inactiveCaptionBorder);
		panel_77.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/18.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ar, panel_77);
			}
		});
		panel_77.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_77.setBounds(1435, 349, 75, 61);
		contentPane.add(panel_77);
		panel_77.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_77 = new JLabel("18");
		panel_77.add(label_77);

		JLabel lblNewLabel_77 = new JLabel("    Ar");
		lblNewLabel_77.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_77.add(lblNewLabel_77);

		JLabel lblHydrogen_77 = new JLabel("         Argon");
		lblHydrogen_77.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_77.setAlignmentX(0.5f);
		panel_77.add(lblHydrogen_77);

		JPanel panel_78 = new JPanel();
		panel_78.setBackground(new Color(135, 206, 250));
		panel_78.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/34.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Se, panel_78);
			}
		});
		panel_78.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_78.setBounds(1281, 412, 75, 61);
		contentPane.add(panel_78);
		panel_78.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_78 = new JLabel("34");
		panel_78.add(label_78);

		JLabel lblNewLabel_78 = new JLabel("    Se");
		lblNewLabel_78.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_78.add(lblNewLabel_78);

		JLabel lblHydrogen_78 = new JLabel("     Selenium");
		lblHydrogen_78.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_78.setAlignmentX(0.5f);
		panel_78.add(lblHydrogen_78);

		JPanel panel_79 = new JPanel();
		panel_79.setBackground(new Color(240, 230, 140));
		panel_79.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/52.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Te, panel_79);
			}
		});
		panel_79.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_79.setBounds(1281, 475, 75, 61);
		contentPane.add(panel_79);
		panel_79.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_79 = new JLabel("52");
		panel_79.add(label_79);

		JLabel lblNewLabel_79 = new JLabel("    Te");
		lblNewLabel_79.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_79.add(lblNewLabel_79);

		JLabel lblHydrogen_79 = new JLabel("    Tellurium");
		lblHydrogen_79.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_79.setAlignmentX(0.5f);
		panel_79.add(lblHydrogen_79);

		JPanel panel_80 = new JPanel();
		panel_80.setBackground(new Color(240, 230, 140));
		panel_80.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/84.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Po, panel_80);
			}
		});
		panel_80.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_80.setBounds(1281, 538, 75, 61);
		contentPane.add(panel_80);
		panel_80.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_80 = new JLabel("        84");
		label_80.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_80.add(label_80);

		JLabel lblNewLabel_80 = new JLabel("    Po");
		lblNewLabel_80.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_80.add(lblNewLabel_80);

		JLabel lblHydrogen_80 = new JLabel("     Polonium");
		lblHydrogen_80.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_80.setAlignmentX(0.5f);
		panel_80.add(lblHydrogen_80);

		JPanel panel_81 = new JPanel();
		panel_81.setBackground(new Color(224, 255, 255));
		panel_81.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.H, panel_81);
			}
		});
		panel_81.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_81.setBounds(1281, 601, 75, 61);
		contentPane.add(panel_81);
		panel_81.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_81 = new JLabel("1");
		panel_81.add(label_81);

		JLabel lblNewLabel_81 = new JLabel("     H");
		lblNewLabel_81.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_81.add(lblNewLabel_81);

		JLabel lblHydrogen_81 = new JLabel("     Hydrogen");
		lblHydrogen_81.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_81.setAlignmentX(0.5f);
		panel_81.add(lblHydrogen_81);

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(154, 205, 50));
		panel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/9.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.F, panel_14);
			}
		});
		panel_14.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_14.setBounds(1358, 286, 75, 61);
		contentPane.add(panel_14);
		panel_14.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_14 = new JLabel("9");
		panel_14.add(label_14);

		JLabel lblNewLabel_14 = new JLabel("     F");
		lblNewLabel_14.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_14.add(lblNewLabel_14);

		JLabel lblHydrogen_14 = new JLabel("        Florine");
		lblHydrogen_14.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_14.setAlignmentX(0.5f);
		panel_14.add(lblHydrogen_14);

		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(240, 230, 140));
		panel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/14.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Si, panel_15);
			}
		});
		panel_15.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_15.setBounds(1127, 349, 75, 61);
		contentPane.add(panel_15);
		panel_15.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_15 = new JLabel("14");
		panel_15.add(label_15);

		JLabel lblNewLabel_15 = new JLabel("     Si");
		lblNewLabel_15.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_15.add(lblNewLabel_15);

		JLabel lblHydrogen_15 = new JLabel("         Silicon");
		lblHydrogen_15.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_15.setAlignmentX(0.5f);
		panel_15.add(lblHydrogen_15);

		JPanel panel_60 = new JPanel();
		panel_60.setBackground(new Color(154, 205, 50));
		panel_60.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/35.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Br, panel_60);
			}
		});
		panel_60.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_60.setBounds(1358, 412, 75, 61);
		contentPane.add(panel_60);
		panel_60.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_60 = new JLabel("35");
		panel_60.add(label_60);

		JLabel lblNewLabel_60 = new JLabel("    Br");
		lblNewLabel_60.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_60.add(lblNewLabel_60);

		JLabel lblHydrogen_60 = new JLabel("      Bromine");
		lblHydrogen_60.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_60.setAlignmentX(0.5f);
		panel_60.add(lblHydrogen_60);

		JPanel panel_61 = new JPanel();
		panel_61.setBackground(new Color(154, 205, 50));
		panel_61.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/53.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.I, panel_61);
			}
		});
		panel_61.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_61.setBounds(1358, 475, 75, 61);
		contentPane.add(panel_61);
		panel_61.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_61 = new JLabel("53");
		panel_61.add(label_61);

		JLabel lblNewLabel_61 = new JLabel("     I");
		lblNewLabel_61.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_61.add(lblNewLabel_61);

		JLabel lblHydrogen_61 = new JLabel("        Iodine");
		lblHydrogen_61.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_61.setAlignmentX(0.5f);
		panel_61.add(lblHydrogen_61);

		JPanel panel_82 = new JPanel();
		panel_82.setBackground(new Color(154, 205, 50));
		panel_82.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/85.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.At, panel_82);
			}
		});
		panel_82.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_82.setBounds(1358, 538, 75, 61);
		contentPane.add(panel_82);
		panel_82.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_82 = new JLabel("        85");
		label_82.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_82.add(label_82);

		JLabel lblNewLabel_82 = new JLabel("    At");
		lblNewLabel_82.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_82.add(lblNewLabel_82);

		JLabel lblHydrogen_82 = new JLabel("       Astatine");
		lblHydrogen_82.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_82.setAlignmentX(0.5f);
		panel_82.add(lblHydrogen_82);

		JPanel panel_83 = new JPanel();
		panel_83.setBackground(new Color(154, 205, 50));
		panel_83.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.H, panel_83);
			}
		});
		panel_83.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_83.setBounds(1358, 601, 75, 61);
		contentPane.add(panel_83);
		panel_83.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_83 = new JLabel("1");
		panel_83.add(label_83);

		JLabel lblNewLabel_83 = new JLabel("     H");
		lblNewLabel_83.setBackground(new Color(154, 205, 50));
		lblNewLabel_83.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_83.add(lblNewLabel_83);

		JLabel lblHydrogen_83 = new JLabel("     Hydrogen");
		lblHydrogen_83.setBackground(new Color(154, 205, 50));
		lblHydrogen_83.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_83.setAlignmentX(0.5f);
		panel_83.add(lblHydrogen_83);

		JPanel panel_84 = new JPanel();
		panel_84.setBackground(SystemColor.inactiveCaptionBorder);
		panel_84.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/10.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ne, panel_84);
			}
		});
		panel_84.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_84.setBounds(1435, 286, 75, 61);
		contentPane.add(panel_84);
		panel_84.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_84 = new JLabel("10");
		panel_84.add(label_84);

		JLabel lblNewLabel_84 = new JLabel("    Ne");
		lblNewLabel_84.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_84.add(lblNewLabel_84);

		JLabel lblHydrogen_84 = new JLabel("           Neon");
		lblHydrogen_84.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_84.setAlignmentX(0.5f);
		panel_84.add(lblHydrogen_84);

		JPanel panel_85 = new JPanel();
		panel_85.setBackground(new Color(224, 255, 255));
		panel_85.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/13.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Al, panel_85);
			}
		});
		panel_85.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_85.setBounds(1050, 349, 75, 61);
		contentPane.add(panel_85);
		panel_85.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_85 = new JLabel("13");
		panel_85.add(label_85);

		JLabel lblNewLabel_85 = new JLabel("    Al");
		lblNewLabel_85.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_85.add(lblNewLabel_85);

		JLabel lblHydrogen_85 = new JLabel("  Aluminium");
		lblHydrogen_85.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_85.setAlignmentX(0.5f);
		panel_85.add(lblHydrogen_85);

		JPanel panel_86 = new JPanel();
		panel_86.setBackground(SystemColor.inactiveCaptionBorder);
		panel_86.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/36.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Kr, panel_86);
			}
		});
		panel_86.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_86.setBounds(1435, 412, 75, 61);
		contentPane.add(panel_86);
		panel_86.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_86 = new JLabel("36");
		panel_86.add(label_86);

		JLabel lblNewLabel_86 = new JLabel("    Kr");
		lblNewLabel_86.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_86.add(lblNewLabel_86);

		JLabel lblHydrogen_86 = new JLabel("       Krypton");
		lblHydrogen_86.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_86.setAlignmentX(0.5f);
		panel_86.add(lblHydrogen_86);

		JPanel panel_87 = new JPanel();
		panel_87.setBackground(SystemColor.inactiveCaptionBorder);
		panel_87.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/54.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Xe, panel_87);
			}
		});
		panel_87.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_87.setBounds(1435, 475, 75, 61);
		contentPane.add(panel_87);
		panel_87.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_87 = new JLabel("54");
		panel_87.add(label_87);

		JLabel lblNewLabel_87 = new JLabel("    Xe");
		lblNewLabel_87.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_87.add(lblNewLabel_87);

		JLabel lblHydrogen_87 = new JLabel("          Xenon");
		lblHydrogen_87.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_87.setAlignmentX(0.5f);
		panel_87.add(lblHydrogen_87);

		JPanel panel_88 = new JPanel();
		panel_88.setBackground(SystemColor.inactiveCaptionBorder);
		panel_88.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/86.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Rn, panel_88);
			}
		});
		panel_88.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_88.setBounds(1435, 538, 75, 61);
		contentPane.add(panel_88);
		panel_88.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_88 = new JLabel("        86");
		label_88.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_88.add(label_88);

		JLabel lblNewLabel_88 = new JLabel("    Rn");
		lblNewLabel_88.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_88.add(lblNewLabel_88);

		JLabel lblHydrogen_88 = new JLabel("          Radon");
		lblHydrogen_88.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_88.setAlignmentX(0.5f);
		panel_88.add(lblHydrogen_88);

		JPanel panel_89 = new JPanel();
		panel_89.setBackground(SystemColor.inactiveCaptionBorder);
		panel_89.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.H, panel_89);
			}
		});
		panel_89.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_89.setBounds(1435, 601, 75, 61);
		contentPane.add(panel_89);
		panel_89.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_89 = new JLabel("1");
		panel_89.add(label_89);

		JLabel lblNewLabel_89 = new JLabel("     H");
		lblNewLabel_89.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_89.add(lblNewLabel_89);

		JLabel lblHydrogen_89 = new JLabel("     Hydrogen");
		lblHydrogen_89.setBackground(new Color(135, 206, 250));
		lblHydrogen_89.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_89.setAlignmentX(0.5f);
		panel_89.add(lblHydrogen_89);

		JPanel panel_90 = new JPanel();
		panel_90.setBackground(new Color(255, 0, 0));
		panel_90.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/58.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ce, panel_90);
			}
		});
		panel_90.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_90.setBounds(357, 685, 75, 61);
		contentPane.add(panel_90);
		panel_90.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_90 = new JLabel("58");
		panel_90.add(label_90);

		JLabel lblNewLabel_90 = new JLabel("    Ce");
		lblNewLabel_90.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_90.add(lblNewLabel_90);

		JLabel lblHydrogen_90 = new JLabel("       Cerium");
		lblHydrogen_90.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_90.setAlignmentX(0.5f);
		panel_90.add(lblHydrogen_90);

		JPanel panel_91 = new JPanel();
		panel_91.setBackground(new Color(255, 0, 0));
		panel_91.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/59.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Pr, panel_91);
			}
		});
		panel_91.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_91.setBounds(434, 685, 75, 61);
		contentPane.add(panel_91);
		panel_91.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_91 = new JLabel("59");
		panel_91.add(label_91);

		JLabel lblNewLabel_91 = new JLabel("    Pr");
		lblNewLabel_91.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_91.add(lblNewLabel_91);

		JLabel lblHydrogen_91 = new JLabel("  Praeseodymium");
		lblHydrogen_91.setFont(new Font("Georgia", Font.PLAIN, 8));
		lblHydrogen_91.setAlignmentX(0.5f);
		panel_91.add(lblHydrogen_91);

		JPanel panel_92 = new JPanel();
		panel_92.setBackground(new Color(255, 0, 0));
		panel_92.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/60.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Nd, panel_92);
			}
		});
		panel_92.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_92.setBounds(511, 685, 75, 61);
		contentPane.add(panel_92);
		panel_92.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_92 = new JLabel("60");
		panel_92.add(label_92);

		JLabel lblNewLabel_92 = new JLabel("    Nd");
		lblNewLabel_92.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_92.add(lblNewLabel_92);

		JLabel lblHydrogen_92 = new JLabel(" Neodymium");
		lblHydrogen_92.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_92.setAlignmentX(0.5f);
		panel_92.add(lblHydrogen_92);

		JPanel panel_93 = new JPanel();
		panel_93.setBackground(new Color(255, 0, 0));
		panel_93.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/61.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Pm, panel_93);
			}
		});
		panel_93.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_93.setBounds(588, 685, 75, 61);
		contentPane.add(panel_93);
		panel_93.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_93 = new JLabel("        61");
		label_93.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_93.add(label_93);

		JLabel lblNewLabel_93 = new JLabel("    Pm");
		lblNewLabel_93.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_93.add(lblNewLabel_93);

		JLabel lblHydrogen_93 = new JLabel(" Promethium");
		lblHydrogen_93.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_93.setAlignmentX(0.5f);
		panel_93.add(lblHydrogen_93);

		JPanel panel_94 = new JPanel();
		panel_94.setBackground(new Color(255, 0, 0));
		panel_94.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/62.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Sm, panel_94);
			}
		});
		panel_94.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_94.setBounds(665, 685, 75, 61);
		contentPane.add(panel_94);
		panel_94.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_94 = new JLabel("62");
		panel_94.add(label_94);

		JLabel lblNewLabel_94 = new JLabel("    Sm");
		lblNewLabel_94.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_94.add(lblNewLabel_94);

		JLabel lblHydrogen_94 = new JLabel("    Samarium");
		lblHydrogen_94.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_94.setAlignmentX(0.5f);
		panel_94.add(lblHydrogen_94);

		JPanel panel_95 = new JPanel();
		panel_95.setBackground(new Color(255, 0, 0));
		panel_95.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/63.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Eu, panel_95);
			}
		});
		panel_95.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_95.setBounds(742, 685, 75, 61);
		contentPane.add(panel_95);
		panel_95.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_95 = new JLabel("63");
		panel_95.add(label_95);

		JLabel lblNewLabel_95 = new JLabel("    Eu");
		lblNewLabel_95.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_95.add(lblNewLabel_95);

		JLabel lblHydrogen_95 = new JLabel("    Europium");
		lblHydrogen_95.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_95.setAlignmentX(0.5f);
		panel_95.add(lblHydrogen_95);

		JPanel panel_96 = new JPanel();
		panel_96.setBackground(new Color(255, 0, 0));
		panel_96.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/64.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Gd, panel_96);
			}
		});
		panel_96.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_96.setBounds(819, 685, 75, 61);
		contentPane.add(panel_96);
		panel_96.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_96 = new JLabel("64");
		panel_96.add(label_96);

		JLabel lblNewLabel_96 = new JLabel("    Gd");
		lblNewLabel_96.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_96.add(lblNewLabel_96);

		JLabel lblHydrogen_96 = new JLabel("  Gadolinium");
		lblHydrogen_96.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_96.setAlignmentX(0.5f);
		panel_96.add(lblHydrogen_96);

		JPanel panel_97 = new JPanel();
		panel_97.setBackground(new Color(255, 0, 0));
		panel_97.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/65.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Tb, panel_97);
			}
		});
		panel_97.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_97.setBounds(896, 685, 75, 61);
		contentPane.add(panel_97);
		panel_97.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_97 = new JLabel("65");
		panel_97.add(label_97);

		JLabel lblNewLabel_97 = new JLabel("    Tb");
		lblNewLabel_97.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_97.add(lblNewLabel_97);

		JLabel lblHydrogen_97 = new JLabel("      Terbium");
		lblHydrogen_97.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_97.setAlignmentX(0.5f);
		panel_97.add(lblHydrogen_97);

		JPanel panel_98 = new JPanel();
		panel_98.setBackground(new Color(255, 0, 0));
		panel_98.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/66.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Dy, panel_98);
			}
		});
		panel_98.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_98.setBounds(973, 685, 75, 61);
		contentPane.add(panel_98);
		panel_98.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_98 = new JLabel("66");
		panel_98.add(label_98);

		JLabel lblNewLabel_98 = new JLabel("    Dy");
		lblNewLabel_98.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_98.add(lblNewLabel_98);

		JLabel lblHydrogen_98 = new JLabel("  Dysprosium");
		lblHydrogen_98.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_98.setAlignmentX(0.5f);
		panel_98.add(lblHydrogen_98);

		JPanel panel_99 = new JPanel();
		panel_99.setBackground(new Color(255, 0, 0));
		panel_99.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/67.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Ho, panel_99);
			}
		});
		panel_99.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_99.setBounds(1050, 685, 75, 61);
		contentPane.add(panel_99);
		panel_99.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_99 = new JLabel("67");
		panel_99.add(label_99);

		JLabel lblNewLabel_99 = new JLabel("    Ho");
		lblNewLabel_99.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_99.add(lblNewLabel_99);

		JLabel lblHydrogen_99 = new JLabel("     Holmium");
		lblHydrogen_99.setBackground(new Color(255, 0, 0));
		lblHydrogen_99.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_99.setAlignmentX(0.5f);
		panel_99.add(lblHydrogen_99);

		JPanel panel_100 = new JPanel();
		panel_100.setBackground(new Color(255, 0, 0));
		panel_100.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/68.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Er, panel_100);
			}
		});
		panel_100.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_100.setBounds(1127, 685, 75, 61);
		contentPane.add(panel_100);
		panel_100.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_100 = new JLabel("68");
		panel_100.add(label_100);

		JLabel lblNewLabel_100 = new JLabel("    Er");
		lblNewLabel_100.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_100.add(lblNewLabel_100);

		JLabel lblHydrogen_100 = new JLabel("       Erbium");
		lblHydrogen_100.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_100.setAlignmentX(0.5f);
		panel_100.add(lblHydrogen_100);

		JPanel panel_101 = new JPanel();
		panel_101.setBackground(new Color(255, 0, 0));
		panel_101.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/69.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Tm, panel_101);
			}
		});
		panel_101.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_101.setBounds(1204, 685, 75, 61);
		contentPane.add(panel_101);
		panel_101.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_101 = new JLabel("69");
		panel_101.add(label_101);

		JLabel lblNewLabel_101 = new JLabel("    Tm");
		lblNewLabel_101.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_101.add(lblNewLabel_101);

		JLabel lblHydrogen_101 = new JLabel("      Thulium");
		lblHydrogen_101.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_101.setAlignmentX(0.5f);
		panel_101.add(lblHydrogen_101);

		JPanel panel_102 = new JPanel();
		panel_102.setBackground(new Color(255, 0, 0));
		panel_102.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/70.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Yb, panel_102);
			}
		});
		panel_102.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_102.setBounds(1281, 685, 75, 61);
		contentPane.add(panel_102);
		panel_102.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_102 = new JLabel("70");
		panel_102.add(label_102);

		JLabel lblNewLabel_102 = new JLabel("    Yb");
		lblNewLabel_102.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_102.add(lblNewLabel_102);

		JLabel lblHydrogen_102 = new JLabel("    Ytterbium");
		lblHydrogen_102.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_102.setAlignmentX(0.5f);
		panel_102.add(lblHydrogen_102);

		JPanel panel_103 = new JPanel();
		panel_103.setBackground(new Color(255, 0, 0));
		panel_103.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/71.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Lu, panel_103);
			}
		});
		panel_103.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_103.setBounds(1358, 685, 75, 61);
		contentPane.add(panel_103);
		panel_103.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_103 = new JLabel("71");
		panel_103.add(label_103);

		JLabel lblNewLabel_103 = new JLabel("    Lu");
		lblNewLabel_103.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_103.add(lblNewLabel_103);

		JLabel lblHydrogen_103 = new JLabel("     Lutetium");
		lblHydrogen_103.setBackground(new Color(255, 0, 0));
		lblHydrogen_103.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_103.setAlignmentX(0.5f);
		panel_103.add(lblHydrogen_103);

		JPanel panel_104 = new JPanel();
		panel_104.setBackground(new Color(255, 255, 0));
		panel_104.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/90.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Th, panel_104);
			}
		});
		panel_104.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_104.setBounds(357, 748, 75, 61);
		contentPane.add(panel_104);
		panel_104.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_104 = new JLabel("        90");
		label_104.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_104.add(label_104);

		JLabel lblNewLabel_104 = new JLabel("    Th");
		lblNewLabel_104.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_104.add(lblNewLabel_104);

		JLabel lblHydrogen_104 = new JLabel("      Thorium");
		lblHydrogen_104.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_104.setAlignmentX(0.5f);
		panel_104.add(lblHydrogen_104);

		JPanel panel_105 = new JPanel();
		panel_105.setBackground(new Color(255, 255, 0));
		panel_105.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/91.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Pa, panel_105);
			}
		});
		panel_105.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_105.setBounds(434, 748, 75, 61);
		contentPane.add(panel_105);
		panel_105.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_105 = new JLabel("        91");
		label_105.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_105.add(label_105);

		JLabel lblNewLabel_105 = new JLabel("    Pa");
		lblNewLabel_105.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_105.add(lblNewLabel_105);

		JLabel lblHydrogen_105 = new JLabel(" Protacinium");
		lblHydrogen_105.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_105.setAlignmentX(0.5f);
		panel_105.add(lblHydrogen_105);

		JPanel panel_106 = new JPanel();
		panel_106.setBackground(new Color(255, 255, 0));
		panel_106.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/92.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.U, panel_106);
			}
		});
		panel_106.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_106.setBounds(511, 748, 75, 61);
		contentPane.add(panel_106);
		panel_106.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_106 = new JLabel("        92");
		label_106.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_106.add(label_106);

		JLabel lblNewLabel_106 = new JLabel("     U");
		lblNewLabel_106.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_106.add(lblNewLabel_106);

		JLabel lblHydrogen_106 = new JLabel("     Uranium");
		lblHydrogen_106.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_106.setAlignmentX(0.5f);
		panel_106.add(lblHydrogen_106);

		JPanel panel_107 = new JPanel();
		panel_107.setBackground(new Color(255, 255, 0));
		panel_107.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/93.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Np, panel_107);
			}
		});
		panel_107.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_107.setBounds(588, 748, 75, 61);
		contentPane.add(panel_107);
		panel_107.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_107 = new JLabel("        93");
		label_107.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_107.add(label_107);

		JLabel lblNewLabel_107 = new JLabel("    Np");
		lblNewLabel_107.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_107.add(lblNewLabel_107);

		JLabel lblHydrogen_107 = new JLabel("  Neptunium");
		lblHydrogen_107.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_107.setAlignmentX(0.5f);
		panel_107.add(lblHydrogen_107);

		JPanel panel_108 = new JPanel();
		panel_108.setBackground(new Color(255, 255, 0));
		panel_108.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/94.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Pu, panel_108);
			}
		});
		panel_108.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_108.setBounds(665, 748, 75, 61);
		contentPane.add(panel_108);
		panel_108.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_108 = new JLabel("        94");
		label_108.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_108.add(label_108);

		JLabel lblNewLabel_108 = new JLabel("    Pu");
		lblNewLabel_108.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_108.add(lblNewLabel_108);

		JLabel lblHydrogen_108 = new JLabel("   Plutonium");
		lblHydrogen_108.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_108.setAlignmentX(0.5f);
		panel_108.add(lblHydrogen_108);

		JPanel panel_109 = new JPanel();
		panel_109.setBackground(new Color(255, 255, 0));
		panel_109.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/95.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Am, panel_109);
			}
		});
		panel_109.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_109.setBounds(742, 748, 75, 61);
		contentPane.add(panel_109);
		panel_109.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_109 = new JLabel("        95");
		label_109.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_109.add(label_109);

		JLabel lblNewLabel_109 = new JLabel("    Am");
		lblNewLabel_109.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_109.add(lblNewLabel_109);

		JLabel lblHydrogen_109 = new JLabel("  Americium");
		lblHydrogen_109.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_109.setAlignmentX(0.5f);
		panel_109.add(lblHydrogen_109);

		JPanel panel_110 = new JPanel();
		panel_110.setBackground(new Color(255, 255, 0));
		panel_110.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/96.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Cm, panel_110);
			}
		});
		panel_110.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_110.setBounds(819, 748, 75, 61);
		contentPane.add(panel_110);
		panel_110.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_110 = new JLabel("        96");
		label_110.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_110.add(label_110);

		JLabel lblNewLabel_110 = new JLabel("    Cm");
		lblNewLabel_110.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_110.add(lblNewLabel_110);

		JLabel lblHydrogen_110 = new JLabel("        Curium");
		lblHydrogen_110.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_110.setAlignmentX(0.5f);
		panel_110.add(lblHydrogen_110);

		JPanel panel_111 = new JPanel();
		panel_111.setBackground(new Color(255, 255, 0));
		panel_111.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/97.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Bk, panel_111);
			}
		});
		panel_111.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_111.setBounds(896, 748, 75, 61);
		contentPane.add(panel_111);
		panel_111.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_111 = new JLabel("        97");
		label_111.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_111.add(label_111);

		JLabel lblNewLabel_111 = new JLabel("    Bk");
		lblNewLabel_111.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_111.add(lblNewLabel_111);

		JLabel lblHydrogen_111 = new JLabel("    Berkelium");
		lblHydrogen_111.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_111.setAlignmentX(0.5f);
		panel_111.add(lblHydrogen_111);

		JPanel panel_112 = new JPanel();
		panel_112.setBackground(new Color(255, 255, 0));
		panel_112.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/98.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Cf, panel_112);
			}
		});
		panel_112.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_112.setBounds(973, 748, 75, 61);
		contentPane.add(panel_112);
		panel_112.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_112 = new JLabel("        98");
		label_112.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_112.add(label_112);

		JLabel lblNewLabel_112 = new JLabel("    Cf");
		lblNewLabel_112.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_112.add(lblNewLabel_112);

		JLabel lblHydrogen_112 = new JLabel(" Californium");
		lblHydrogen_112.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_112.setAlignmentX(0.5f);
		panel_112.add(lblHydrogen_112);

		JPanel panel_113 = new JPanel();
		panel_113.setBackground(new Color(255, 255, 0));
		panel_113.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/99.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Es, panel_113);
			}
		});
		panel_113.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_113.setBounds(1050, 748, 75, 61);
		contentPane.add(panel_113);
		panel_113.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_113 = new JLabel("        99");
		label_113.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_113.add(label_113);

		JLabel lblNewLabel_113 = new JLabel("    Es");
		lblNewLabel_113.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_113.add(lblNewLabel_113);

		JLabel lblHydrogen_113 = new JLabel(" Einsteinium");
		lblHydrogen_113.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_113.setAlignmentX(0.5f);
		panel_113.add(lblHydrogen_113);

		JPanel panel_114 = new JPanel();
		panel_114.setBackground(new Color(255, 255, 0));
		panel_114.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/100.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Fm, panel_114);
			}
		});
		panel_114.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_114.setBounds(1127, 748, 75, 61);
		contentPane.add(panel_114);
		panel_114.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_114 = new JLabel("      100");
		label_114.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_114.add(label_114);

		JLabel lblNewLabel_114 = new JLabel("    Fm");
		lblNewLabel_114.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_114.add(lblNewLabel_114);

		JLabel lblHydrogen_114 = new JLabel("     Fermium");
		lblHydrogen_114.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_114.setAlignmentX(0.5f);
		panel_114.add(lblHydrogen_114);

		JPanel panel_115 = new JPanel();
		panel_115.setBackground(new Color(255, 255, 0));
		panel_115.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/101.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Md, panel_115);
			}
		});
		panel_115.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_115.setBounds(1204, 748, 75, 61);
		contentPane.add(panel_115);
		panel_115.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_115 = new JLabel("      101");
		label_115.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_115.add(label_115);

		JLabel lblNewLabel_115 = new JLabel("    Md");
		lblNewLabel_115.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_115.add(lblNewLabel_115);

		JLabel lblHydrogen_115 = new JLabel(" Mendelevium");
		lblHydrogen_115.setFont(new Font("Georgia", Font.PLAIN, 9));
		lblHydrogen_115.setAlignmentX(0.5f);
		panel_115.add(lblHydrogen_115);

		JPanel panel_116 = new JPanel();
		panel_116.setBackground(new Color(255, 255, 0));
		panel_116.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/102.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.No, panel_116);
			}
		});
		panel_116.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_116.setBounds(1281, 748, 75, 61);
		contentPane.add(panel_116);
		panel_116.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_116 = new JLabel("      102");
		label_116.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_116.add(label_116);

		JLabel lblNewLabel_116 = new JLabel("    No");
		lblNewLabel_116.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_116.add(lblNewLabel_116);

		JLabel lblHydrogen_116 = new JLabel("     Nobelium");
		lblHydrogen_116.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_116.setAlignmentX(0.5f);
		panel_116.add(lblHydrogen_116);

		JPanel panel_117 = new JPanel();
		panel_117.setBackground(new Color(255, 255, 0));
		panel_117.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				display("resources/Elements/103.JPG");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				displayToolTip(Element.Lr, panel_117);
			}
		});
		panel_117.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				new EmptyBorder(2, 2, 2, 2)));
		panel_117.setBounds(1358, 748, 75, 61);
		contentPane.add(panel_117);
		panel_117.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel label_117 = new JLabel("      103");
		label_117.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-radioactive-16.png")));
		panel_117.add(label_117);

		JLabel lblNewLabel_117 = new JLabel("    Lr");
		lblNewLabel_117.setFont(new Font("Georgia", Font.BOLD, 20));
		panel_117.add(lblNewLabel_117);

		JLabel lblHydrogen_117 = new JLabel(" Lawrencium");
		lblHydrogen_117.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblHydrogen_117.setAlignmentX(0.5f);
		panel_117.add(lblHydrogen_117);
		
		JPanel downArrowPanel = new JPanel();
		downArrowPanel.setBackground(Color.WHITE);
		downArrowPanel.setBounds(280, 538, 75, 123);
		contentPane.add(downArrowPanel);
		downArrowPanel.setLayout(null);
		
		JLabel label_118 = new JLabel("");
		label_118.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-downward-arrow-50.png")));
		label_118.setBounds(0, 52, 75, 71);
		downArrowPanel.add(label_118);
		
		JPanel panel_119 = new JPanel();
		panel_119.setBounds(291, 13, 768, 61);
		contentPane.add(panel_119);
		
		JLabel lblNewLabel_121 = new JLabel("THE ELEMENTS");
		lblNewLabel_121.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		panel_119.add(lblNewLabel_121);
		
		JLabel lblNewLabel_118 = new JLabel("          1A");
		lblNewLabel_118.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118.setBounds(126, 207, 75, 16);
		contentPane.add(lblNewLabel_118);
		
		JLabel lblNewLabel_118_1 = new JLabel("          2A");
		lblNewLabel_118_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_1.setBounds(203, 268, 75, 16);
		contentPane.add(lblNewLabel_118_1);
		
		JLabel lblNewLabel_118_2 = new JLabel("          3B");
		lblNewLabel_118_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_2.setBounds(280, 394, 75, 16);
		contentPane.add(lblNewLabel_118_2);
		
		JLabel lblNewLabel_118_3 = new JLabel("          4B");
		lblNewLabel_118_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_3.setBounds(357, 394, 75, 16);
		contentPane.add(lblNewLabel_118_3);
		
		JLabel lblNewLabel_118_4 = new JLabel("          5B");
		lblNewLabel_118_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_4.setBounds(434, 394, 75, 16);
		contentPane.add(lblNewLabel_118_4);
		
		JLabel lblNewLabel_118_5 = new JLabel("          6B");
		lblNewLabel_118_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_5.setBounds(511, 394, 75, 16);
		contentPane.add(lblNewLabel_118_5);
		
		JLabel lblNewLabel_118_6 = new JLabel("          7B");
		lblNewLabel_118_6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_6.setBounds(588, 394, 75, 16);
		contentPane.add(lblNewLabel_118_6);
		
		JLabel lblNewLabel_118_7 = new JLabel("          8B");
		lblNewLabel_118_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_7.setBounds(742, 394, 75, 16);
		contentPane.add(lblNewLabel_118_7);
		
		JLabel lblNewLabel_118_10 = new JLabel("          1B");
		lblNewLabel_118_10.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_10.setBounds(896, 394, 75, 16);
		contentPane.add(lblNewLabel_118_10);
		
		JLabel lblNewLabel_118_11 = new JLabel("          2B");
		lblNewLabel_118_11.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_11.setBounds(973, 394, 75, 16);
		contentPane.add(lblNewLabel_118_11);
		
		JLabel lblNewLabel_118_12 = new JLabel("          3A");
		lblNewLabel_118_12.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_12.setBounds(1050, 268, 75, 16);
		contentPane.add(lblNewLabel_118_12);
		
		JLabel lblNewLabel_118_13 = new JLabel("          4A");
		lblNewLabel_118_13.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_13.setBounds(1127, 268, 75, 16);
		contentPane.add(lblNewLabel_118_13);
		
		JLabel lblNewLabel_118_14 = new JLabel("          5A");
		lblNewLabel_118_14.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_14.setBounds(1204, 268, 75, 16);
		contentPane.add(lblNewLabel_118_14);
		
		JLabel lblNewLabel_118_15 = new JLabel("          6A");
		lblNewLabel_118_15.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_15.setBounds(1281, 268, 75, 16);
		contentPane.add(lblNewLabel_118_15);
		
		JLabel lblNewLabel_118_16 = new JLabel("          7A");
		lblNewLabel_118_16.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_16.setBounds(1358, 268, 75, 16);
		contentPane.add(lblNewLabel_118_16);
		
		JLabel lblNewLabel_118_17 = new JLabel("          8A");
		lblNewLabel_118_17.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_118_17.setBounds(1435, 206, 75, 16);
		contentPane.add(lblNewLabel_118_17);
		
		JLabel lblNewLabel_119 = new JLabel("           1");
		lblNewLabel_119.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119.setBounds(126, 179, 75, 16);
		contentPane.add(lblNewLabel_119);
		
		JLabel lblNewLabel_119_1 = new JLabel("           2");
		lblNewLabel_119_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_1.setBounds(203, 239, 75, 16);
		contentPane.add(lblNewLabel_119_1);
		
		JLabel lblNewLabel_119_2 = new JLabel("           3");
		lblNewLabel_119_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_2.setBounds(279, 365, 75, 16);
		contentPane.add(lblNewLabel_119_2);
		
		JLabel lblNewLabel_119_3 = new JLabel("           4");
		lblNewLabel_119_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_3.setBounds(357, 365, 75, 16);
		contentPane.add(lblNewLabel_119_3);
		
		JLabel lblNewLabel_119_4 = new JLabel("           5");
		lblNewLabel_119_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_4.setBounds(434, 365, 75, 16);
		contentPane.add(lblNewLabel_119_4);
		
		JLabel lblNewLabel_119_5 = new JLabel("           6");
		lblNewLabel_119_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_5.setBounds(511, 365, 75, 16);
		contentPane.add(lblNewLabel_119_5);
		
		JLabel lblNewLabel_119_6 = new JLabel("           7");
		lblNewLabel_119_6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_6.setBounds(588, 365, 75, 16);
		contentPane.add(lblNewLabel_119_6);
		
		JLabel lblNewLabel_119_7 = new JLabel("           8");
		lblNewLabel_119_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_7.setBounds(665, 365, 75, 16);
		contentPane.add(lblNewLabel_119_7);
		
		JLabel lblNewLabel_119_8 = new JLabel("           9");
		lblNewLabel_119_8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_8.setBounds(742, 365, 75, 16);
		contentPane.add(lblNewLabel_119_8);
		
		JLabel lblNewLabel_119_9 = new JLabel("          10");
		lblNewLabel_119_9.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_9.setBounds(819, 365, 75, 16);
		contentPane.add(lblNewLabel_119_9);
		
		JLabel lblNewLabel_119_10 = new JLabel("          11");
		lblNewLabel_119_10.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_10.setBounds(896, 365, 75, 16);
		contentPane.add(lblNewLabel_119_10);
		
		JLabel lblNewLabel_119_11 = new JLabel("          12");
		lblNewLabel_119_11.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_11.setBounds(973, 365, 75, 16);
		contentPane.add(lblNewLabel_119_11);
		
		JLabel lblNewLabel_119_12 = new JLabel("          13");
		lblNewLabel_119_12.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_12.setBounds(1050, 239, 75, 16);
		contentPane.add(lblNewLabel_119_12);
		
		JLabel lblNewLabel_119_13 = new JLabel("          14");
		lblNewLabel_119_13.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_13.setBounds(1127, 239, 75, 16);
		contentPane.add(lblNewLabel_119_13);
		
		JLabel lblNewLabel_119_14 = new JLabel("          15");
		lblNewLabel_119_14.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_14.setBounds(1204, 239, 75, 16);
		contentPane.add(lblNewLabel_119_14);
		
		JLabel lblNewLabel_119_15 = new JLabel("          16");
		lblNewLabel_119_15.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_15.setBounds(1281, 239, 75, 16);
		contentPane.add(lblNewLabel_119_15);
		
		JLabel lblNewLabel_119_16 = new JLabel("          17");
		lblNewLabel_119_16.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_16.setBounds(1358, 239, 75, 16);
		contentPane.add(lblNewLabel_119_16);
		
		JLabel lblNewLabel_119_17 = new JLabel("          18");
		lblNewLabel_119_17.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_17.setBounds(1435, 179, 75, 16);
		contentPane.add(lblNewLabel_119_17);
		
		JLabel lblNewLabel_119_18 = new JLabel("LANTHANIDES");
		lblNewLabel_119_18.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_18.setBounds(126, 708, 142, 16);
		contentPane.add(lblNewLabel_119_18);
		
		JLabel lblNewLabel_119_19 = new JLabel("ACTINIDES");
		lblNewLabel_119_19.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_19.setBounds(148, 771, 120, 16);
		contentPane.add(lblNewLabel_119_19);
		
		JLabel lblNewLabel_119_20 = new JLabel("           1");
		lblNewLabel_119_20.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_20.setBounds(39, 250, 75, 16);
		contentPane.add(lblNewLabel_119_20);
		
		JLabel lblNewLabel_119_1_1 = new JLabel("           2");
		lblNewLabel_119_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_1_1.setBounds(39, 311, 75, 16);
		contentPane.add(lblNewLabel_119_1_1);
		
		JLabel lblNewLabel_119_2_1 = new JLabel("           3");
		lblNewLabel_119_2_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_2_1.setBounds(39, 375, 75, 16);
		contentPane.add(lblNewLabel_119_2_1);
		
		JLabel lblNewLabel_119_3_1 = new JLabel("           4");
		lblNewLabel_119_3_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_3_1.setBounds(39, 438, 75, 16);
		contentPane.add(lblNewLabel_119_3_1);
		
		JLabel lblNewLabel_119_4_1 = new JLabel("           5");
		lblNewLabel_119_4_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_4_1.setBounds(39, 499, 75, 16);
		contentPane.add(lblNewLabel_119_4_1);
		
		JLabel lblNewLabel_119_5_1 = new JLabel("           6");
		lblNewLabel_119_5_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_5_1.setBounds(39, 562, 75, 16);
		contentPane.add(lblNewLabel_119_5_1);
		
		JLabel lblNewLabel_119_6_1 = new JLabel("           7");
		lblNewLabel_119_6_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_119_6_1.setBounds(39, 624, 75, 16);
		contentPane.add(lblNewLabel_119_6_1);
		
		JLabel lblNewLabel_120 = new JLabel("");
		lblNewLabel_120.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-long-arrow-left-26.png")));
		lblNewLabel_120.setBounds(598, 331, 26, 16);
		contentPane.add(lblNewLabel_120);
		
		JLabel lblNewLabel_120_1 = new JLabel("");
		lblNewLabel_120_1.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-right-arrow-26.png")));
		lblNewLabel_120_1.setBounds(723, 331, 26, 16);
		contentPane.add(lblNewLabel_120_1);
		
		JLabel lblNewLabel_120_2 = new JLabel("'d' Block");
		lblNewLabel_120_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_120_2.setBounds(636, 331, 75, 16);
		contentPane.add(lblNewLabel_120_2);
		
		JLabel lblNewLabel_120_3 = new JLabel("");
		lblNewLabel_120_3.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-long-arrow-left-26.png")));
		lblNewLabel_120_3.setBounds(127, 148, 26, 16);
		contentPane.add(lblNewLabel_120_3);
		
		JLabel lblNewLabel_120_2_1 = new JLabel("'s' Block");
		lblNewLabel_120_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_120_2_1.setBounds(165, 148, 75, 16);
		contentPane.add(lblNewLabel_120_2_1);
		
		JLabel lblNewLabel_120_1_1 = new JLabel("");
		lblNewLabel_120_1_1.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-right-arrow-26.png")));
		lblNewLabel_120_1_1.setBounds(252, 148, 26, 16);
		contentPane.add(lblNewLabel_120_1_1);
		
		JLabel lblNewLabel_120_1_1_1 = new JLabel("");
		lblNewLabel_120_1_1_1.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-right-arrow-26.png")));
		lblNewLabel_120_1_1_1.setBounds(1304, 148, 26, 16);
		contentPane.add(lblNewLabel_120_1_1_1);
		
		JLabel lblNewLabel_120_2_1_1 = new JLabel("'p' Block");
		lblNewLabel_120_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_120_2_1_1.setBounds(1217, 148, 75, 16);
		contentPane.add(lblNewLabel_120_2_1_1);
		
		JLabel lblNewLabel_120_3_1 = new JLabel("");
		lblNewLabel_120_3_1.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-long-arrow-left-26.png")));
		lblNewLabel_120_3_1.setBounds(1179, 148, 26, 16);
		contentPane.add(lblNewLabel_120_3_1);
		
		JLabel lblNewLabel_120_1_1_2 = new JLabel("");
		lblNewLabel_120_1_1_2.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-right-arrow-26.png")));
		lblNewLabel_120_1_1_2.setBounds(741, 667, 26, 16);
		contentPane.add(lblNewLabel_120_1_1_2);
		
		JLabel lblNewLabel_120_2_1_2 = new JLabel("'f' Block");
		lblNewLabel_120_2_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_120_2_1_2.setBounds(654, 667, 75, 16);
		contentPane.add(lblNewLabel_120_2_1_2);
		
		JLabel lblNewLabel_120_3_2 = new JLabel("");
		lblNewLabel_120_3_2.setIcon(new ImageIcon(TheElements.class.getResource("/icon/icons8-long-arrow-left-26.png")));
		lblNewLabel_120_3_2.setBounds(616, 667, 26, 16);
		contentPane.add(lblNewLabel_120_3_2);
		setVisible(true);
	}
	
	protected void displayToolTip(Enum<Element> element, JPanel panel) {
		
		ToolTipManager.sharedInstance().setDismissDelay(30000);
		panel.setToolTipText(element.toString());
		
	}

	protected void display(String imagePath){
		ImageIcon image = new ImageIcon(imagePath);
		JOptionPane.showMessageDialog(null, image, "Display Image", JOptionPane.PLAIN_MESSAGE);
	}
}












