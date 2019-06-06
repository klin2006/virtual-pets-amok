package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter virtualPetShelter = new VirtualPetShelter();

	@Test
	public void shouldBeAbleToAddVirtualPet() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		virtualPetShelter.addVirtualPet(organicDog);
		Collection<VirtualPet> check = virtualPetShelter.getAllVirtualPets();
		assertThat(check, contains(organicDog));
	}

	@Test
	public void shouldBeAbleToAddOrganicDogandRobotPet() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		RobotDog robotPet = new RobotDog("Robbie", "Robotic Pet", 15, 20, 25);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.addVirtualPet(robotPet);
		Collection<VirtualPet> check = virtualPetShelter.getAllVirtualPets();
		assertThat(check, contains(organicDog, robotPet));
	}

	@Test
	public void shouldBeAbleToAdoptVirtualPet() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.adoptVirtualPet(organicDog);
		VirtualPet check = virtualPetShelter.findVirtualPet(organicDog.getPetName());
//		Collection<VirtualPet> check = virtualPetShelter.getAllVirtualPets();
		assertThat(check, is(nullValue()));
	}

	@Test
	public void playWithAllPetsReturns30PlusHappiness() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		RobotDog robotDog = new RobotDog("Robbie", "Robotic Pet", 15, 20, 25);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.addVirtualPet(robotDog);
		virtualPetShelter.playWithAllPets();
		int happyDog = organicDog.getHappinessLevel();
		int happyRobot = robotDog.getHappinessLevel();
		assertEquals(50, happyDog);
		assertEquals(50, happyRobot);

	}

	@Test
	public void waterOrganicPetsReturn0Thirst() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		OrganicCat organicCat = new OrganicCat("Kitty", "Organic Cat", 5, 10, 15, 20, 15);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.addVirtualPet(organicCat);
		virtualPetShelter.waterAllOrganicPets();
		int thirstyDog = organicDog.getThirstLevel();
		int thirstyCat = organicCat.getThirstLevel();
		assertEquals(0, thirstyDog);
		assertEquals(0, thirstyCat);

	}

	@Test
	public void feedOrganicPetsReturn0Hunger() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		OrganicCat organicCat = new OrganicCat("Kitty", "Organic Cat", 5, 10, 15, 20, 15);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.addVirtualPet(organicCat);
		virtualPetShelter.feedAllOrganicPets();
		int hungryDog = organicDog.getHungerLevel();
		int hungryCat = organicCat.getHungerLevel();
		assertEquals(0, hungryDog);
		assertEquals(0, hungryCat);
	}

	@Test
	public void cleanAllDogCagesReturnsWaste0ForOrganicDogs() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		OrganicCat organicCat = new OrganicCat("Kitty", "Organic Cat", 5, 10, 15, 20, 15);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.addVirtualPet(organicCat);
		virtualPetShelter.cleanAllDogCages();
		int dirtyDog = organicDog.getWasteLevel();
		int dirtyCat = organicCat.getWasteLevel();
		assertEquals(0, dirtyDog);
		assertEquals(15, dirtyCat);
	}

	@Test
	public void cleanLitterBoxWaste0ForOrganicCats() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		OrganicCat organicCat = new OrganicCat("Kitty", "Organic Cat", 5, 10, 15, 20, 15);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.addVirtualPet(organicCat);
		virtualPetShelter.cleanLitterBox();
		int dirtyDog = organicDog.getWasteLevel();
		int dirtyCat = organicCat.getWasteLevel();
		assertEquals(15, dirtyDog);
		assertEquals(0, dirtyCat);
	}

	@Test
	public void oilAllRobotPetsOilLevelGoesTo100() {
		RobotPet robotDog = new RobotDog("Robbie", "Robot Dog", 5, 10, 15);
		RobotPet robotCat = new RobotCat("Ritzy", "Robot Cat", 15, 20, 15);
		virtualPetShelter.addVirtualPet(robotDog);
		virtualPetShelter.addVirtualPet(robotCat);
		virtualPetShelter.oilAllRobotPets();
		int oilyDog = robotDog.getOilLevel();
		int oilyCat = robotCat.getOilLevel();
		assertEquals(100, oilyDog);
		assertEquals(100, oilyCat);
	}

	@Test
	public void walkAllDogsMakesHappinessGoUp20() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		RobotPet robotDog = new RobotDog("Robbie", "Robot Dog", 5, 10, 15);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.addVirtualPet(robotDog);
		virtualPetShelter.walkAllDogs();
		int organicWalk = organicDog.getHappinessLevel();
		int robotWalk = robotDog.getHappinessLevel();
		assertEquals(40, organicWalk);
		assertEquals(30, robotWalk);

	}

	@Test
	public void walkOneDogMakesWasteGoTo0() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.findVirtualPet("Doggy");
		virtualPetShelter.walkOneDog("Doggy", 15);
		assertThat(organicDog.getWasteLevel(), is(0));
	}

	@Test
	public void feedOneOrganicPetMakesHungerGoTo0() {
		OrganicPet organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.findVirtualPet("Doggy");
		virtualPetShelter.feedOneOrganicPet("Doggy", 5);
		assertThat(organicDog.getHungerLevel(), is(0));
	}

	@Test
	public void waterOneOrganicPetMakesThirstGoTo0() {
		OrganicPet organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.findVirtualPet("Doggy");
		virtualPetShelter.waterOneOrganicPet("Doggy", 10);
		assertThat(organicDog.getThirstLevel(), is(0));
	}

	@Test
	public void cleanOneCageMakesWasteGoTo0() {
		OrganicPet organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.findVirtualPet("Doggy");
		virtualPetShelter.cleanOneCage("Doggy", 15);
		assertThat(organicDog.getWasteLevel(), is(0));

	}
	
	@Test
	public void oilOneRobotMakesOilGoTo100() {
		RobotPet robotDog = new RobotDog("Robbie", "Robot Dog", 5, 10, 15);
		virtualPetShelter.addVirtualPet(robotDog);
		virtualPetShelter.findVirtualPet("Robbie");
		virtualPetShelter.oilOneRobot("Robbie", 5);
		assertThat(robotDog.getOilLevel(), is(100));

	}
	
	@Test
	public void playWithOnePetMakesHappinessGoUp30() {
		RobotPet robotDog = new RobotDog("Robbie", "Robot Dog", 5, 10, 15);
		virtualPetShelter.addVirtualPet(robotDog);
		virtualPetShelter.findVirtualPet("Robbie");
		virtualPetShelter.playWithOnePet("Robbie", 10);
		assertThat(robotDog.getHappinessLevel(), is(40));
	}
	
	@Test
	public void tickIncreases5WasteForOrganicPets() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		OrganicCat organicCat = new OrganicCat("Kitty", "Organic Cat", 25, 30, 35, 30, 35);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.addVirtualPet(organicCat);
		virtualPetShelter.tick();
		int tickDog = organicDog.getWasteLevel();
		int tickCat = organicCat.getWasteLevel();
		assertEquals(20, tickDog);
		assertEquals(40, tickCat);
		
	}
	
	@Test
	public void tickDecreases5OilForRobotPets() {
		RobotPet robotDog = new RobotDog("Robbie", "Robot Dog", 0, 10, 25);
		RobotPet robotCat = new RobotCat("Ritzy", "Robot Cat", 15, 20, 25);
		virtualPetShelter.addVirtualPet(robotDog);
		virtualPetShelter.addVirtualPet(robotCat);
		virtualPetShelter.tick();
		int oilyDog = robotDog.getOilLevel();
		int oilyCat = robotCat.getOilLevel();
		assertEquals(0, oilyDog);
		assertEquals(10, oilyCat);
	}
	
	@Test
	public void healthShouldDecrease5ifWasteIsBelow80() {
	OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
	virtualPetShelter.addVirtualPet(organicDog);
	virtualPetShelter.tick();
	assertThat(organicDog.getHealthLevel(), is(20));
	}
	
	@Test
	public void healthShouldDecrease5ifOilIsBelow15() {
	RobotPet robotDog = new RobotDog("Robbie", "Robot Dog", 10, 10, 25);
	virtualPetShelter.addVirtualPet(robotDog);
	virtualPetShelter.tick();
	assertThat(robotDog.getHealthLevel(), is(20));
	}

}
