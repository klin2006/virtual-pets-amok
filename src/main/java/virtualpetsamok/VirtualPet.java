package virtualpetsamok;

public class VirtualPet {

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

	public int playWithEachPet() {
		return happinessLevel = 100;
	}

}