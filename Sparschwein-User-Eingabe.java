import java.util.Scanner;

public class Sparschwein {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int ziel = 2000; 
		int gespart = 0;
		int fehlt = 0;
		
		while (gespart < ziel) {
			System.out.println("Wie viel möchtest du in dein Sparschwein einzahlen?");	
			gespart = sc.nextInt() + gespart;
			fehlt = ziel - gespart;
			System.out.println("Es fehlen noch " + fehlt );
	}
	 		System.out.println("Juhu, jetzt kann ich mir ein Auto kaufen!");
	}
}
