package OrganicPets;

public class OrganicDog extends Pet implements OrganicPets, Walkable {

	private int health;
	private int hunger;
	private int thirst;
	private int box;
	public int getHealth() {
		return health;
	}

	public int getHunger() {

		return hunger;
	}

	public int getThirst() {

		return thirst;
	}
	
	public OrganicDog(String name) {
		this.name = name;
		this.health = 75;
		this.happiness = 75;
		this.hunger = 50;
		this.thirst = 50;
		this.mess = 20;
		this.box = 0;
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

	public void setBox(int box) {
		this.box = box;
	}

	/* (non-Javadoc)
	 * @see OrganicPets.Walkable#walk()
	 */
	@Override
	public void walk() {
		happiness += 5;

	}

	@Override
	public void feed() {
		hunger -= 5;
		// TODO Auto-generated method stub

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
		return box;
	}
	
	public void clearBox() {
		box= 0 ;
	}
	
	@Override
	public void play() {
		happiness -= 5;
		mess -= 2;
	}

}
