package virtualpetsamok;

public class RobotDog extends RobotPet implements WalkablePets {

	public RobotDog(String petName, String petType, int oilLevel, int happinessLevel, int healthLevel) {
		super(petName, petType, oilLevel, happinessLevel, healthLevel);

	}

	@Override
	public int walkDog() {
		return happinessLevel = 100;
	}

}
