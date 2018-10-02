package zouk.keeper;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("The Bat is flying!");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("So- well, never mind!");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("The bat is attacking a whole town damn!");
		this.energyLevel += 100;
	}
}
