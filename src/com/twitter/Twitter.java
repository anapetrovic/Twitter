package com.twitter;

import java.util.LinkedList; 
import com.twitter.poruke.TwitterPoruka; 

/**
 * Program za unos i pretrazivanje twitter poruka
 * 
 * @author Ana
 *
 */
public class Twitter {  
	
	/**
	 * Lista poruka
	 */
	private LinkedList<TwitterPoruka> poruke = new LinkedList<TwitterPoruka>(); 
	
	/**
	 * Metoda vraca sve poruke tj. listu objekata klase TwitterPoruka.
	 * @return poruke kao LinkedList
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke(){ 
		return poruke; 
	} 
	
	/**
	 * Metoda unosi novu poruku na kraj liste
	 * @param korisnik novo ime korisnika
	 * @param poruka novi tekst poruke
	 */
	public void unesi(String korisnik, String poruka) { 
		//Pravi se nova poruka i puni podacima. 
		TwitterPoruka tp = new TwitterPoruka(); 
		tp.setKorisnik(korisnik); 
		tp.setPoruka(poruka);  
		
		//Poruka se unosi u listu na kraj
		poruke.addLast(tp); 
	}  
	/**
	 * Metoda vraca sve poruke koje sadrze odredjeni tag
	 * @param maxBroj maksimalan broj elemenata u nizu
	 * @param tag hashtag poruke
	 * @return twitter poruke kao niz
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) { 
		 if (tag==null || tag.isEmpty()) 
			 throw new RuntimeException("Morate uneti tag"); 
		 
		//Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka 
		 if (maxBroj<=0) 
			 maxBroj = 100;     
		 
		 //Pomocna promenljiva koja predstavlja brojac upisanih poruka 
		 int brojac = 0; 
		 
		 //Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace 
		 //sve poruke koje u sebi imaju zadati tag
		 
	TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];  
	//Pretrazuju se poruke i traze se one koje sadrze tag. 
	//Ako se nadje neka takva, i ako nije prekoracen maxBroj 
	//ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga 
	//se prekida. 
	for (int i = 0; i < poruke.size(); i++) 
		if (poruke.get(i).getPoruka().indexOf(tag)!=-1) 
			if (brojac < maxBroj){ 
				rezultat[brojac]=poruke.get(i); 
				brojac++; 
			} 
			else break;  
	return rezultat;
	}  
}


