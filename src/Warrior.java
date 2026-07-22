
public class Warrior extends Character {
	
	private int strength;
	
	public Warrior(String name, int health, int energy, int strength) {
		super(name, health, energy);
		this.strength = strength;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		if (strength >= 0) {
			this.strength = strength;
		}
	}
	
	@Override
	public String getCharacterType() {
		return "Warrior";
	}
	
	@Override
	public String getSpecialAbility() {
		return "Power Strike";
	}
	
}
