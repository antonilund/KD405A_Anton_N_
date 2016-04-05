package se.mah.k3.AF9530;

public class Cat extends Mammal {

	private static final String latinName= "Cat";
	private static final int gestationTime = 1; 

	private int numberOfLives = 9;
	
	public Cat(int numberOfLives) {
		super(latinName, gestationTime);
		super.setFriendlyName("Nameless");
	}

	@Override
	public String getInfo() {
		String s = ("Namn: "+ super.getFriendlyName()+"\nIs a: Cat (Latin: "+super.getLatinName()
		+")\nNurses for: "+super.getGestationTime()+" months.\n"+("Remaining Lives: ")+getNumberOfLives());
		return s;
	}

	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}



}
