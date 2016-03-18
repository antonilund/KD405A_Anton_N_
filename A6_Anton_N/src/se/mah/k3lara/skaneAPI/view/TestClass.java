package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;
import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class TestClass {

	public static void main(String[] args) {
		String searchURL = Constants.getURL("80000", "81216", 20); // Denna
																	// metod
																	// h�mtar
																	// s�kstr�ngen
																	// f�r resa
																	// fr�n
																	// Malm�
																	// till
																	// Lund, med
																	// 20
																	// resultat
																	// //Malm� C
																	// = 80000,
																	// Lund C,
																	// 81216
																	// Malm�
																	// Gatorg
																	// 80100,
																	// H�ssleholm
																	// C 93070

		System.out.println(searchURL);
		System.out.println("// Results when searching:");

		Journeys journeys = Parser.getJourneys(searchURL); // Denna g�r om infon
															// fr�n XML taggarna
															// vi s�kt fram i
															// seachURL ovan
															// till Strings och
															// andra datatyper
															// vi kan anv�nda i
															// Java.
		for (Journey journey : journeys.getJourneys()) {
			// System.out.println(journey.getInfo()+" \n ");
			System.out.print(journey.getStartStation() + " - ");
			System.out.print(journey.getEndStation());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
					+ journey.getDepDateTime().get(Calendar.MINUTE);
			System.out.println(" Departs " + time + " that is in " + journey.getTimeToDeparture()
					+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");
		}

		 System.out.println(" // Stations when searching for stations containing \"Malm\" ");
		 ArrayList<Station> searchStations = new ArrayList<Station>();
		 //skapar en ny ArrayList f�r Stationer som b�rjar med "Malm"
		 
		 searchStations.addAll(Parser.getStationsFromURL("Malm")); 
		 //l�gger till alla s�kresultat i den ArrayList som just skapats
		 for (Station s: searchStations){
		 System.out.println(s.getStationName() +" number:"
		 +s.getStationNbr());
		 }
		
		 //S�ker efter avg�ngar fr�n en viss station
		 System.out.println("// Busses departing from Ub�tshallen stationsnummer 80046 ");
		 Lines lines = Parser.getStationResults(new Station("80046"));
		 for (Line l : lines.getLines()) {
		 System.out.println("Line " + l.getLine() +" departs:"
		 +l.getDepTime().get(Calendar.HOUR_OF_DAY)+":"+l.getDepTime().get(Calendar.MINUTE)+
		 " and is "+l.getDepTimeDeviation()+" minutes late");
		 }
	}
}