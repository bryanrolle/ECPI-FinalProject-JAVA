
public class Mage extends Character {
	
	private int magicPower;
	
	public Mage(String name, int health, int energy, int magicPower) {
		super(name, health, energy);
		this.magicPower = magicPower;
	}
	
	public int getMagicPower() {
		return magicPower;
	}
	
	public void setMagicPower(int magicPower) {
		if (magicPower >= 0) {
			this.magicPower = magicPower;
		}
		
	}
	
	@Override
	public String getCharacterType() {
		return "Mage";
	}
	
	@Override
	public String getSpecialAbility() {
		return "Fireball";
	}
	
}
