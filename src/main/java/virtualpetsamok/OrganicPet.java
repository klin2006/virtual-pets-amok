package virtualpetsamok;

public abstract class OrganicPet extends VirtualPet {

	protected int hungerLevel;
	protected int thirstLevel;
	protected int wasteLevel;
	public OrganicPet(String petName, String petType, int hungerLevel, int thirstLevel, int wasteLevel, int happinessLevel, int healthLevel) {
		super(petName,  petType, happinessLevel, healthLevel);
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.wasteLevel = wasteLevel;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public int cleanDogCage() {
		return wasteLevel = 0;
	}

	public int waterEachPet() {
		return thirstLevel = 0;
	}

	public int feedEachPet() {
		return hungerLevel = 0;
	}

}