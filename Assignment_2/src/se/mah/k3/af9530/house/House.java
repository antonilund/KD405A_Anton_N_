package se.mah.k3.af9530.house;

public class House {
	private int yearBuilt;
	private int size;
	private final static int minSize = 10;
	private final static int maxSize = 1000;
	private final static int minYear = 1800;
	private final static int maxYear = 2015;

	public House(int yearBuilt, int size) {
		this.size = size;
		this.yearBuilt = yearBuilt;
	}

	public int getYearBuilt(){
		if(yearBuilt<=maxYear && yearBuilt>=minYear){
			return this.yearBuilt;
		}
		else{
			return 0;
		}
	}
	
	public int getSize(){
		if(size<=maxSize && size>=minSize){
			return this.size;
	}
		else{
			return 0;
		}
	}
}
