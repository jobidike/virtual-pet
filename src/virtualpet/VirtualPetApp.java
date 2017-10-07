package virtualpet;
import java.util.Scanner;
public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPet tiger = new VirtualPet(30,15,10,50);
		
		System.out.println(tiger.getHunger());
		System.out.println(tiger.getWaste());
		System.out.println(tiger.getBoredom());
		System.out.println(tiger.getTiredness());
		
		System.out.println("Welcome to Virtual Pet World!");
		String choice;
		
		do {
			System.out.println("Choose something you would like to to with Timothy the Tiger!");
			System.out.println("Press 1 to feed him");
			System.out.println("Press 2 to take him to the bathroom ");
			System.out.println("Press 3 to take him to the Tiger park at the Zoo");
			System.out.println("Press 4 to give him a shot to put him to sleep");
			System.out.println("Do nothing");
			choice = input.nextLine();
		}
			while {
		
		
		
		
		

	}

}
