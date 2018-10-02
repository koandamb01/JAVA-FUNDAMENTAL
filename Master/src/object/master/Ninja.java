package object.master;

public class Ninja extends Human {
	public Ninja() {
		this.setStealth(10);
	}
	
	public void steal(Human human) {
		System.out.println("Ninja just someone health");
		int health = this.getHealth();
		health += human.getHealth();
		this.setHealth(health);
	}
	
	public void runAway() {
		System.out.println("Ninja is running away!");
		int health = this.getHealth();
		health -= 10;
		this.setHealth(health);
	}
}
