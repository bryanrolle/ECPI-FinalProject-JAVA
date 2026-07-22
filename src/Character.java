
public class Character {
	
	private String name;
	private int health;
	private int energy;
	
	public Character(String name, int health, int energy) {
		this.name = name;
		this.health = health;
		this.energy = energy;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		if (health >= 0) {
			this.health = health;
		}
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		if (energy >= 0) {
			this.energy = energy;
		}
	}
	
	public String getCharacterType() {
		return "Basic Character";
	}
	
	public String getSpecialAbility() {
		return "No special ability";
	}

}
