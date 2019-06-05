package virtualpetsamok;

public class RobotPet extends VirtualPet {

	private int oilLevel;

	public RobotPet(String petName, String petType, int oilLevel, int happinessLevel, int healthLevel) {
		super(petName, petType, happinessLevel, healthLevel);
		this.oilLevel = oilLevel;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	public int oilEachPet() {
		return oilLevel = 100;
	}


}
