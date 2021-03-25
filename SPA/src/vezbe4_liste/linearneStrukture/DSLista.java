package vezbe4_liste.linearneStrukture;

import vezbe4_liste.cvorovi.CvorDSListe;

public class DSLista {
	
	CvorDSListe prvi;
	
	public DSLista() {
		prvi = null;
	}	
	
	public boolean praznaLista() {
		return prvi == null;
	}
	
	public void ubaciNaPocetak(int podatak) {
		CvorDSListe novi = new CvorDSListe(null, podatak, prvi);
		if(!praznaLista()) {
			prvi.prethodni = novi;
		}
		prvi = novi;
	}
	
	public void ubaciNaKraj(int podatak) {
		if(praznaLista()) {
			ubaciNaPocetak(podatak);
			return;
		}
		
		CvorDSListe pom = prvi;
		
		while(pom.sledeci != null) {
			pom = pom.sledeci;
		}
		
		CvorDSListe novi = new CvorDSListe(pom, podatak, null);
		pom.sledeci = novi;
	}
	
	public int izbaciSaPocetka() throws Exception {
		if(praznaLista()) {
			throw new Exception("Lista je prazna!");
		}
		
		int podatak = prvi.podatak;
		
		if(prvi.sledeci != null) {
			prvi.sledeci.prethodni = null;
		}
		
		prvi = prvi.sledeci;
		
		return podatak;
	}
	
	public int izbaciSaKraja() throws Exception {
		if(praznaLista()) {
			throw new Exception("Lista je prazna!");
		}
		
		if(prvi.sledeci == null) {
			return izbaciSaPocetka();
		}
		
		CvorDSListe pom = prvi;
		
		while(pom.sledeci.sledeci != null) {
			pom = pom.sledeci;
		}
		
		int podatak = pom.sledeci.podatak;
		
		pom.sledeci = null;
		
		return podatak;
	}
	
}
