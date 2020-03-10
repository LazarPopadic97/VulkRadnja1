package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Klasa koja vrsi testove nad klasom AutoGuma
 * @author Lazar Popadic
 *
 */
public class AutoGumaTest {

	private AutoGuma ag1;

	@Before
	public void setUp() throws Exception {
		ag1=new AutoGuma();
		
	}

	@After
	public void tearDown() throws Exception {
		ag1=null;
		
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		ag1.setMarkaModel(null);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelDuzina1() {
		ag1.setMarkaModel("a");
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelDuzina2() {
		ag1.setMarkaModel("aa");
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazab() {
		ag1.setMarkaModel("");
	}
	@Test
	public void testSetMarkaModelDobra() {
		ag1.setMarkaModel("Tigar");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikIspod() {
		ag1.setPrecnik(2);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikIznad() {
		ag1.setPrecnik(25);
	}
	@Test
	public void testSetPrecnikDobar() {
		ag1.setPrecnik(18);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaIspod() {
		ag1.setSirina(90);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaIznad() {
		ag1.setSirina(500);
	}
	@Test 
	public void testSetSirinaDobar() {
		ag1.setSirina(200);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaIspod() {
		ag1.setVisina(20);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaIznad() {
		ag1.setVisina(100);
	}
	@Test 
	public void testSetVisinaDobar() {
		ag1.setVisina(56);
	}
	@Test
	public void testToString() {
		ag1.setMarkaModel("Tigar");
		ag1.setPrecnik(18);
		ag1.setSirina(200);
		ag1.setVisina(70);
		String a = ag1.toString();
		
		assertTrue( a.contains("Tigar") );
		assertTrue( a.contains("18") );
		assertTrue( a.contains("200") );
		assertTrue( a.contains("70") );

	}

	@Test
	public void testEqualsObject() {
		ag1.setPrecnik(18);
		ag1.setMarkaModel("Tigar");
		ag1.setSirina(200);
		ag1.setVisina(70);
		AutoGuma ag2=new AutoGuma();
		ag2.setMarkaModel("Tigar");
		ag2.setPrecnik(18);
		ag2.setSirina(200);
		ag2.setVisina(70);
		assertTrue(ag1.equals(ag2));
		}

}
