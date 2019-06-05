package virtualpetsamok;

public class OrganicCat extends OrganicPet {

	public OrganicCat(String petName, String petType, int hungerLevel, int thirstLevel, int wasteLevel,
			int happinessLevel, int healthLevel) {
		super(petName, petType, hungerLevel, thirstLevel, wasteLevel, happinessLevel, healthLevel);
	
	
	}

	public int cleanLitter() {
		return wasteLevel = 0;
	}

		
	
}
