package se.mah.k3.af9530;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;

public class Main<Medlemmar> extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField txtUlfGustavsson;
	private JTextField txtLasdjf;
	private JTextField txtUffeluffegmailcom;
	private JTextField textField_1;
	private JTextField txtTraktorvgen;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv Ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlemmar = new JMenu("Medlemmar");
		menuBar.add(mnMedlemmar);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlemmar.add(mntmNyMedlem);
		
		JMenuItem mntmMedlemmar = new JMenuItem("Medlemmar");
		mnMedlemmar.add(mntmMedlemmar);
		
		JMenu Hjälp = new JMenu("Hj\u00E4lp");
		menuBar.add(Hjälp);
		
		JMenuItem mntmOm = new JMenuItem("Om");
		Hjälp.add(mntmOm);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		Hjälp.add(mntmHjlp);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("135px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("338px:grow"),},
			new RowSpec[] {
				RowSpec.decode("80px:grow"),
				RowSpec.decode("max(5dlu;default)"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("max(234px;default):grow"),}));
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Main.class.getResource("/se/mah/k3/af9530/Img/skk_logo.gif")));
		contentPane.add(label, "1, 1, 2, 1, left, top");
		
		JTextPane txtpnMedlemsregister = new JTextPane();
		txtpnMedlemsregister.setBackground(UIManager.getColor("ColorChooser.background"));
		txtpnMedlemsregister.setFont(new Font("Meiryo UI", Font.BOLD, 22));
		txtpnMedlemsregister.setText("Medlemsregister");
		contentPane.add(txtpnMedlemsregister, "3, 1, center, center");
		
		Component verticalGlue = Box.createVerticalGlue();
		contentPane.add(verticalGlue, "1, 2");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane_2, "1, 4, fill, fill");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		scrollPane_2.setViewportView(panel);
		
		JList<Medlemmar> list = new JList<Medlemmar>();
		list.setFont(new Font("Meiryo UI", Font.PLAIN, 11));
		list.setBackground(Color.LIGHT_GRAY);
		list.setModel(new AbstractListModel() {
			/**
			 * d
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"Abdullah, Mohammed", "Bertilsson, Eva", "Corrie, Maj", "Danielsson, Kicki", "Elofsson, J\u00F6rgen", "Fredriksson, Teddy", "Gustavsson, Ulf", "Heimersson, Stig", "Ivarsson, Bengt", "J\u00F6nsson, Jons", "Karlsson, Bert", "Lind, Bjarne"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(list);
		
		table = new JTable();
		panel.add(table);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		scrollPane_2.setColumnHeaderView(verticalStrut);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane_1, "3, 4, fill, fill");
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setRowHeaderView(panel_1);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("129px:grow"),
				ColumnSpec.decode("128px:grow"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("111px:grow"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("-52px"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),}));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "1, 2, right, fill");
		
		JLabel lblProfilbild = new JLabel("");
		lblProfilbild.setToolTipText("Profilbild");
		lblProfilbild.setVerticalAlignment(SwingConstants.BOTTOM);
		lblProfilbild.setIcon(new ImageIcon(Main.class.getResource("/se/mah/k3/af9530/Img/photo.jpg")));
		panel_2.add(lblProfilbild);
		
		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setFont(new Font("Meiryo UI", Font.BOLD, 15));
		panel_1.add(lblNamn, "1, 4, left, center");
		
		txtUlfGustavsson = new JTextField();
		txtUlfGustavsson.setFont(new Font("Meiryo UI", Font.PLAIN, 14));
		txtUlfGustavsson.setText("Ulf Gustavsson");
		panel_1.add(txtUlfGustavsson, "2, 4, left, top");
		txtUlfGustavsson.setColumns(10);
		
		JLabel lblPerssonnummer = new JLabel("Personnummer:");
		lblPerssonnummer.setFont(new Font("Meiryo UI", Font.BOLD, 15));
		lblPerssonnummer.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblPerssonnummer, "1, 6, left, default");
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Meiryo UI", Font.PLAIN, 14));
		textField_1.setText("19751025-1658");
		panel_1.add(textField_1, "2, 6, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Adress:");
		lblNewLabel.setFont(new Font("Meiryo UI", Font.BOLD, 15));
		panel_1.add(lblNewLabel, "1, 8, left, default");
		
		txtTraktorvgen = new JTextField();
		txtTraktorvgen.setFont(new Font("Meiryo UI", Font.PLAIN, 14));
		txtTraktorvgen.setText("Traktorv\u00E4gen 9");
		panel_1.add(txtTraktorvgen, "2, 8, fill, default");
		txtTraktorvgen.setColumns(10);
		
		JLabel lblAdress = new JLabel("Adress 2:");
		lblAdress.setFont(new Font("Meiryo UI", Font.BOLD, 15));
		panel_1.add(lblAdress, "1, 10, left, default");
		
		txtLasdjf = new JTextField();
		txtLasdjf.setFont(new Font("Meiryo UI", Font.PLAIN, 14));
		txtLasdjf.setText("245 95, Lund");
		panel_1.add(txtLasdjf, "2, 10, fill, default");
		txtLasdjf.setColumns(10);
		
		JLabel lblEpost = new JLabel("E-post:");
		lblEpost.setFont(new Font("Meiryo UI", Font.BOLD, 15));
		panel_1.add(lblEpost, "1, 12, left, default");
		
		txtUffeluffegmailcom = new JTextField();
		txtUffeluffegmailcom.setFont(new Font("Meiryo UI", Font.PLAIN, 14));
		txtUffeluffegmailcom.setText("uffe.luffe@gmail.com");
		panel_1.add(txtUffeluffegmailcom, "2, 12, fill, default");
		txtUffeluffegmailcom.setColumns(10);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setFont(new Font("Meiryo UI", Font.BOLD, 15));
		panel_1.add(lblTelefon, "1, 14, left, default");
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Meiryo UI", Font.PLAIN, 14));
		textField_3.setText("0707-265 98 56");
		panel_1.add(textField_3, "2, 14, fill, default");
		textField_3.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSpara.setFont(new Font("Meiryo UI", Font.PLAIN, 14));
		panel_1.add(btnSpara, "2, 16, fill, fill");
		
		table_1 = new JTable();
		table_1.setFont(new Font("Narkisim", Font.PLAIN, 14));
		panel_1.add(table_1, "2, 18, left, center");
	}

}
