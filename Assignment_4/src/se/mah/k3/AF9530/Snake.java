package se.mah.k3.AF9530;

public class Snake extends Animal {

	private boolean poisonous;
	
	

	public Snake(boolean poisonous, String latinName) {
		super(latinName);
		poisonous = isPoisonous();
		
	}
	
	public boolean isPoisonous() {
		return poisonous;
	}
	public String isItPoisonous() {
		if(poisonous == true){
		return "is poisonous";
		}
		else{
			return "is totally harmless";
		}
	}

	
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
