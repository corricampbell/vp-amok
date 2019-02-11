package vp.amok;
import java.util.Scanner;

import OrganicPets.*;
import RoboPets.*;
import Shelter.Shelter;

public class App {

	static Scanner input = new Scanner(System.in);
	
	Shelter shelter = new Shelter();
	
	public App () {
		OrganicDog dog = new OrganicDog("Tootsie");
		RoboDog roboDog = new RoboDog("Hana");
		OrganicCat cat = new OrganicCat("Butterrum");
		RoboCat roboCat = new RoboCat("Ruffles");
		shelter.addPet(dog);
		shelter.addPet(roboDog);
		shelter.addPet(cat);
		shelter.addPet(roboCat);
		
		while(true) {
			shelter.display();
			
			getOptions();
			int selection = input.nextInt();
			
			while(selection < 0 || selection > 10) {
				System.out.println("Please enter correct option");
				selection = input.nextInt();
			}
			
			processSelection(selection);
		}
	}
	
	public static void main(String[] args) {
		App app = new App();
	}
	
	private void processSelection(int selection) {
		if(selection == 1) {
			System.out.println("Thank you for feeding all the organic pets");
			shelter.feedOrganicPets();
		}
		else if(selection == 2 ) {
			System.out.println("Thank you for oiling the robot animals");
			shelter.oilRobotPets();
		}
		else if(selection == 3) {
			System.out.println("Thank you for giving water to pets");
			shelter.giveWaterToPets();
		}
		else if(selection == 4) {
			System.out.println("Thank you so much for playing with cats");
			shelter.playWithCats();
		}
		else if(selection == 5) {
			System.out.println("Thank you so much for walking the dogs");
			shelter.walkTheDogs();
		}
		else if(selection == 6) {
			System.out.println("Thank you so much for having cats use the little box");
			shelter.userLitterBox();
		}
		else if(selection == 7) {
			System.out.println("Thank you for cleaning the litter box");
			shelter.clearLitterBox();
		}
		else if(selection == 8) {
			System.out.println("Thank you so much for cleaning dog cages");
			shelter.clearDogsCage();
		}
		else if(selection == 9)  {
			addPet();
		}
		else {
			System.exit(0);
		}
		
		shelter.tick(selection);
	}

	private static void getOptions() {
		System.out.println("What would you like to do?");
		System.out.println("1. Feed all of the organic pets");
		System.out.println("2. Oil all of the robot animals");
		System.out.println("3. Give the pets water to drink");
		System.out.println("4. Play with the cats");
		System.out.println("5. Walk the dogs");
		System.out.println("6. Have the cats use the litter box");
		System.out.println("7. Clean the litter Box");
		System.out.println("8. Clean all of the dog cages");
		System.out.println("9. Admit another pet to the shelter");
		System.out.println("10. Quit");

	}

	private void addPet() {
		System.out.println("What type of pet is this?");
		System.out.println("Press 1 for Organic Dog");
		System.out.println("Press 2 for Robot Dog");
		System.out.println("Press 3 for Organic Cat");
		System.out.println("Press 4 for Robot Cat");
		int selection = input.nextInt();
		String name;
		switch (selection) {
		case 1:
			System.out.println("What is the pet's name");
			 input.nextLine();
			 name =input.nextLine();
			OrganicDog dog = new OrganicDog(name);
			shelter.addPet(dog);
			break;
		case 2:
			System.out.println("What is the pet's name");
			 input.nextLine();
			 name =input.nextLine();
			RoboDog roboDog = new RoboDog(name);
			shelter.addPet(roboDog);
			break;
		case 3:
			System.out.println("What is the pet's name");
			 input.nextLine();
			 name =input.nextLine();
			OrganicCat cat = new OrganicCat(name);
			shelter.addPet(cat);
			break;
		case 4:
			System.out.println("What is the pet's name");
			 input.nextLine();
			 name =input.nextLine();
			RoboCat roboCat = new RoboCat(name);
			shelter.addPet(roboCat);
			break;
		}
	}
}
