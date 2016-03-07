package se.mah.k3.af9530.members;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Component;
import javax.swing.JTextField;

public class Members extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtTraktorvgen;
	private JTextField txtLund;
	private JTextField textField_3;
	private JTextField txtJensahotbrevcom;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Members frame = new Members();
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
	public Members() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Arkiv = new JMenu("Arkiv");
		menuBar.add(Arkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		Arkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		Arkiv.add(mntmAvsluta);
		
		JMenu mnNewMenu_1 = new JMenu("Medlemmar");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnNewMenu_1.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnNewMenu_1.add(mntmHittaMedlem);
		
		JMenu mnNewMenu_2 = new JMenu("Hj\u00E4lp");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnNewMenu_2.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnNewMenu_2.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMedlemsregister = new JLabel("Medlemsregister");
		lblMedlemsregister.setBounds(164, 11, 334, 82);
		lblMedlemsregister.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMedlemsregister.setForeground(Color.WHITE);
		contentPane.add(lblMedlemsregister);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 149, 144, 233);
		scrollPane_1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		scrollPane_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(scrollPane_1);
		String[] values = new String[] {"Abdullah, Mohammed", "Bertilsson, Eva", "Corrie, Maj", "Danielsson, Kicki", "Elofsson, J\u00F6rgen", "Fredriksson, Teddy", "Gustavsson, Ulf", "Heimersson, Stig", "Håkansson, Jens", "Ivarsson, Bengt", "J\u00F6nsson, Jons", "Karlsson, Bert", "Lind, Bjarne"};

		table_1 = new JTable();
		table_1.setColumnSelectionAllowed(true);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Abdullah, Mohammed"},
				{"Bertilsson, Eva"},
				{"Corrie, Maj"},
				{"Danielsson, Kicki"},
				{"Elofsson, J\u00F6rgen"},
				{"Fredriksson, Teddy"},
				{"Gustavsson, Ulf"},
				{"Heimersson, Stig"},
				{"H\u00E5kansson, Jens"},
				{"Ivarsson, Bengt"},
				{"J\u00F6nsson, Jons"},
				{"Karlsson, Bert"},
				{"Lind, Bjarne"},
			},
			new String[] {
				"Medlemmar 2016"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(70);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblSkklogo = new JLabel("");
		lblSkklogo.setBounds(10, 11, 144, 116);
		lblSkklogo.setIcon(new ImageIcon(Members.class.getResource("/IMG/skk_logo.gif")));
		lblSkklogo.setToolTipText("skk_logo");
		contentPane.add(lblSkklogo);
		
		JLabel profilePic = new JLabel("");
		profilePic.setBounds(386, 147, 46, 46);
		contentPane.add(profilePic);
		profilePic.setVerticalAlignment(SwingConstants.TOP);
		profilePic.setToolTipText("Profilbild");
		profilePic.setIcon(new ImageIcon(Members.class.getResource("/IMG/photo.jpg")));
		
		JTextPane Namn = new JTextPane();
		Namn.setBounds(237, 165, 139, 28);
		Namn.setToolTipText("Namn");
		Namn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Namn.setText("Jens H\u00E5kansson");
		contentPane.add(Namn);
		
		textField = new JTextField();
		textField.setText("19850522-1234");
		textField.setBounds(237, 204, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtTraktorvgen = new JTextField();
		txtTraktorvgen.setText("Traktorv\u00E4gen 2");
		txtTraktorvgen.setBounds(237, 235, 139, 20);
		contentPane.add(txtTraktorvgen);
		txtTraktorvgen.setColumns(10);
		
		txtLund = new JTextField();
		txtLund.setText("225 45 LUND");
		txtLund.setBounds(237, 266, 139, 20);
		contentPane.add(txtLund);
		txtLund.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("0707-265 98 56");
		textField_3.setBounds(237, 297, 139, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		txtJensahotbrevcom = new JTextField();
		txtJensahotbrevcom.setText("jensa@hotbrev.com");
		txtJensahotbrevcom.setBounds(237, 328, 139, 20);
		contentPane.add(txtJensahotbrevcom);
		txtJensahotbrevcom.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(287, 359, 89, 23);
		contentPane.add(btnSpara);
		
		JLabel lblPersonnr = new JLabel("Personnr:");
		lblPersonnr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPersonnr.setForeground(Color.WHITE);
		lblPersonnr.setBounds(164, 207, 63, 17);
		contentPane.add(lblPersonnr);
		
		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setForeground(Color.WHITE);
		lblNamn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNamn.setBounds(164, 165, 63, 28);
		contentPane.add(lblNamn);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdress.setForeground(Color.WHITE);
		lblAdress.setBounds(164, 238, 63, 14);
		contentPane.add(lblAdress);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefon.setForeground(Color.WHITE);
		lblTelefon.setBounds(164, 300, 63, 14);
		contentPane.add(lblTelefon);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(164, 331, 63, 14);
		contentPane.add(lblEmail);
	}
}
