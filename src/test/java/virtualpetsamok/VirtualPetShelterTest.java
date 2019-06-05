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
	public void shouldBeAbleToRemoveVirtualPet() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.removeVirtualPet(organicDog);
		VirtualPet check = virtualPetShelter.findVirtualPet(organicDog.getPetName());
//		Collection<VirtualPet> check = virtualPetShelter.getAllVirtualPets();
		assertThat(check, is(nullValue()));
	}

	@Test
	public void playWithAllPetsReturns100Happiness() {
		OrganicDog organicDog = new OrganicDog("Doggy", "Organic Dog", 5, 10, 15, 20, 25);
		RobotDog robotDog = new RobotDog("Robbie", "Robotic Pet", 15, 20, 25);
		virtualPetShelter.addVirtualPet(organicDog);
		virtualPetShelter.addVirtualPet(robotDog);
		virtualPetShelter.playWithAllPets();
		int happyDog = organicDog.getHappinessLevel();
		int happyRobot = robotDog.getHappinessLevel();
		assertEquals(100, happyDog);
		assertEquals(100, happyRobot);

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

}
