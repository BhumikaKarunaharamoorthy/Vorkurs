
public class KopfOderZahl {

	public static void main(String[] args) {
		int zaehler = 0;
		boolean istKopf = Math.random() < 0.5;
		
		while (istKopf) {
		istKopf = Math.random() < 0.5;
		zaehler++;
		
		System.out.println("Du hast zum " + zaehler + ". Mal Kopf geworfen");
	} 
	
		System.out.println("Du hast Zahl geworden....");
	} 
}
