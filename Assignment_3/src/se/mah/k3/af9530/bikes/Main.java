package se.mah.k3.af9530.bikes;

import java.util.ArrayList;
import java.util.Random;
/**Klassen Main innehåller testmetoder för Bike*/
public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		/**Här skapas listan av cyklar */
		ArrayList<Bike> myBikes = new ArrayList<Bike>(); //new ArrayList of Bike elements
		
		for(int i=0; i<10; i++){
		int inches = rand.nextInt((Constants.MAX_SIZE)-(Constants.MIN_SIZE))+(Constants.MIN_SIZE);
		int pesos = rand.nextInt(Constants.MAX_PRICE);
		myBikes.add(new Bike(Constants.color[i], inches, pesos));

		}
		/**Så här kunde en gjort*/
//		for(Bike bike : myBikes){
//			System.out.println(bike.getColor());
//			System.out.println(bike.getSize());
//			System.out.println(bike.getPrice());		
//		}
		/**Här printas listan av cyklar ut*/
	for(int i=0; i<myBikes.size(); i++){
		System.out.println("Cykel " +(i+1) +" \nStorlek: " +myBikes.get(i).getSize() +" tum\nPris: " +myBikes.get(i).getPrice()+" kr \n"); 

	}
	}

}
