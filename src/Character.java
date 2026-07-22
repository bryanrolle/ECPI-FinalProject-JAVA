
public class Character {
	
	private String name;
	private int health;
	private int energy;
	private int xp;
	private int gold;
	
	public Character(String name, int health, int energy) {
		this.name = name;
		this.health = health;
		this.energy = energy;
		this.xp = 0;
		this.gold = 0;
	}
	
	public void earnReward(int xpEarned, int goldEarned) {
		
		xp += xpEarned;
		gold += goldEarned;
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
	
	public int getXp() {
		return xp;
	}
	
	public void setXp(int xp) {
		this.xp = xp;
	}
	
	public int getGold() {
		return gold;
	}
	
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	

}
