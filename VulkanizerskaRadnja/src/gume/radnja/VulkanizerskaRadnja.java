package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * Klasa koja opisuje vulkanizersku radnju, sadrzi listu guma i metode kojima se
 * dodaje i pronalazi guma u listi
 * 
 * 
 * @author Lazar Popadic
 *
 */

public class VulkanizerskaRadnja {
	/**
	 * Lista guma tipa AutoGuma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje gumu u listu gume
	 * 
	 * @param a Instanca klase AutoGuma
	 * @throws java.lang.RuntimeException Ako je parametar a null ili ako vec
	 *                                    postoji u listi
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi gumu na osnovu marke modela u listi guma ako marka modela nije null
	 * i vraca novu listu
	 * 
	 * @param markaModel Marka modela gume
	 * @return null Ako je prosledjeni parametar markaModel null, u suprotnom vraca
	 *         novu listu
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}