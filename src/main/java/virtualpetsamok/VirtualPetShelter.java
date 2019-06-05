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

	public void removeVirtualPet(VirtualPet virtualPet) {
		virtualPets.remove(virtualPet.getPetName(), virtualPet);
	}

	public VirtualPet findVirtualPet(String petName) {
		return virtualPets.get(petName);
	}

	public void playWithAllPets() {
		for (VirtualPet eachPet : virtualPets.values()) {
			eachPet.playWithEachPet();
		}
	}

	public void waterAllOrganicPets() {
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof OrganicPet) {
				((OrganicPet) eachPet).waterEachPet();
			}
		}
	}

	public void feedAllOrganicPets() {
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof OrganicPet) {
				((OrganicPet) eachPet).feedEachPet();
			}
		}
	}

	public void cleanAllDogCages() {
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof OrganicDog) {
				((OrganicDog)eachPet).cleanEachCage();		
			}
		}
	}

	public void cleanLitterBox() {
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof OrganicCat) {
				((OrganicCat)eachPet).cleanLitter();
			}
		}
	}

	public void oilAllRobotPets() {
		for (VirtualPet eachPet : virtualPets.values()) {
			if (eachPet instanceof RobotPet) {
				((RobotPet)eachPet).oilEachPet();
			}
		}
	}
}