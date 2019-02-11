package OrganicPets;

public class OrganicCat extends Pet implements OrganicPets {

	private int health;
	private int hunger;
	private int thirst;
	public OrganicCat(String name) {
		this.name = name;
		this.health = 75;
		this.happiness = 75;
		this.hunger = 50;
		this.thirst = 50;
		this.mess = 20;
	}

	
	
	public void setHealth(int health) {
		this.health = health;
	}



	public void setHunger(int hunger) {
		this.hunger = hunger;
	}



	public void setThirst(int thirst) {
		this.thirst = thirst;
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see vp.amok.OrganicPets#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vp.amok.OrganicPets#getHealth()
	 */
	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return health;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vp.amok.OrganicPets#getHappiness()
	 */
	@Override
	public int getHappiness() {
		// TODO Auto-generated method stub
		return happiness;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vp.amok.OrganicPets#getHunger()
	 */
	@Override
	public int getHunger() {
		// TODO Auto-generated method stub
		return hunger;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vp.amok.OrganicPets#getThirst()
	 */
	@Override
	public int getThirst() {
		// TODO Auto-generated method stub
		return thirst;
	}
	
	@Override
	public int getMess() {
		return mess;
	}
	

	@Override
	public void feed() {
		hunger -= 5;

		
	}

	@Override
	public void drink() {
		thirst -= 5;

	}

	@Override
	public void litter() {
		// TODO Auto-generated method stub
		mess+=5;
		
	}

	@Override
	public int getBox() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void play() {
		happiness+=5;
		mess-=3;
	}

	

}
