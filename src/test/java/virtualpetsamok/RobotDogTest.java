package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotDogTest {
	
	RobotDog underTest = new RobotDog("Robbie", "Robot Dog", 5, 10, 15);
	
	@Test
	public void shouldReturnOilLevel() {
		int check = underTest.getOilLevel();
		assertEquals(check, 5);
	}
	
	@Test
	public void walkDogShouldReturn100HappinessLevel() {
		underTest.walkDog();
		int happyAfter = underTest.getHappinessLevel();
		assertEquals(happyAfter, 100);
		}
}