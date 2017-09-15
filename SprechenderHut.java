import java.util.Scanner;

public class SprechenderHut {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welche Eigenschaften passen zu dir?");
		System.out.println(" 1) gerecht & treu");
		System.out.println(" 2) listig & tückisch");
		System.out.println(" 3) gelehrsam & weise");
		System.out.println(" 4) tapfer & mutig");
		 
		
		int auswahl = scanner.nextInt();
		
		if (auswahl == 1) {
			System.out.println("Dein Haus ist...Hufflepuff!");
		}
	    if (auswahl == 2) {
			System.out.println("Dein Haus ist... Slytherin!");
		}
		if (auswahl == 3) { 
			System.out.println("Dein Haus ist... Ravenclaw!"); 
		} 
		if (auswahl == 4) {
			System.out.println("Dein Haus ist... Gryffinfor!"); 
		}
		else {
			System.out.println("Du bist ein Muggel!");
		}
	}
}