public abstract class Kort {
	//Set Default values for variables
	private String fornavn;
	private String etternavn;
	private int pinkode;
	private int kortnummer;
	private boolean sperretKort = false;
	private static int antallKort;
	
	//Return fornavn
	public String getFornavn() {
		return fornavn;
	}
	//Set fornavn
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	//Return etternavn
	public String getEtternavn() {
		return etternavn;
	}
	//Set etternavn
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	//Set Pin
	public int getPinkode() {
		return pinkode;
	}
	//Return pin
	public void setPinkode(int pinkode) {
		this.pinkode = pinkode;
	}
	//Set kortnummer
	public int getKortnummer() {
		return kortnummer;
	}
	//Return kortnummer
	public void setKortnummer(int kortnummer) {
		this.kortnummer = kortnummer;
	}	
	//return sperretKort
	public boolean isSperretKort() {
		return sperretKort;
	}
	//Set new filled
	public void setSperretKort(boolean sperretKort) {
		this.sperretKort = sperretKort;
	}
	//Abstract method
		public abstract void sjekkPin();
		
	//StingtoSting
	public String toString() {
		return "Fornavn: " + fornavn + " \nEtternavn: " + etternavn + " \nKortnummer: " + kortnummer + "\nSperret: " +sperretKort;
	}
	
}