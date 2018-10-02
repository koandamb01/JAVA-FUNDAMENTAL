package object.master;

public class Wizard extends Human {
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human human) {
		int health = human.getHealth();
		health += this.getIntelligence();
		human.setHealth(health);
	}
	
	public void fireball(Human human) {
		int health = human.getHealth();
		health -= (this.getIntelligence() * 3);
		human.setHealth(health);
	}	
}
