package virtualpetsamok;

public class OrganicCat extends OrganicPet {

	private int happy = 20;
	private int health = 30;

	public OrganicCat(String petName, String petType, int hungerLevel, int thirstLevel, int wasteLevel,
			int happinessLevel, int healthLevel) {
		super(petName, petType, hungerLevel, thirstLevel, wasteLevel, happinessLevel, healthLevel);

	}

	public void cleanLitter() {
		if (getHappinessLevel() + happy < 100) {
			happinessLevel += happy;
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

}
