package OrganicPets;

public class Pet {
	protected String name;
	protected int happiness;
	protected int mess;
	protected int health;

	public Pet() {
		super();
	}
	
	public Pet(String name, int happiness, int mess, int health ) {
		this.name = name;
		this.happiness = happiness;
		this.mess = mess;
		this.health = health;
	}

	public String getName() {
	
		return name;
	}

	public int getHappiness() {
	
		return happiness;
	}

	public int getMess() {
		return mess; 
	}
	
	public int getHealth() {
		return health;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public void setMess(int mess) {
		this.mess = mess;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	

}