package zouk.keeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("The Gorila just throw something!");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The Gorila is eating bananas!");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The Gorila is has a climbed a tree!");
		this.energyLevel -= 10;
	}

}
