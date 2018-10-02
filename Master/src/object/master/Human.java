package object.master;

public class Human {
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	
	public Human() {
		this.stealth = this.intelligence = this.strength = 3;
		this.health = 100;
	}
	
	public void attack(Human human) {
		human.health -= this.health;
	}
	
	public void displayStatus() {
		System.out.println("Strength: " + this.strength);
		System.out.println("Stealth: " + this.stealth);
		System.out.println("Intelligence: " + this.intelligence);
		System.out.println("Health: " + this.health);
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}	
}
