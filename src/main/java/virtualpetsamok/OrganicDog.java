package virtualpetsamok;

public class OrganicDog extends OrganicPet implements WalkablePets  {

	public OrganicDog(String petName, String petType, int hungerLevel, int thirstLevel, int wasteLevel,
			int happinessLevel, int healthLevel) {
		super(petName, petType, hungerLevel, thirstLevel, wasteLevel, happinessLevel, healthLevel);
	}

	public int cleanEachCage() {
		return wasteLevel = 0;
	}

	@Override
	public int walkDog() {
		return wasteLevel = 0;
	}

		
}  

