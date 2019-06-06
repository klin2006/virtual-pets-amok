package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> virtualPets = new HashMap<>();

	public void addVirtualPet(VirtualPet virtualPet) {
		virtualPets.put(virtualPet.getPetName(), virtualPet);

	}

	public Collection<VirtualPet> getAllVirtualPets() {
		return virtualPets.values();
	}

	public void adoptVirtualPet(VirtualPet virtualPet) {
		virtualPets.remove(virtualPet.getPetName(), virtualPet);
	}

	public VirtualPet findVirtualPet(String petName) {
		return virtualPets.get(petName);
	}

	public void playWithAllPets() {
		System.out.println("You play will all of the pets.");
		System.out.println("      |      |");
		System.out.println("      |      |");
		System.out.println("------|------|------");
		System.out.println("      |      |");
		System.out.println("      |      |");
		System.out.println("------|------|------");
		System.out.println("      |      |");
		System.out.println("      |      |");
		for (VirtualPet eachPet : virtualPets.values()) {
			eachPet.playWithEachPet();
		}
	}

	public void waterAllOrganicPets() {
		System.out.println("You water all the live pets.");
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof OrganicPet) {
				((OrganicPet) eachPet).waterEachPet();
			}
		}
	}

	public void feedAllOrganicPets() {
		System.out.println("You feed all the live pets.");
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof OrganicPet) {
				((OrganicPet) eachPet).feedEachPet();
			}
		}
	}

	public void cleanAllDogCages() {
		System.out.println("You clean all the dog cages.");
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof OrganicDog) {
				((OrganicDog) eachPet).cleanEachCage();
			}
		}
	}

	public void cleanLitterBox() {
		System.out.println("You clean the litter box.");
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof OrganicCat) {
				((OrganicCat) eachPet).cleanLitter();
			}
		}
	}

	public void oilAllRobotPets() {
		System.out.println("You oil all the robotic pets.");
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof RobotPet) {
				((RobotPet) eachPet).oilEachPet();
			}
		}
	}

	public void walkAllDogs() {
		System.out.println("You walk all the dogs.");
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof WalkablePets) {
				((WalkablePets) eachPet).walkDog();
			}
		}
	}

	public void walkOneDog(String petName, int waste) {
		VirtualPet walkDog = findVirtualPet(petName);
		if (walkDog instanceof WalkablePets) {
			((WalkablePets) walkDog).walkDog();
		}
	}

	public void feedOneOrganicPet(String petName, int hunger) {
		VirtualPet feedPet = findVirtualPet(petName);
		if (feedPet instanceof OrganicPet) {
			((OrganicPet) feedPet).feedEachPet();
		}
	}

	public void waterOneOrganicPet(String petName, int thirst) {
		VirtualPet waterPet = findVirtualPet(petName);
		if (waterPet instanceof OrganicPet) {
			((OrganicPet) waterPet).waterEachPet();
		}
	}

	public void cleanOneCage(String petName, int waste) {
		VirtualPet cleanCage = findVirtualPet(petName);
		if (cleanCage instanceof OrganicDog) {
			((OrganicDog) cleanCage).cleanDogCage();
		}
	}

	public void oilOneRobot(String petName, int oil) {
		VirtualPet oilRobot = findVirtualPet(petName);
		if (oilRobot instanceof RobotPet) {
			((RobotPet) oilRobot).oilEachPet();
		}

	}

	public void playWithOnePet(String petName, int play) {
		VirtualPet playPet = findVirtualPet(petName);
		playPet.playWithEachPet();
	}

	public void tick() {
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof Tick) {
				((Tick) eachPet).tick();
			}
		}
	}

	public void menu() {
		System.out.println("***********************");
		System.out.println("What would you like to do in the coop?");
		System.out.println("Press 1 to Check pets' stats");
		System.out.println("Press 2 to Feed the live pets");
		System.out.println("Press 3 to Water the live pets");
		System.out.println("Press 4 to Oil the robotic pets");
		System.out.println("Press 5 to Clean all the live pets' cages");
		System.out.println("Press 6 to Walk all the dogs");
		System.out.println("Press 7 to Clean the live cats' litter box");
		System.out.println("Press 8 to Play tic-tac-toe with all the pets");
		System.out.println("Press 9 to Interact with a specific pet");
		System.out.println("Press 10 to Adopt a pet");
		System.out.println("Press 11 to Admit a pet");
		System.out.println("Press 12 to Quit");
	}

	public void valid() {
		System.out.println("Please make a valid selection.");
	}

	public void adoptMenu() {
		System.out.println("Here are the pets currently in the shelter. Which pet would you like to adopt?");
		for (VirtualPet virtualPet : virtualPets.values()) {
			System.out.println(virtualPet.getPetName() + ", the " + virtualPet.getPetType());
		}
	}

	public void petStatus() {
		for (VirtualPet virtualPet : virtualPets.values()) {
			if (virtualPet instanceof OrganicPet) {
				System.out.println(virtualPet.getPetName() + ", the " + virtualPet.getPetType() + ". Hunger: "
						+ ((OrganicPet) virtualPet).getHungerLevel() + " Thirst: "
						+ ((OrganicPet) virtualPet).getThirstLevel() + " Waste: "
						+ ((OrganicPet) virtualPet).getWasteLevel() + " Happiness: " + virtualPet.getHappinessLevel()
						+ " Health: " + virtualPet.getHealthLevel());
			} else {
				System.out.println(virtualPet.getPetName() + ", the " + virtualPet.getPetType() + ". Oil: "
						+ ((RobotPet) virtualPet).getOilLevel() + " Happiness: " + virtualPet.getHappinessLevel()
						+ " Health: " + virtualPet.getHealthLevel());
			}
		}
	}

	public void typeOfPet() {
		System.out.println("What type of pet do you have?");
		System.out.println("Live Dog");
		System.out.println("Live Cat");
		System.out.println("Robotic Dog");
		System.out.println("Robotic Cat");

	}

	public void interactWithOnePet() {
		System.out.println("Which pet would you like to interact with?");
		for (VirtualPet virtualPet : virtualPets.values()) {
			System.out.println(virtualPet.getPetName() + ", the "+ virtualPet.getPetType());
		}
	}

	public void interactOrganicDogMenu() {
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to Feed the dog");
		System.out.println("Press 2 to Water the dog");
		System.out.println("Press 3 to Play with the dog");
		System.out.println("Press 4 to Walk the dog");
		System.out.println("Press 5 to Clean the dog's cage");

	}

	public void interactOrganicCatMenu() {
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to Feed the cat");
		System.out.println("Press 2 to Water the cat");
		System.out.println("Press 3 to Play with the cat");
	}
	
	public void interactRobotDogMenu() {
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to Oil the dog");
		System.out.println("Press 2 to Play with the dog");
		System.out.println("Press 3 to Walk the dog");

	

	}

	public void interactRobotCatMenu() {
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to Oil the cat");
		System.out.println("Press 2 to Play with the cat");
	}
}