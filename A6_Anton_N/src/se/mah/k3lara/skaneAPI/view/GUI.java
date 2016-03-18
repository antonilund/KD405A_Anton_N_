package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ScrollPaneConstants;

public class GUI extends JFrame {

	/**
	 * 
	 * author: Anton Nilsson
	 * 
	 */
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextArea textAreaJourneys;
	private JTextArea textAreaStations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the GUI frame.
	 */

	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 219);
		contentPane.add(panel);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 37, 404, 178);

		textField = new JTextField();
		textField.setBounds(142, 6, 86, 20);
		textField.setToolTipText("S\u00F6k:");
		textField.setColumns(15);
		textField.setFocusable(true);

		textAreaStations = new JTextArea();
		textAreaStations.setEditable(false);
		scrollPane.setViewportView(textAreaStations);
		
		/**Visar listan över resor*/
		textAreaJourneys = new JTextArea();
		
		JButton btnSk = new JButton("SÖK");
		btnSk.setBounds(233, 5, 73, 23);
		btnSk.setToolTipText("Search");
		btnSk.setMultiClickThreshhold(3L);

		/**Den undre panelen*/
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 224, 424, 226);
		contentPane.add(panel_1);

		/** Sökfält "från"*/
		JLabel lblFromStation = new JLabel("Fr\u00E5n station:");
		lblFromStation.setBounds(14, 9, 110, 14);
		textField_1 = new JTextField();
		textField_1.setBounds(14, 24, 122, 20);
		textField_1.setColumns(10);

		/** Sökfält "Till"*/
		JLabel lblToStation = new JLabel("Till station:");
		lblToStation.setBounds(146, 9, 96, 14);
		textField_2 = new JTextField();
		textField_2.setBounds(146, 24, 128, 20);
		textField_2.setColumns(10);

		/**Sökfält antal resor*/
		JLabel lblAntalResultat = new JLabel("Antal resultat:");
		lblAntalResultat.setBounds(239, 9, 82, 14);
		
		textField_3 = new JTextField();
		textField_3.setText("5");
		textField_3.setBounds(284, 24, 29, 20);
		textField_3.setColumns(2);

		/** en dedikerad action för sökning av resor från en viss station
		 * 	The actionEvent to search 
		 */
		Action searchStationAction = new AbstractAction() { 
			public void actionPerformed(ActionEvent e) {
				
				textAreaStations.setText("Searching...");
				
				try {
					Thread t = new StationsThread();
					t.start();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		/** en dedikerad action för sökning av resor mellan stationer
		 * 	The actionEvent to search for Journeys
		 */
		Action searchJourney = new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					textAreaJourneys.setText("Searching...");
					Thread t = new SearchThread();
					t.start();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		textField_2.addActionListener(searchJourney);
		textField_3.addActionListener(searchJourney);

		textField.addActionListener(searchStationAction);
		textAreaStations.setText("\r\n  Stationer:\r\n");
		panel.setLayout(null);

		/** Rita upp GUI:t 
		 * Draw the GUI*/
		panel.add(btnSk);
		btnSk.addActionListener(searchStationAction);
		panel.add(textField);
		panel.add(scrollPane);

		JButton btnSkResa = new JButton("S\u00F6k resa");
		btnSkResa.setBounds(323, 24, 91, 23);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 47, 400, 179);

		panel_1.setLayout(null);

		panel_1.add(lblFromStation);
		panel_1.add(textField_1);
		panel_1.add(lblToStation);
		panel_1.add(textField_2);
		panel_1.add(lblAntalResultat);
		panel_1.add(textField_3);
		panel_1.add(btnSkResa);
		btnSkResa.addActionListener(searchJourney);

		panel_1.add(scrollPane_1);
		scrollPane_1.setViewportView(textAreaJourneys);

	}
/*Thread Class for search query**/
	public class StationsThread extends Thread {
		@Override
		public void run() {

			ArrayList<Station> searchStations = new ArrayList<Station>(); 
			searchStations.addAll(Parser.getStationsFromURL(textField.getText())); 
			textAreaStations.setText("Stationer: \n");
																		
			for (Station s : searchStations) {
				textAreaStations.append(s.getInfo());
				textAreaStations.setCaretPosition(0);

			}
		}
	}
	/*Thread Class for search query**/

	public class SearchThread extends Thread {
		@Override
		public void run() {
			int noOfRes = (Integer.parseInt(textField_3.getText()));
			String searchURL = Constants.getURL(textField_1.getText(), textField_2.getText(), noOfRes);
			Journeys journeys = Parser.getJourneys(searchURL);
			textAreaJourneys.setText("Kommande avgångar: \n");  
			{
				for (Journey journey : journeys.getJourneys()) {
					String depTime = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
							+ journey.getDepDateTime().get(Calendar.MINUTE);
					String arrTime = journey.getArrDateTime().get(Calendar.HOUR_OF_DAY) + ":"
							+ journey.getArrDateTime().get(Calendar.MINUTE);
					textAreaJourneys.append(journey.getInfo(depTime, arrTime));
					textAreaJourneys.setCaretPosition(0);

				}
			}
		}

	}

}
