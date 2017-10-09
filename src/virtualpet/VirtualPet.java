package virtualpet;

public class VirtualPet {
	//instance data
	private int hunger;
	private int waste;
	private int boredom;
	private int tiredness;
	
	//constructor
	public VirtualPet (int hunger, int waste, int boredom, int tiredness) {
		this.hunger = hunger;
		this.waste = waste;
		this.boredom= boredom;
		this.tiredness = tiredness;
	}
	
	//Accessor method (getter)
	public int getHunger() {
		return hunger;
	}
	public int getWaste() {
		return waste;
	}
	public int getBoredom() {
		return boredom;
	}
	public int getTiredness() {
		return tiredness;
	}
	
	//tick() method
	public void feed(int tiger) {
		hunger-= tiger;
		waste+= tiger;
	}
	public void bathroom(int tiger) {
		waste-=tiger;
	}
	public void play(int tiger) {
		boredom-=tiger;
		tiredness+=tiger;
		hunger+=tiger;
	}
	public void sleep(int tiger) {
		tiredness-=tiger;
		hunger+=tiger;
	}
	
	
	public String gameStats() {
		return "Timothy the Tiger's game stats are now: \n"
				+ "Hunger: " + hunger + " \nWaste: " 
				+ waste + " \nBoredom: " + boredom + " \nTiredness: " 
				+ tiredness;
	
	
	}
	
		
}
	
