import java.util.Scanner;

public class Ratespiel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ich denke mir eine Zahl zwischen 1 und 100.");
		int zufallsZahl = (int) (100 * Math.random()) + 1;
		
		System.out.println("Versuche sie zu erraten!");
		System.out.print("> ");
		int eingabe = sc.nextInt();
		
		while (zufallsZahl != eingabe) {
			if (eingabe < zufallsZahl) {
				System.out.println("Deine Zahl ist zu klein. Versuch es noch einmal.");
						}
			if (eingabe > zufallsZahl) {
				System.out.println("Dein Zahl ist zu gross. Versuche es noch einmal.");
			}
			eingabe = sc.nextInt();
 		}

		System.out.println("Richtig! Herzlichen Glückwunsch!");
	}

}
