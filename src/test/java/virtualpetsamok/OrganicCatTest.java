package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicCatTest {
	
	OrganicPet underTest = new OrganicCat("Kitty", "Organic Cat", 5, 10, 15, 20, 15);

	@Test
	public void shouldReturnPetType() {
	String check = underTest.getPetType();
	assertEquals (check, "Organic Cat");
	}
	
	
}
