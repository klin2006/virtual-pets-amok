package virtualpetsamok;

import java.util.Scanner;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter petShelter = new VirtualPetShelter();

		VirtualPet pet1 = new OrganicDog("Dobby", "live dog", 15, 52, 65, 78, 82);
		VirtualPet pet2 = new OrganicCat("Kitz", "live cat", 72, 88, 42, 52, 42);
		VirtualPet pet3 = new RobotDog("Robbie", "robotic dog", 17, 64, 22);
		VirtualPet pet4 = new RobotCat("Ritzy", "robotic cat", 68, 80, 54);

		petShelter.addVirtualPet(pet1);
		petShelter.addVirtualPet(pet2);
		petShelter.addVirtualPet(pet3);
		petShelter.addVirtualPet(pet4);

		System.out.println("Welcome to Turky Chiken's Canine and Feline Coop.");

		petShelter.menu();
		String menuSelection = input.next();
		input.nextLine();
		while (!menuSelection.equals("Esc")) {

			switch (menuSelection) {
			case "1":
				petShelter.petStatus();
				petShelter.menu();
				break;

			case "2":
				petShelter.feedAllOrganicPets();
				petShelter.tick();
				petShelter.menu();
				break;

			case "3":
				petShelter.waterAllOrganicPets();
				petShelter.tick();
				petShelter.menu();
				break;

			case "4":
				petShelter.oilAllRobotPets();
				petShelter.tick();
				petShelter.menu();
				break;

			case "5":
				petShelter.cleanAllDogCages();
				petShelter.tick();
				petShelter.menu();
				break;
				
			case "6":
				petShelter.walkAllDogs();
				petShelter.tick();
				petShelter.menu();
				break;

			case "7":
				petShelter.cleanLitterBox();
				petShelter.tick();
				petShelter.menu();
				break;

			case "8":
				petShelter.playWithAllPets();
				petShelter.tick();
				petShelter.menu();
				break;

			case "9":
				String interact = null;
				Boolean interactLoop = true;
				while (interactLoop == true) {

					petShelter.interactWithOnePet();
					String petName = input.next();
					input.nextLine();

					VirtualPet interactPet = petShelter.findVirtualPet(petName);

					if (interactPet == null) {
						petShelter.valid();

					} else {
						if (interactPet instanceof OrganicDog) {
							petShelter.interactOrganicDogMenu();
							String organicDogSelection = input.next();

							switch (organicDogSelection) {
							case "1":
								petShelter.feedOneOrganicPet(petName, 0);
								System.out.println("You feed " + petName + "!");
								break;

							case "2":
								petShelter.waterOneOrganicPet(petName, 0);
								System.out.println("You water " + petName + "!");
								break;

							case "3":
								petShelter.playWithOnePet(petName, 0);
								System.out.println("You play with " + petName + "!");
								break;

							case "4":
								petShelter.walkOneDog(petName, 0);
								System.out.println("You walk " + petName + "!");
								break;

							case "5":
								petShelter.cleanOneCage(petName, 0);
								System.out.println("You clean " + petName + "'s cage!");
							break;
							}
							petShelter.tick();
							petShelter.menu();
							interactLoop = false;
								
							

						} else if (interactPet instanceof OrganicCat) {
							petShelter.interactOrganicCatMenu();
							String organicCatSelection = input.next();

							switch (organicCatSelection) {
							case "1":
								petShelter.feedOneOrganicPet(petName, 0);
								System.out.println("You feed " + petName + "!");
								break;

							case "2":
								petShelter.waterOneOrganicPet(petName, 0);
								System.out.println("You water " + petName + "!");
								break;

							case "3":
								petShelter.playWithOnePet(petName, 0);
								System.out.println("You play with " + petName + "!");
								break;

							}
							petShelter.tick();
							petShelter.menu();
							interactLoop = false;

						} else if (interactPet instanceof RobotDog) {
							petShelter.interactRobotDogMenu();
							String robotDogSelection = input.next();
							
							switch(robotDogSelection) {
							case "1":
								petShelter.oilOneRobot(petName, 0);
								System.out.println("You oil " + petName + "!");
							break;
							
							case "2":
								petShelter.playWithOnePet(petName, 0);
								System.out.println("You play with " + petName + "!");
							break;
							
							case "3":
								petShelter.walkOneDog(petName, 0);
								System.out.println("You walk " + petName + "!");
								break;
							}
							
							petShelter.tick();
							petShelter.menu();
							interactLoop = false;

						} else {
							petShelter.interactRobotCatMenu();
							String robotCatSelection = input.next();
							switch(robotCatSelection) {
							case "1":
								petShelter.oilOneRobot(petName, 0);
								System.out.println("You oil " + petName + "!");
							break;
							
							case "2":
								petShelter.playWithOnePet(petName, 0);
								System.out.println("You play with " + petName + "!");
							break;
							
						}
							petShelter.tick();
							petShelter.menu();
							interactLoop = false;

						}
					}
				}
				break;

			case "10":
				String name = null;
				Boolean nameLoop = true;
				while (nameLoop == true) {

					petShelter.adoptMenu();

					String adoptPet = input.next();
					input.nextLine();

					VirtualPet foundPet = petShelter.findVirtualPet(adoptPet);
					if (foundPet == null) {
						petShelter.valid();
					}

					else {
						petShelter.adoptVirtualPet(foundPet);
						System.out.println("Goodbye, " + adoptPet + "!");
						petShelter.tick();
						petShelter.menu();
						nameLoop = false;
					}
				}
				break;

			case "11":
				System.out.println("What is your pet's name?");
				String userPetName = input.next();
				input.nextLine();
				String admit = null;
				Boolean admitLoop = true;
				while (admitLoop == true) {
					petShelter.typeOfPet();
					String userPetType = input.nextLine();
					if (userPetType.toLowerCase().equals("live cat") || userPetType.toLowerCase().equals("live dog")) {
						System.out.println("What is your pet's hunger level (enter as a number between 0 and 100)?");
						int userPetHunger = input.nextInt();
						input.nextLine();
						System.out.println("What is your pet's thirst level (enter as a number between 0 and 100)?");
						int userPetThirst = input.nextInt();
						input.nextLine();
						System.out.println("What is your pet's waste level (enter as a number between 0 and 100)?");
						int userPetWaste = input.nextInt();
						input.nextLine();
						System.out.println("What is your pet's happiness level (enter as a number between 0 and 100)?");
						int userPetHappiness = input.nextInt();
						input.nextLine();
						System.out.println("What is your pet's health level (enter as a number between 0 and 100)?");
						int userPetHealth = input.nextInt();

						VirtualPet petinput = new OrganicPet(userPetName, userPetType, userPetHunger, userPetThirst,
								userPetWaste, userPetHappiness, userPetHealth);
						petShelter.addVirtualPet(petinput);
						System.out.println("Welcome, " + userPetName + "!");
						petShelter.tick();
						petShelter.menu();
						admitLoop = false;

					} else if (userPetType.toLowerCase().equals("robotic dog")
							|| userPetType.toLowerCase().equals("robotic cat")) {
						System.out.println("What is your pet's oil level (enter as a number between 0 and 100)?");
						int userPetOil = input.nextInt();
						input.nextLine();
						System.out.println("What is your pet's happiness level (enter as a number between 0 and 100)?");
						int userPetHappiness = input.nextInt();
						input.nextLine();
						System.out.println("What is your pet's health level (enter as a number between 0 and 100)?");
						int userPetHealth = input.nextInt();
						VirtualPet petinput = new RobotPet(userPetName, userPetType, userPetOil, userPetHappiness,
								userPetHealth);
						petShelter.addVirtualPet(petinput);

						System.out.println("Welcome, " + userPetName + "!");
						petShelter.tick();
						petShelter.menu();
						admitLoop = false;

					} else {
						petShelter.valid();
					}
				}
				break;

			case "12":
				System.exit(0);

			default:
				petShelter.valid();
				petShelter.menu();
				break;
			}

			menuSelection = input.next();

		}
		input.close();
	}
}