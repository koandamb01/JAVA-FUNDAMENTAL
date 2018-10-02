package object.master;

public class Samurai extends Human {
	private int numberOfSamurai = 0;
	public Samurai() {
		this.setHealth(200);
		this.numberOfSamurai++;
	}
	
	public void deathBlow(Human human) {
		System.out.println("Samurai just attack someone and now their health is 0!");
		human.setHealth(0);
		int health = this.getHealth();
		health = health / 2;
		this.setHealth(health);

	}
	
	public void meditate() {
		System.out.println("Samurai just mediate himself");
		this.setHealth(200);
	}
	
	public Integer howMany() {
		System.out.println("There are " + this.numberOfSamurai + "Samuraies");
		return this.numberOfSamurai;
	}
}