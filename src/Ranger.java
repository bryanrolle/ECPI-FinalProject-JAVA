
public class Ranger extends Character { 
	
	private int accuracy;
	
	public Ranger(String name, int health, int energy, int accuracy) {
		super(name, health, energy);
		this.accuracy = accuracy;
	}
	
	public int getAccuracy() {
		return accuracy;
	}
	
	public void setAccuracy(int accuracy) {
		if (accuracy >= 0) {
			this.accuracy = accuracy;
		}
		
	}
	
	@Override
	public String getCharacterType() {
		return "Ranger";
	}
	
	@Override
	public String getSpecialAbility() {
		return "Precision Shot";
	}
}
