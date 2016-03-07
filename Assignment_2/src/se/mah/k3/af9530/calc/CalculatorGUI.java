package se.mah.k3.af9530.calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Font;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Calculator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.shadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		myCalculator = new Calculator();

		textField = new JTextField();
		textField.setFont(new Font("Levenim MT", Font.BOLD, 22));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(35, 11, 375, 53);
		textField.setText("");
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				textField.setText(textField.getText()+"1");
				myCalculator.numberButtonPressed(1);
			}
		});
		btn_1.setBounds(35, 75, 89, 23);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				textField.setText(textField.getText()+"2");
				myCalculator.numberButtonPressed(2);
			}
		});
		btn_2.setBounds(173, 75, 89, 23);
		contentPane.add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg3) {
				textField.setText(textField.getText()+"3");
				myCalculator.numberButtonPressed(3);
			}
		});
		btn_3.setBounds(321, 75, 89, 23);
		contentPane.add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg4) {
				textField.setText(textField.getText()+"4");
				myCalculator.numberButtonPressed(4);
			}
		});
		btn_4.setBounds(35, 109, 89, 23);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg5) {
				textField.setText(textField.getText()+"5");
				myCalculator.numberButtonPressed(5);
			}
		});
		btn_5.setBounds(173, 109, 89, 23);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg6) {
				textField.setText(textField.getText()+"6");
				myCalculator.numberButtonPressed(6);
			}
		});
		btn_6.setBounds(321, 109, 89, 23);
		contentPane.add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg7) {
				textField.setText(textField.getText()+"7");
				myCalculator.numberButtonPressed(7);
			}
		});
		btn_7.setBounds(35, 143, 89, 23);
		contentPane.add(btn_7);
				
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg8) {
				textField.setText(textField.getText()+"8");
				myCalculator.numberButtonPressed(8);
			}
		});
		btn_8.setBounds(173, 143, 89, 23);
		contentPane.add(btn_8);

		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg9) {
				textField.setText(textField.getText()+"9");
				myCalculator.numberButtonPressed(9);
			}
		});
		btn_9.setBounds(321, 143, 89, 23);
		contentPane.add(btn_9);

		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"0");
				myCalculator.numberButtonPressed(0);
			}
		});
		btn_0.setBounds(173, 177, 89, 23);
		contentPane.add(btn_0);

//Plusknapp
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg10) {
				myCalculator.plus();
				double d = myCalculator.getResult();
				textField.setText(String.valueOf(d).replace(".0", "")+ " + ");
			}
		});
		btnAdd.setBounds(35, 211, 95, 39);
		contentPane.add(btnAdd);
				
//Minusknapp
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg11) {
				myCalculator.minus();
				double d = myCalculator.getResult();
				textField.setText(String.valueOf(d).replace(".0", "")+ " - ");
			}
		});
		btnSub.setBounds(140, 211, 84, 39);
		contentPane.add(btnSub);
		
//Gångerknapp
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg12) {
				
				myCalculator.mult();
				double d = myCalculator.getResult();
				textField.setText(String.valueOf(d).replace(".0", "")+ "×");
			}
		});
		btnMult.setBounds(234, 211, 84, 39);
		contentPane.add(btnMult);
		
//Divisionsknapp		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg13) {

			myCalculator.div();
			double d = myCalculator.getResult();
			textField.setText(String.valueOf(d).replace(".0", "")+"÷");
		}
	});
		btnDiv.setBounds(326, 211, 84, 39);
		contentPane.add(btnDiv);
		
//Rensa (C)		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg19) {
				myCalculator.clear();
				textField.setText("");
			}
		});
		btnC.setBounds(35, 177, 89, 23);
		contentPane.add(btnC);

//Lika-med
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg20) {
				myCalculator.equals();
				double d = myCalculator.getResult();
				textField.setText(String.valueOf(d).replace(".0", ""));
			}
			
		});
		btnEquals.setBounds(321, 177, 89, 23);
		contentPane.add(btnEquals);
		
//Gör en siffra av texten (helt onödig funktion här..)
		if(!textField.getText().isEmpty()){
		String s = textField.getText();
		System.out.print(s);

		}
	}
}
