package vezbe4_liste.linearneStrukture;

import vezbe4_liste.cvorovi.CvorJSListe;

public class JSLista {

	CvorJSListe prvi;
	
	public JSLista() {
		prvi = null;
	}
	
	public boolean praznaLista() {
		return prvi == null;
	}
	
	public void ubaciNaPocetak(int podatak) {
		CvorJSListe novi = new CvorJSListe(podatak, prvi);
		prvi = novi;
	}
	
	public void ubaciNaKraj(int podatak) {
		
		if(praznaLista()) {
			ubaciNaPocetak(podatak);
			return;
		}
		
		CvorJSListe novi = new CvorJSListe(podatak, null);
		CvorJSListe pomocni = prvi;
		
		while (pomocni.sledeci != null) {
			pomocni = pomocni.sledeci;
		}
		
		pomocni.sledeci = novi;
	}
	
	public int izbaciSaPocetka() throws Exception {
		if(praznaLista()) {
			throw new Exception("Nema elementa za izbacivanje!");
		}
		int podatak = prvi.podatak;
		prvi = prvi.sledeci;
		return podatak;
	}
	
	public int izbaciSaKraja() throws Exception {
		if(praznaLista()) {
			throw new Exception("Nema elementa za izbacivanje!");
		}
		
		if(prvi.sledeci == null) {
			return izbaciSaPocetka();
		}
		
		CvorJSListe pom = prvi;
	
		while(pom.sledeci.sledeci != null) {
			pom = pom.sledeci;
		}
		
		int podatak = pom.sledeci.podatak;
		pom.sledeci = null;
		return podatak;
	}
	
}
