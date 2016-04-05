package se.mah.k3.af9560.alarm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlarmSet extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AlarmSet dialog = new AlarmSet();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AlarmSet() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "AlarmClock Says:", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(165, 42, 42)));
			panel.setBounds(101, 37, 232, 68);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JTextPane txtpnItsTime = new JTextPane();
				txtpnItsTime.setForeground(Color.WHITE);
				txtpnItsTime.setEditable(false);
				txtpnItsTime.setCaretColor(Color.RED);
				txtpnItsTime.setBounds(10, 26, 212, 31);
				panel.add(txtpnItsTime);
				txtpnItsTime.setBackground(Color.RED);
				txtpnItsTime.setFont(new Font("Wide Latin", Font.PLAIN, 24));
				txtpnItsTime.setText("It's Time!");
			}
		}
		{
			JLabel label = new JLabel("");
			label.setMaximumSize(new Dimension(150, 150));
			label.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(10, 11, 414, 217);
			label.setIcon(new ImageIcon(AlarmSet.class.getResource("/IMG/Melting Clock 02.jpg")));
			contentPanel.add(label);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("RESET");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
