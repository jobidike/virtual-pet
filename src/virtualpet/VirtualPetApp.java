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
		
		
		
		
		

	}

}
