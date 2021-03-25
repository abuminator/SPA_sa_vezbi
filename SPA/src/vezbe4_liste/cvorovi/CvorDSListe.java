package vezbe4_liste.cvorovi;

public class CvorDSListe {
	public int podatak;
	public CvorDSListe prethodni;
	public CvorDSListe sledeci;
	
	public CvorDSListe(CvorDSListe prethodni, int podatak, CvorDSListe sledeci) {
		this.prethodni = prethodni;
		this.podatak = podatak;
		this.sledeci = sledeci;
	}
	

}
