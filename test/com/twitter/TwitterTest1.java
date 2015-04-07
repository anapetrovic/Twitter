/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * @author Ana
 *
 */
public class TwitterTest1 {
	
	private Twitter t;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		t=new Twitter();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.twitter.Twitter#vratiSvePoruke()}.
	 */
	@Test
	public void testVratiSvePoruke() {
		t.unesi("Ana", "Lep dan");
		t.unesi("Ivana", "Veoma lep dan");
		
		assertEquals("Ana", t.vratiSvePoruke().get(0).getKorisnik());
		assertEquals("Lep dan", t.vratiSvePoruke().get(0).getPoruka());
		assertEquals("Ivana", t.vratiSvePoruke().get(1).getKorisnik());
		assertEquals("Veoma lep dan", t.vratiSvePoruke().get(1).getPoruka());
		assertEquals(2, t.vratiSvePoruke().size());
		
	}

	/**
	 * Test method for {@link com.twitter.Twitter#unesi(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUnesi() {
		t.unesi("Ana", "Lep dan");
		assertEquals("Ana", t.vratiSvePoruke().get(0).getKorisnik());
		assertEquals("Lep dan", t.vratiSvePoruke().get(0).getPoruka());
		assertEquals(1, t.vratiSvePoruke().size());
	}

	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeNull() {
		t.vratiPoruke(2, null);
	}
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeEmptyString() {
		t.vratiPoruke(2, "");
	}
	/**
	 * Test method for {@link com.twitter.Twitter#vratiPoruke(int, java.lang.String)}.
	 */
	@Test 
	public void testVratiPoruke() {
		t.unesi("Ana", "Lep dan");
		t.unesi("Ivana", "Veoma lep dan");
		
		assertEquals("Ana", t.vratiPoruke(5, "dan")[0].getKorisnik());
	}

}
