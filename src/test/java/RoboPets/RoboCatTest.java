package RoboPets;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboCatTest {

RoboPets underTest = new RoboCat("Ruffles");

@Test
public void shouldHaveNameOil() {
	String foundName = underTest.getName();
	int foundOil = underTest.getOil();
	assertThat(foundName, is("Ruffles"));
	assertThat(foundOil, is(75));
 
	
}
	
@Test
public void shouldIncreaseOilBy5WhenOiled() {
	underTest.oil();
	int foundOil = underTest.getOil();
	assertThat(foundOil, is(80));
}

@Test
public void shouldIncreaseMessby5() {
	underTest.mess();
	int foundMess = underTest.getMess();
	assertThat(foundMess, is(25));
}





}
