package RoboPets;

import OrganicPets.Pet;

public class RoboCat extends Pet implements RoboPets {

	private int oil;
	public RoboCat(String name) {
		this.name = name;
		this.happiness = 75;
		this.oil = 75;
		this.mess = 20;
		this.health= 75;
	
	}

	
	public void setOil(int oil) {
		this.oil = oil;
	}


	public int getHappiness() {
		return happiness;
	}

	/* (non-Javadoc)
	 * @see RoboPets.RoboPets#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/* (non-Javadoc)
	 * @see RoboPets.RoboPets#getOil()
	 */
	@Override
	public int getOil() {
		// TODO Auto-generated method stub
		return oil;
	}

	/* (non-Javadoc)
	 * @see RoboPets.RoboPets#oil()
	 */
	@Override
	public void oil() {
		oil +=5;
		
		
	}

	@Override
	public int getMess() {
		// TODO Auto-generated method stub
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

	
	

}
