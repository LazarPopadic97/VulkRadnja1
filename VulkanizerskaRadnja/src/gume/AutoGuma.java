package gume;

/**
 * Klasa koja sadrzi informacije o auto gumi
 * 
 * @author Lazar Popadic
 *
 */
public class AutoGuma {
	/**
	 * Atribut koji oznacava marku modela gume
	 */
	private String markaModel = null;
	/**
	 * Atribut koji oznacava precnik gume
	 */
	private int precnik = 0;
	/**
	 * Atribut koji oznacava sirinu gume
	 */
	private int sirina = 0;
	/**
	 * Atribut koji oznacava visinu gume 
	 */
	private int visina = 0;
	/**
	 * Vraca marku modela gume
	 * @return markaModel Marka modela gume
	 */
	public String getMarkaModel() {
	return markaModel;
	}
	/**
	 * Postavlja vrednost marke modela gume na prosledjenu vrednost
	 * @param markaModel Marka modela gume
	 * @throws java.lang.RuntimeException Ako je marka modela null vrednost ili duzina njenog naziva ispod 3 karaktera
	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null || markaModel.length()<3)
	throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	/**
	 * Vraca precnik gume
	 * @return precnik Precnik gume
	 */
	public int getPrecnik() {
	return precnik;
	}
	/**
	 * Postavlja precnik gume na prosledjenu vrednost
	 * @param precnik Precnik gume
	 * @throws java.lang.RuntimeException Ako je precnik ispod 13 ili iznad 22 mj
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 && precnik > 22)
	throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	/**
	 * Vraca vrednost sirine gume
	 * @return sirina Sirina gume
	 */
	public int getSirina() {
	return sirina;
	}
	/**
	 * Postavlja vrednost sirine za prosledjenu vrednost
	 * @param sirina Sirina gume
	 * @throws java.lang.RuntimeException Ako je sirina ispod 135 ili preko 355 mj
	 */
	public void setSirina(int sirina) {
	if (sirina < 135 && sirina > 355)
	throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
	}
	/**
	 * Vraca vrednost sirine
	 * @return visina Visina gume
	 */
	public int getVisina() {
	return visina;
	}
	/**
	 * Postavlja vrednost visine na prosledjenu vrednost
	 * @param visina Visina gume
	 * @throws java.lang.RuntimeException Ako je vrednost visine ispod 25 ili iznad 96 mj
	 */
	public void setVisina(int visina) {
	if (visina < 25 || visina > 95)
	throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}
	/**
	 * Ispisuje podatke o auto gumi (marka modela, precnik, sirina i visina)
	 */
	@Override
	public String toString() {
	return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
	", sirina=" + sirina + ", visina=" + visina + "]";
	}
	/**
	 * Proverava da li su dve auto gume iste 
	 * @return true Ako su vrednosti obe gume za marku modela, precnik, sirinu i visinu isti 
	 * U suprotnom vraca false
	 */
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
	return false;
	} else if (!markaModel.equals(other.markaModel))
	return false;
	if (precnik != other.precnik)
	return false;
	if (sirina != other.sirina)
	return false;
	if (visina != other.visina)
	return false;
	return true;
	}

}
