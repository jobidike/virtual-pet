package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPet tiger = new VirtualPet(30,15,10,50);
		
		System.out.println(
				"$$$$777777IIIIII?????+++++?ZO$ODNDZZ8NDNND88OD$O87$I?++++==+?77777$$$$$Z$ZZONNNN\n"+
				"$$$$777777IIII??????++++?7Z$8DDZOZZONND8NMDNNMDZDNZ$I$I7O$+=?777777$$$$$$ZZZZZ8N\n"+
				"$$$$77777IIII?????++++?7OO$ZNOZONNND88N88OZZO8MNO888$I7$Z8I=+III77777$$$$$ZZZZOO\n"+
				"$$77777IIIII?????+++++7ZOZ8DOZNMM8Z8DDZZOOO8O$$ODOO8OZZ$Z$$=+IIII7777$$$$$ZZZZZZ\n"+
				"$77777IIIII?????+++?++7$$ZDO7DNNZOOZODDM8NNNNZODZD$ZOZ$$Z$+~+?IIII7777$$$$ZZZOOO\n"+
				"$7777IIIII????++7$7OD$?7OODZ8NOO8OZDDNNNO8N8DO$OM$7Z8OZ$$I:~+?IIIII7777$$$ZZZZZZ\n"+
				"77777IIII?????+IO7II7?$OOZZI8OIONZDDN8DO8O8DNN$OZZ8ZN8Z$I:::=??IIIII7777$$$ZZZZZ\n"+
				"77777IIII??????Z7?77I$$DDZZI7I7NN788MZNO8DDNDN$8$NNO8ZOO7=~:=???IIIII77777$$ZZZZ\n"+
				"77777III????+++$?7ZOI?7ZDNZ777I87OZIDNDZ88Z88N$ZOO$78O888$~~=????IIIII777$$$ZZZZ\n"+
				"7777IIII????++++7I$$??7$ONNN78N8N787$M8OOO8OODO$8ND8ZDD8N7~~=??I??IIII77$$$$ZZZZ\n"+
				"7777IIII???+++++=IZ$?IZOZZO88$??Z7$8Z88O$Z$Z$8$O8DMDN8NDZ7+~=?????IIII7777$$ZZZZ\n"+
				"7777IIII???+++++==?$77ZDZO$ZD$Z8NDND$78ZOZ$ZZ8DND78DONNZ$$I+=?????IIII7777$$$ZZZ\n"+
				"77777II????+++++==+$7ZOOZN8O8O$8NN8NDMDOZZOOZO8DDZ88O$$Z$$7++????IIIII77777$ZZZZ\n"+
				"77777III???+++++===+I$8O$888DD8O78DZDD88Z$ZZZZZ8OZ7OD78DD$I?+???I?IIII77777$$ZZZ\n"+
				"77777III???+++++====?IOOZ8DOND87$8Z8OOO8OZZZZZ$8NOZ$DDZZZZ7I??III?IIII77777$$ZZZ\n"+
				"77777III???++++++===+7ZO77ZII77Z$878OO8NDOZZZZZZ8ZNM$I8Z$77$7IIIIIIIII77777$$ZZZ\n"+
				"$7777IIII???++++++===+I7$IZ88NO8O$N7ZOOZD8OOOOZO8ZDMI??II$ZZZ$$IIIIII777777$$ZZZ\n"+
				"$7777IIII???++++++===+77IIO887IZ8NZZDN8DODOZZ$INOI?7Z$$I7OZ8OOOO$7I7I77777$$ZZZZ\n"+
				"$7777IIII????++++++===+??$O8ZO78Z77$NNNNN$ODOOZZO7IIZO77Z$8OZOOOOZZ$777777$$ZZZZ\n"+
				"$$7777III?????+++++++===+IZZO$$7I?7ZI7$ZO$$ZODOZ7?I$877O8O8OZOOO88O8OZ$$77$$$ZZZ\n"+
				"$$$7777IIII?????+++++++++?7I7O88$?IZZ7$7ZII$$ZDNMOII7ZOOZZOOOO88888888OZZ$$$$ZZZ\n"+
				"$$$77777IIII?????++++++==I7$Z$$ZO$II8DZ87IN8ND8Z7I?+$O8OZ8ZOOO88DDD888888OZZ$ZZZ\n"+
				"$$$$77777IIII?????++++==+7ZZ7$Z7Z$O$$Z77$DO$I??I?+I$$88O8OZOOO88DDDDDDD88888OZOO\n"+
				"$$$$$77777IIII??????+++=+$OZZ$77$77$ZZO$O7I??I?I+$OZODZ$8OZOO888DNDDDDDDDDDD88OO\n"+
				"Z$$$$$$77777IIII??????++=?O8O8ZO$777$7$?II$ZI7ZZOO$$O$$88OOOO888DNDDDDDDDDDDD888\n"+
				"ZZ$$$$$$77777IIIII?????++??$DNZOOZZ$7$???77788O$7I777$DMDOZZZOO8NDDDDDDDDDDDDDD8\n"+
				"ZZZ$$$$$$77777IIIIII?????+IZZO88NN$7$$$$$$$Z$IIIII77$8DDO$7$ZODNDDDDDDDDDDDDDDDD\n"+
				"ZZZZZ$$$$$$777777IIIII?I7$$7$$$ZZ$Z$$77$$$ZIIIIII7$OD8Z$$$$ZZO8NN8D8DDDDDDDNNNNN\n");
		

		
		System.out.println("Welcome to Virtual Pet World!\n");
		String choice;
			
		
			System.out.println("Timothy the Tiger\n" + "Hunger: " + tiger.getHunger() + " \nWaste: " 
			+ tiger.getWaste() + " \nBoredom: " + tiger.getBoredom() + " \nTiredness: " 
			+ tiger.getTiredness());
			System.out.println("");
			
		do {	
			System.out.println("What would you like to to with Timothy the Tiger!\n");
			System.out.println("Press 1: to feed him");
			System.out.println("Press 2: to take him to the bathroom ");
			System.out.println("Press 3: to take him to the Tiger park at the Zoo");
			System.out.println("Press 4: to give him a shot to put him to sleep");
			System.out.println("Press 5: to do nothing and make Timothy angry");
			choice = input.nextLine();
			int amount = 5;
			
			if(choice.equals("1")) {
				tiger.feed(amount);
				System.out.println("You fed him\n");
				System.out.println(tiger.gameStats());
			}else if (choice.equals("2")) {
				tiger.bathroom(amount);
				System.out.println("You took him outside to use the bathroom\n");
				System.out.println(tiger.gameStats());
			} else if (choice.equals("3")) {
				tiger.play(amount);
				System.out.println("you took him to the Tiger park at the zoo\n");
				System.out.println(tiger.gameStats());
			} else if (choice.equals("4")){
				tiger.sleep(amount);
				System.out.println("You gave him a shot to put him to sleep\n");
				System.out.println(tiger.gameStats());
			} else if (choice.equals("5")) {
				System.out.println("You better run FAST!!! Game over.");	
				break;
			}
		}while (!choice.contentEquals("5")); {
			
		}
		input.close();	
		
		

	}

}
