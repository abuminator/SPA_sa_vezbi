package vezbe4_liste.cvorovi;

public class CvorJSListe {
	public int podatak;
	public CvorJSListe sledeci;
	
	public CvorJSListe(int podatak, CvorJSListe sledeci) {
		this.podatak = podatak;
		this.sledeci = sledeci;
	}

}
