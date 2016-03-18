package se.mah.k3.af9530.bikes;

public class TestClass {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
//Adds a lot of bikes
			BikeStore.addBike(Constants.color[i], "20", "500");

		}
//Prints a lot of bikes
		System.out.println(BikeStore.getAllBikes());

	}

}
