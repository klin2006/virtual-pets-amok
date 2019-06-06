package virtualpetsamok;

public class OrganicPet extends VirtualPet implements Tick {
	private int happyClean = 20;
	private int health = 30;
	private int happyThirst = 15;
	private int tick = 5;
	private int happyFood = 25;
	protected int hungerLevel;
	protected int thirstLevel;
	protected int wasteLevel;
	

	public OrganicPet(String petName, String petType, int hungerLevel, int thirstLevel, int wasteLevel,
			int happinessLevel, int healthLevel) {
		super(petName, petType, happinessLevel, healthLevel);
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

	public void cleanDogCage() {
		if (getHappinessLevel() + happyClean < 100) {
			happinessLevel += happyClean;
		} else {
			happinessLevel = 100;
		}

		if (getHealthLevel() + health < 100) {
			healthLevel += health;
		} else {
			healthLevel = 100;
		}

		wasteLevel = 0;
	}

	public void waterEachPet() {
		if (getHappinessLevel() + happyThirst < 100) {
			happinessLevel += happyThirst;
		} else {
			happinessLevel = 100;
		}

		if (getHealthLevel() + health < 100) {
			healthLevel += health;
		} else {
			healthLevel = 100;
		}

		thirstLevel = 0;
	}

	public void feedEachPet() {
		if (getHappinessLevel() + happyFood < 100) {
			happinessLevel += happyFood;
		} else {
			happinessLevel = 100;
		}

		if (getHealthLevel() + health < 100) {
			healthLevel += health;
		} else {
			healthLevel = 100;
		}

		hungerLevel = 0;
	}

	@Override
	public void tick() {
		if (getWasteLevel () + tick < 100) {
			wasteLevel += tick;
		}
		else {
			wasteLevel = 100;
		}

	if (wasteLevel < 80 || hungerLevel < 85 || thirstLevel < 90 || happinessLevel < 25 && healthLevel > 0) {
		healthLevel -= tick;
	}
	}

}