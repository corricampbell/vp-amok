package Shelter;

import java.util.ArrayList;
import java.util.List;

import OrganicPets.*;
import RoboPets.*;

public class Shelter {
	List<Pet> pets = new ArrayList<>();
	private int litterBox = 0;
	
	public void addPet(Pet pet ) {
		pets.add(pet);
	}
	
	public void feedOrganicPets() {
		for(Pet pet : pets) {
			if(pet instanceof OrganicPets) {
				((OrganicPets) pet).feed();
				if(pet instanceof OrganicCat) {
					litterBox+=5;
				}
			}
			
		}
	}
	
	public void oilRobotPets() {
		for(Pet pet: pets) {
			if(pet instanceof RoboPets) {
				((RoboPets) pet).oil();
			}
		}
	}
	
	public void giveWaterToPets() {
		for(Pet pet : pets) {
			if(pet instanceof OrganicPets) {
				((OrganicPets) pet).drink();
				if(pet instanceof OrganicCat) {
					litterBox+=3;
				}
			}
			
		}
	}
	
	public void playWithCats() {
		for(Pet pet : pets) {
			if(pet instanceof OrganicCat) {
				((OrganicCat) pet).play();
			}
			
		}
	}
	
	public void walkTheDogs() {
		for(Pet pet : pets) {
			if(pet instanceof OrganicDog) {
				((OrganicDog) pet).walk();
			}	
		}
	}
	
	public void clearLitterBox() {
		litterBox= 0;
	}
	
	public void userLitterBox() {
		for(Pet pet : pets) {
			if(pet instanceof OrganicCat) {
				((OrganicCat) pet).litter();
			}	
		}
	}
	
	public void clearDogsCage() {
		for(Pet pet : pets) {
			if(pet instanceof OrganicDog) {
				((OrganicDog) pet).clearBox();;
			}	
		}
	}
	
	public void tick(int selection) {
		for (Pet pet : pets) {
			if (pet.getHealth() > 50) {
				pet.setHealth(50);
			}
			if (pet.getHealth() < 0) {
				pet.setHealth(0);
			}
			if (pet.getHappiness() > 50) {
				pet.setHappiness(50);
			}
			if (pet.getHappiness() < 0) {
				pet.setHappiness(0);
			}
			if (pet.getMess() > 50) {
				pet.setMess(50);
			}
		
		}
		if (litterBox < 0) {
			litterBox = 0;
		}
		if (litterBox > 50) {
			litterBox = 50;
		}
		if (litterBox > 30) {
			for (Pet pet : pets) {
				if (pet instanceof OrganicCat) {
					pet.setHealth(pet.getHealth() - 2);
				}
			}
			if (selection != 9) {
				for (Pet pet : pets) {
					if (pet instanceof OrganicCat) {
						litterBox += 2;
					}
				}
			}
		}
	}
	
	public void display() {
		System.out.println("Virtual Pet Center: Dashboard");
		
		for(Pet pet: pets ) {
		
			System.out.println("- "+pet.getName());
			String indentation = "            ";
			if(pet instanceof OrganicPets) {
				OrganicPets organicPet = (OrganicPets) pet;
				if(pet instanceof OrganicCat) {
					System.out.println(indentation + "- Type : Organic Cat");
				}
				else if(pet instanceof OrganicDog){
					System.out.println(indentation + "- Type : Organic Dog");
				}
				else {
					System.out.println(indentation + "- Type : Organic Pet");
				}
				
				System.out.println(indentation + "- Happiness : "+pet.getHappiness());
				System.out.println(indentation + "- Mess : "+pet.getMess());
				System.out.println(indentation + "- Health : "+organicPet.getHealth());
				System.out.println(indentation + "- Hunger : "+organicPet.getHunger());
				System.out.println(indentation + "- Thirst : "+organicPet.getThirst());
			}
			else if(pet instanceof RoboPets) {
				RoboPets roboPet = (RoboPets) pet;
				if(pet instanceof RoboCat) {
					System.out.println(indentation + "- Type : Robot Cat");
				}
				else if(pet instanceof RoboDog){
					System.out.println(indentation + "- Type : Robot Dog");
				}
				else {
					System.out.println(indentation + "- Type : Robot Pet");
				}
				
				System.out.println(indentation + "- Happiness : "+pet.getHappiness());
				System.out.println(indentation + "- Mess : "+pet.getMess());
				System.out.println(indentation + "- Health : "+roboPet.getHealth());
				System.out.println(indentation + "- Oil : "+roboPet.getOil());
			}
			
			System.out.println();
			
		}
		
		System.out.println("LitterBox is "+litterBox);
	}

}
