package virtualpetsamok;

public class RobotDog extends RobotPet implements WalkablePets {

	private int happy = 20;
	private int health = 30;

	public RobotDog(String petName, String petType, int oilLevel, int happinessLevel, int healthLevel) {
		super(petName, petType, oilLevel, happinessLevel, healthLevel);

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
	}
}
