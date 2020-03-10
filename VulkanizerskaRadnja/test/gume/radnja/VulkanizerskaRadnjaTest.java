package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

/**
 * Klasa koja vrsi testove nad klasom VulkanizerskaRadnja
 * 
 * @author Lazar Popadic
 *
 */
public class VulkanizerskaRadnjaTest {

	private VulkanizerskaRadnja vr;
	private AutoGuma ag;
	private AutoGuma ag1;
	private AutoGuma ag2;

	@Before
	public void setUp() throws Exception {
		vr = new VulkanizerskaRadnja();
		ag = new AutoGuma();
		ag.setMarkaModel("Tigar");
		ag.setSirina(200);
		ag.setPrecnik(19);
		ag.setVisina(60);
		ag1 = new AutoGuma();
		ag2 = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		vr = null;
		ag = null;
		ag1 = null;
		ag2 = null;
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNULL() {
		vr.dodajGumu(null);
	}

	@Test
	public void testDodajGumu() {
		vr.dodajGumu(ag);
		assertTrue(vr.pronadjiGumu(ag.getMarkaModel()).contains(ag));
	}

	@Test
	public void testpronadjiGumuNull() {
		assertNull(vr.pronadjiGumu(null));

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testdodajGumuVecUneta() {
		ag1.setMarkaModel("Tigar");
		ag1.setSirina(200);
		ag1.setPrecnik(19);
		ag1.setVisina(60);
		vr.dodajGumu(ag);
		vr.dodajGumu(ag1);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testPronadjiGumuDuplikat() {
		vr.dodajGumu(ag);
		vr.dodajGumu(ag);
	}

	@Test
	public void testpronadjiGumuDimenzije() {
		vr.dodajGumu(ag);
		ag1.setMarkaModel("Tigar");
		ag1.setSirina(219);
		ag1.setPrecnik(19);
		ag1.setVisina(61);
		ag2.setMarkaModel("Jokohana");
		vr.dodajGumu(ag1);
		vr.dodajGumu(ag2);
		LinkedList<AutoGuma> testLista = new LinkedList<AutoGuma>();
		testLista.addFirst(ag);
		testLista.addFirst(ag1);
		assertEquals(testLista, vr.pronadjiGumu("Tigar"));
	}

	@Test
	public void testpronadjiGumuNemaJeUListi() {
		ag.setMarkaModel("Tigar");
		vr.dodajGumu(ag);
		assertTrue(vr.pronadjiGumu("Aaa").isEmpty());
	}

}
