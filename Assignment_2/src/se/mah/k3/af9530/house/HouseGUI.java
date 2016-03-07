package se.mah.k3.af9530.house;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		

		House house1 = new House(1940, 10); //Skapa 3 nya hus
		House house2 = new House(1900, 1000);
		House house3 = new House(2010, 1700);
		

		String h1=("Hus 1 Byggår: "+house1.getYearBuilt()+" Area: "+house1.getSize()+" kvm"); //Gör strängar av varje objekt,
		String h2=("Hus 2 Byggår: "+house2.getYearBuilt()+" Area: "+house2.getSize()+" kvm");
		String h3=("Hus 3 Byggår: "+house3.getYearBuilt()+" Area: "+house3.getSize()+" kvm");
		
		System.out.println(h1); //Skriv till console
		System.out.println(h2);
		System.out.println(h3);
		
		textArea.append("\n Uppgift 1.2 \n"); //Skriv ut i GUI
		textArea.append(h1+"\n");
		textArea.append(h2+"\n");
		textArea.append(h3+"\n");
		
		House[] kvarter = new House[10]; //Skapa en Array av House
		kvarter[0] = new House(2015, 200);
		kvarter[1] = new House(2014, 210);
		kvarter[2] = new House(2013, 220);
		kvarter[3] = new House(2012, 230);
		kvarter[4] = new House(2011, 240);
		kvarter[5] = new House(2010, 250);
		kvarter[6] = new House(2009, 260);
		kvarter[7] = new House(2008, 270);
		kvarter[8] = new House(2007, 280);
		kvarter[9] = new House(2006, 290);

		textArea.append("\n Uppgift 1.3 \n");

		for(int i = 0; i < kvarter.length; i++) //Loopa igenom Arrayen och skriv ut i GUI
		{
			textArea.append("Hus " +(i+1) +" Byggår: "+kvarter[i].getYearBuilt()+" Area: "+kvarter[i].getSize()+" kvm \n");
		}
		
		ArrayList<House> bostadsOmr = new ArrayList<House>(); //Skapa en tom ArrayList av House
		
		Random rand = new Random(); //Skapa ett slumpat nummer

		textArea.append("\n Uppgift 1.4 \n");

		for(int i = 0; i < 100; i++) //Loopa och lägg till objekt i en ArrayList. Skriv ut i GUI.
		{
			int year = rand.nextInt(215) + 1800;
			int area = rand.nextInt(980) + 20;
			bostadsOmr.add(new House(year, area));
			textArea.append("Hus " +(i+1) +" Byggår: " +bostadsOmr.get(i).getYearBuilt() +" Area: " +bostadsOmr.get(i).getSize()+" kvm \n"); 
		}
				
	}
}

