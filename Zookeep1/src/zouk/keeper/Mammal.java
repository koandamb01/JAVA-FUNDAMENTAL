package zouk.keeper;

public class Mammal {
	public int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public Integer displayEnergy() {
		System.out.println("This animal current enery is: " + this.energyLevel);
		return this.energyLevel;
	}
	
}
