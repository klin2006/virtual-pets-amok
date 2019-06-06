package virtualpetsamok;

public class OrganicDog extends OrganicPet implements WalkablePets {

	private int happy = 20;
	private int health = 30;

	public OrganicDog(String petName, String petType, int hungerLevel, int thirstLevel, int wasteLevel,
			int happinessLevel, int healthLevel) {
		super(petName, petType, hungerLevel, thirstLevel, wasteLevel, happinessLevel, healthLevel);
	}

	public void cleanEachCage() {
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

	@Override
	public void walkDog() {

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
