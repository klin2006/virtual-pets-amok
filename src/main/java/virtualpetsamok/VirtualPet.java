package virtualpetsamok;

public class VirtualPet {
	private int happyPlay = 30;
	private int healthPlay = 15;
	protected String petName;
	protected String petType;
	protected int happinessLevel;
	protected int healthLevel;

	public VirtualPet(String petName, String petType, int happinessLevel, int healthLevel) {
		this.petName = petName;
		this.petType = petType;
		this.happinessLevel = happinessLevel;
		this.healthLevel = healthLevel;
		
	}

	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public int getHappinessLevel() {
		return happinessLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void playWithEachPet() {
		if (getHappinessLevel() + happyPlay < 100) {
			happinessLevel += happyPlay;
		} else {
			happinessLevel = 100;
		}

		if (getHealthLevel() + healthPlay < 100){
			healthLevel += healthPlay;
		} else {
			healthLevel = 100;
		}
		
		
	}

}