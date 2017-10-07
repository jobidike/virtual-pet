package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPet tiger = new VirtualPet(30,15,10,50);
		

		
		System.out.println("Welcome to Virtual Pet World!");
		String choice;
		
		
		
		do {
			tiger.tick()
			System.out.println("Timothy the Tiger\n" + "Hunger: " + tiger.getHunger() + 
					" \nWaste: " + tiger.getWaste() + " \nBoredom: " + tiger.getBoredom() + " \nTiredness: " + tiger.getTiredness());
			System.out.println("");
			
			
			System.out.println("What would you like to to with Timothy the Tiger!");
			System.out.println("Press 1: to feed him");
			System.out.println("Press 2: to take him to the bathroom ");
			System.out.println("Press 3: to take him to the Tiger park at the Zoo");
			System.out.println("Press 4: to give him a shot to put him to sleep");
			System.out.println("Press 5: to do nothing");
			choice = input.nextLine();
			
			if(choice.equals("1")) {
				tiger.feed(5);
				System.out.println("You fed him");
			}else if (choice.equals("2")) {
				tiger.bathroom(10);
				System.out.println("You took him to outside to use the bathroom");
			} else if (choice.equals("3")) {
				tiger.play(9);
				System.out.println("you took him to the Tiger park at the zoo");
			} else if (choice.equals("4")){
				tiger.sleep(8);
				System.out.println("You gave him a shot to put him to sleep");
			} else if (choice.equals("5")) {
				System.out.println("You better run FAST!");
				break;	
			} 
		}while (!choice.contentEquals("5"));
				
			
		
		
		
		
		

	}

}
