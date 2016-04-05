package se.mah.k3.AF9530;

public abstract class Animal {
	
	private String latinName;
	private String friendlyName;

	public Animal(String latinName) {
		this.latinName = latinName;
	}
	
	public void setFriendlyName(String name){
		this.friendlyName = name;
	}
	
	public String getFriendlyName(){
		return this.friendlyName;
	}
	
	public String getLatinName() {
		return latinName;
	}

	public abstract String getInfo();

}
