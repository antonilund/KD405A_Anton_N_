package se.mah.k3.AF9530;

public abstract class Mammal extends Animal {
	
	private int gestationTime;

	public Mammal(String latinName, int gestationTime) {
		super(latinName);		
		this.gestationTime = gestationTime;
	}
	
	/**
	 * @param latinName
	 */
	public Mammal(String latinName) {
		super(latinName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setGestationTime(int g){
		gestationTime=g;
	}
	
	public int getGestationTime(){
		return 	gestationTime;
	}	
 
}
