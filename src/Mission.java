
public class Mission {
	
	private String missionName;
	private String description;
	private int reward;
	
	public Mission(String missionName, String description, int reward) {
		this.missionName = missionName;
		this.description = description;
		this.reward = reward;
	}
	
	public String getMissionName() {
		return missionName;
	}
	
	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getReward() {
		return reward;
	}
	
	public void setReward(int reward) {
		this.reward = reward;
	}

}
