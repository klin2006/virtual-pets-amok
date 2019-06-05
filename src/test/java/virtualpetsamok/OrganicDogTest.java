package virtualpetsamok;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;

public class OrganicDogTest {

	OrganicDog underTest = new OrganicDog("Doggy", "Organic Dog", 10, 15, 20, 25, 30);

	@Test
	public void shouldReturnPetName() {
		String check = underTest.getPetName();
		assertEquals(check, "Doggy");

	}

	@Test
	public void shouldReturnPetType() {
		String check = underTest.getPetType();
		assertEquals(check, "Organic Dog");
	}

	@Test
	public void shouldReturnHungerLevel() {
		int check = underTest.getHungerLevel();
		assertEquals(check, 10);
	}

	@Test
	public void shouldReturnThirstLevel() {
		int check = underTest.getThirstLevel();
		assertEquals(check, 15);
	}
	
	@Test
	public void shouldReturnWasteLevel() {
		int check = underTest.getWasteLevel();
		assertEquals(check, 20);
	}
	
	@Test
	public void shouldReturnHappinessLevel() {
		int check = underTest.getHappinessLevel();
		assertEquals(check, 25);
	}
	
	@Test
	public void shouldReturnHealthLevel() {
		int check = underTest.getHealthLevel();
		assertEquals(check, 30);
	}
	
	@Test
	public void cleanDogCageShouldReturn0WasteLevel() {
		underTest.cleanDogCage();
		int wasteAfter = underTest.getWasteLevel();
		assertEquals(wasteAfter, 0);
			
	}
	
	@Test
	public void walkDogShouldReturn0Waste() {
		underTest.walkDog();
		int wasteAfter = underTest.getWasteLevel();
		assertEquals(wasteAfter, 0);
	}
	
}
