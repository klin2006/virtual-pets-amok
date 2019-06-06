package virtualpetsamok;

public class RobotPet extends VirtualPet implements Tick{

	private int happy = 30;
	private int health = 30;
	private int tick = 5;
	private int oilLevel;

	public RobotPet(String petName, String petType, int oilLevel, int happinessLevel, int healthLevel) {
		super(petName, petType, happinessLevel, healthLevel);
		this.oilLevel = oilLevel;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	public void oilEachPet() {
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
		oilLevel = 100;
	}

	@Override
	public void tick() {
		if (getOilLevel () - tick > 0) {
			oilLevel -= tick;
		}
		else {
			oilLevel = 0;
					
		}	
	if (oilLevel < 15 || happinessLevel < 25 && healthLevel >0) {
		healthLevel -= tick;
	}
	}
}
