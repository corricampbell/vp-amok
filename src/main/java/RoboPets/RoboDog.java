package RoboPets;

import OrganicPets.Pet;
import OrganicPets.Walkable;

public class RoboDog extends Pet implements RoboPets, Walkable {

	private int oil;

	public RoboDog(String name) {
		this.name = name;
		this.happiness = 75;
		this.oil = 75;
		this.mess = 20;
		this.health = 75;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getHappiness() {
		// TODO Auto-generated method stub
		return happiness;
	}

	public int getOil() {
		// TODO Auto-generated method stub
		return oil;
	}

	public void walk() {
		happiness += 5;

	}

	public void chase() {
		oil -= 5;
	}

	@Override
	public void oil() {
		oil += 5;

}

	@Override
	public int getMess() {
		return mess;
	}

	@Override
	public void mess() {
		 mess +=5;
		
	}

	@Override
	public void litter() {
		// TODO Auto-generated method stub
		
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	
}
