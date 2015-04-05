package com.twitter.poruke;

/**
 * Predstavlja twitter poruku nekog korisnika.
 * 
 * @author Ana
 *
 */
public class TwitterPoruka {
	
	/**
	 * Ime korisnika
	 */
	
	private String korisnik; 
	
	/**
	 * Tekst poruke
	 */
	
	private String poruka;  
	
	/**
	 * Metoda vraca ime korisnika, tj. vrednost atributa korisnik.
	 * @return ime korisnika kao String
	 */
	
	public String getKorisnik() {
		return korisnik; 
		}  
	
	/**
	 * Metoda postavlja ime korisnika na unetu vrednost
	 * @param korisnik novo ime korisnika
	 * @throws java.lang.RuntimeException ako je uneto ime korisnika null ili prazan String
	 */
	
	public void setKorisnik(String korisnik) { 
		if (korisnik==null || korisnik.equals("")) 
			throw new RuntimeException( "Ime korisnika mora biti uneto"); 
		this.korisnik = korisnik; 
		}  
	
	/**
	 * Metoda vraca tekst poruke, tj. vrednost atributa poruka.
	 * @return tekst poruke kao String
	 */
	
	public String getPoruka() { 
		return poruka; 
		} 
	
	/**
	 * Metoda postavlja tekst poruke na unetu vrednost
	 * @param poruka novi sadrzaj poruke
	 * @throws java.lang.RuntimeException ako je uneti tekst poruke null ili String duzi od 140 znakova
	 */
	
	public void setPoruka(String poruka) { 
		if (poruka==null || poruka.length()>140)
			throw new RuntimeException( "Poruka mora biti uneta i mora imati najvise 140 znakova"); 
		this.poruka = poruka; 
		}  
	
	/**
	 * Metoda vraca podatke o twitter poruci u formaru "KORISNIK: korisnik PORUKA: poruka"
	 * Gde korisnik predstavlja ime korisnika a poruka sadrzaj poruke
	 */
	
	public String toString(){ 
		return "KORISNIK:"+korisnik+" PORUKA:"+poruka; 
		}  

}
