package OrganicPets;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import OrganicPets.OrganicPets;

public class OrganicCatTest {

	OrganicPets underTest = new OrganicCat("Butterrum");

	@Test
	public void shouldHaveDefaultPropertyValuesof10() {
		
		String checkName = underTest.getName();
		int checkHealth = underTest.getHealth();
		int checkHappiness = underTest.getHappiness();
		int checkHunger = underTest.getHunger();
		int checkThirst = underTest.getThirst();
		int checkMess = underTest.getMess();
		assertThat(checkName, is("Butterrum"));
		assertThat(checkHealth, is(75));
		assertThat(checkHappiness, is(75));
		assertThat(checkHunger, is(50));
		assertThat(checkThirst, is(50));
		assertThat(checkMess, is(20));
	}
	
	@Test
	public void shouldDecreaseHungerBy5WhenFed() {
		underTest.feed();
		int checkHunger = underTest.getHunger();
		assertThat(checkHunger, is (45));
	}
	
	@Test
	public void shouldDecreaseThirstBy5WhenWatered() {
		underTest.drink();
		int checkThirst = underTest.getThirst();
		assertThat(checkThirst, is (45));
		
	}	
	
	@Test
	public void shouldIncreaseLitterMessBy5() {
		underTest.litter();
		int checkBox = underTest.getMess();
		assertThat(checkBox, is (25));
		
	}

}
