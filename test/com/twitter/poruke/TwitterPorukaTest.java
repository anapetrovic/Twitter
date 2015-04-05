/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ana
 *
 */
public class TwitterPorukaTest {
	
	private  TwitterPoruka tp;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tp=new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tp=null;
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {
		tp.setKorisnik("ignjat_se_zovem");
		
		assertEquals("ignjat_se_zovem", tp.getKorisnik());
	}
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		tp.setKorisnik(null);
		
	}
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikEmptyString() {
		tp.setKorisnik("");
		
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPoruka() {
		tp.setPoruka("Jer si OK? Jersam.");
		
		assertEquals("Jer si OK? Jersam.", tp.getPoruka());
	}
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		tp.setPoruka(null);
	}
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPreduga() {
		tp.setPoruka("National Geographic Srbija upoznaje vas sa svemirskim agencijama koje uspešno lansiraju rakete i drugu opremu u svemir. Danas vam predstavljamo vam najvecu svemirsku agenciju Japana."
				+ "Japanska agencija za istrazivanje vazduhoplovstva i svemira ili JAXA (Jaksa) je japanska drzavna agencija koja je nastala 1. oktobra 2003. godine spajanjem Nacionalne agencije za razvoj svemira (NASDA), Nacionalne vazduhoplovno-svemirske laboratorije Japana (NAL) i Instituta za svemirsku i vazduhoplovnu nauku (ISAS)."
				+ "JAXA je odgovorna za istrazivanje i razvoj tehnologija, lansiranje satelita u orbitu i ukljucena je u mnogobrojne napredne misije, poput istrazivanja asteroida i moguceg slanja ljudske posade na Mesec.geslo agencije glasi: Jedna JAXA , a korporativni slogan je - Istraživanje radi shvatanja."
				+ "Godine 2012. donet je novi zakon, kojim se omogucava da pored mirovnih, JAXA radi i na nekim vojnim svemirskim tehnologijama, poput sistema za upozorenje od raketnih napada. Agencija je bila formirana kao nezavisna administrativna institucija pod upravom Ministarstva obrazovanja, kulture, sporta, nauke i tehnologije (MEXT) i Ministarstva unutrašnjih poslova i komunikacija (MIC). "
				+ "Zakonom iz 2012. godine, politicka kontrola Jakse preneta je sa MEXT-a na Kancelariju premijera kroz novoosnovanu Kancelariju za svemirsku strategiju."
				+ "JAXA obuhvata nekoliko organizacija i to: Direktorat za misije svemirskog transporta, Prvi direktorat za misije satelitske primene, Drugi direktorat za misije satelitske primene, Direktorat za misije sa ljudskom posadom, Direktorat za vazduhoplovna istrazivanja i razvoj, Institut za svemirsku i vazduhoplovnu nauku (ISAS) i Institut za vazduhoplovnu tehnologiju."
				+ "Sediste Jakse nalazi se u gradu Cofu u prefekturi Tokio, dok se istrazivacki centri nalaze sirom Japana. Takodje, JAXA ima nekoliko kancelarija u drugim delovima sveta. Centar japanske svemirske mreze nalazi se u Cukubi u prefekturi Ibaraki i zove se Cukupa svemirski centar (TKSC). Centar je ukljucen u istrazivanje i razvoj satelita i raketa, kao i pracenje i kontrolu satelita."
				+ " U njemu se razvija eksperimentalna oprema za Japanski eksperimentalni modul Kibo. U ovom centru takodje se obucavaju astronauti. Za potrebe operacija na Medjunarodnoj svemirskoj stanici, Tim japanske kontrole letenja nalazi se u Centru za integraciju i promociju svemirske stanice (SSIPC) u istom gradu. SSIPC regularno komunicira sa posadom Medjunarodne svemirske stanice");


	}


	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		tp.setPoruka("Jer si OK? Jersam.");
		tp.setKorisnik("ignjat_se_zovem");
		
	
		assertEquals("KORISNIK:ignjat_se_zovem PORUKA:Jer si OK? Jersam.", tp.toString());
	}

}
