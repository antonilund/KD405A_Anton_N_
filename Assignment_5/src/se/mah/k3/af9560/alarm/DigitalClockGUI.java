package se.mah.k3.af9560.alarm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.sql.Time;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.Color;
/**
 * 
 */
public class DigitalClockGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private static ClockLogic myClock; 
	//private static DigitalClockGUI gui; 
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private String timeNow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					DigitalClockGUI frame = new DigitalClockGUI();

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
	public DigitalClockGUI() {
		myClock = new ClockLogic(this);

		myClock.clockThread.start();
		
		//timeNow = myClock.getTime();
		
		setTitle("Alarm");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("/IMG/alarm icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel displayTime = new JLabel(myClock.getTime());//(timeNow);
//		displayTime.setEditable(false);
		displayTime.setFont(new Font("Blackoak Std", Font.PLAIN, 40));
//		displayTime.setText(myClock.getTime());
		displayTime.setBounds(40, 21, 369, 47);
		
		contentPane.add(displayTime);

		textField = new JTextField();
		textField.setBounds(147, 94, 35, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(102, 94, 35, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblAlarm = new JLabel("Alarm:");
		lblAlarm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAlarm.setBounds(49, 96, 46, 14);
		contentPane.add(lblAlarm);

		JButton btnSet = new JButton("Set!");
		btnSet.setBounds(192, 93, 53, 23);
		contentPane.add(btnSet);

		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(140, 94, 13, 20);
		contentPane.add(label);

		JLabel lblNextAlarmIs = new JLabel("Next alarm is:");
		lblNextAlarmIs.setForeground(Color.BLACK);
		lblNextAlarmIs.setBackground(Color.WHITE);
		lblNextAlarmIs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNextAlarmIs.setBounds(331, 79, 78, 14);
		contentPane.add(lblNextAlarmIs);

		JLabel label_1 = new JLabel(myClock.getAlarm());
		label_1.setForeground(Color.BLACK);
		label_1.setBackground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(363, 104, 46, 14);
		contentPane.add(label_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/IMG/clock-icon.gif")));
		lblNewLabel.setBounds(10, 33, 26, 20);
		contentPane.add(lblNewLabel);

		JToggleButton tglbtnOnoff = new JToggleButton("On/Off");
		tglbtnOnoff.setForeground(Color.BLACK);
		tglbtnOnoff.setBackground(Color.WHITE);
		tglbtnOnoff.setBounds(342, 148, 67, 23);
		contentPane.add(tglbtnOnoff);

		JLabel lblAlarmIs = new JLabel("Alarm is:");
		lblAlarmIs.setForeground(Color.BLACK);
		lblAlarmIs.setBackground(Color.WHITE);
		lblAlarmIs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAlarmIs.setBounds(356, 123, 53, 14);
		contentPane.add(lblAlarmIs);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/IMG/blue-clock-icon.png")));
		label_2.setBounds(86, 11, 272, 239);
		contentPane.add(label_2);
	
	}

	
	/**
	 * Sets the Alarm on or off*/
	public void activateAlarm(boolean activate) {
		//TODO 			displayTime.setText(myClock.getTime());
	}
	
		/**
		 * Prints the time to label*/
		public void setTimeOnLabel(String time) {
			 timeNow = time;
	}

}
