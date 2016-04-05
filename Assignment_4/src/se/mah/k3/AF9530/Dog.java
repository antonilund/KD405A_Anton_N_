package se.mah.k3.AF9530;

public class Dog extends Mammal {
	
	private static final String latinName= "Canis Latranas";
	private static final int gestationTime = 3; 

	private boolean stupid=true;



	public Dog(String friendlyName) {
		super(latinName, gestationTime);
		super.setGestationTime(gestationTime);
		super.setFriendlyName(friendlyName);

}
	
	public Dog(String friendlyName, boolean stupid) {
		super(latinName, gestationTime);
		super.setFriendlyName(friendlyName);
		super.getGestationTime();

		}

	public boolean isStupid(){
		return stupid;
	}
	public String isItStupid() {
		if(stupid == true){
		return " is unfortunately pretty dumb";
		}
		else{
			return " is a clever boy!";
		}
	}
	public String getInfo() {
		
		String s = ("Namn: "+ super.getFriendlyName()+"\nIs a: Dog (Latin: "+super.getLatinName()
		+")\nNurses for: "+super.getGestationTime()+" months.\n"+getFriendlyName()+isItStupid());
		return s;
		
	}

	
}
