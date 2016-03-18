package se.mah.k3.af9530.bikes;

import java.util.ArrayList;

public class BikeStore {
	private static String allBikes="";
	private static ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	/**Returns all bikes*/
	public static String getAllBikes(){
		for(Bike bike: bikes){
		 allBikes = allBikes +( bike.getColor()+"\n"+bike.getSize()+"\n"+bike.getPrice()+"\n"); 

		}
		return allBikes;
	}
	
	/** Creates a new Bike from String variables*/
	public static void addBike(String color, String size, String price){
		bikes.add(new Bike(color, Integer.parseInt(size), Integer.parseInt(price)));
		
		}
		
	}


