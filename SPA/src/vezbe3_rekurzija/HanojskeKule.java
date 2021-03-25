package vezbe3_rekurzija;

public class HanojskeKule {
	
	public static void resiHanojskeKule(int brojDiskova, char pocetak, char pomocni, char kraj) {
		
		if(brojDiskova < 1) {
			return;
		}
		
		if(brojDiskova == 1) {
			System.out.println("Prebaci disk " + brojDiskova + " sa stapa " + pocetak + " na stap " + kraj);
			return;
		}
		
		resiHanojskeKule(brojDiskova - 1, pocetak, kraj, pomocni);
		System.out.println("Prebaci disk " + brojDiskova + " sa stapa " + pocetak + " na stap " + kraj);
		resiHanojskeKule(brojDiskova - 1, pomocni, pocetak, kraj);
		
	}
	
	public static void main(String[] args) {
		
		HanojskeKule.resiHanojskeKule(3, 'A', 'B', 'C');
		
	}

}
