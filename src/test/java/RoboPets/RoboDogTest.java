package RoboPets;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import OrganicPets.Walkable;

public class RoboDogTest {

	RoboDog underTest = new RoboDog("Hana");

	@Test
	public void shouldHaveNameHappyOil() {
		String foundName = underTest.getName();
		int foundHappy = underTest.getHappiness();
		int foundOil = underTest.getOil();
		int foundMess = underTest.getMess();
		assertThat(foundName, is("Hana"));
		assertThat(foundHappy, is(75));
		assertThat(foundOil, is(75));
		assertThat(foundMess, is(20));

	}

	@Test
	public void shouldIncreaseHappyBy5WhenWalked() {
	underTest.walk();
	int foundHappy = underTest.getHappiness();
	assertThat(foundHappy, is(80));

	
	}
	
	@Test
	public void shouldDecreaseOilBy5WhenChased() {
		underTest.chase();
		int foundOil = underTest.getOil();
		assertThat(foundOil, is (70));
	}
	
	@Test
	public void shouldBeAnInstanceOfRoboticPet() {
		assertThat(underTest, instanceOf(RoboPets.class));
	}
	
	@Test
	public void shouldIncreaseOilBy5WhenOiled() {
		underTest.oil();
		int foundOil = underTest.getOil();
		assertThat(foundOil, is (80));
	}
	
	@Test
	public void shouldBeAnInstanceOfWalkable() {
		assertThat(underTest, instanceOf(Walkable.class));
	}
	
	@Test
	public void shouldIncreaseMessby5() {
		underTest.mess();
		int foundMess = underTest.getMess();
		assertThat(foundMess, is(25));
	}
}
