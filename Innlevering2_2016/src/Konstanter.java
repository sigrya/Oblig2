
public interface Konstanter {
	
	double KREDITT_FAKTOR = 1.2, BONUS_FAKTOR = 1.5;
	
	void  setFornavn(String fornavn);
	String hentFornavn();
	
	void setEtternavn(String etternavn);
	String hentEtternavn();
	
	void setFulltNavn(String navn);
	String hentFulltNavn();
	
	double beregnKreditt();
	
	double beregnBonus();
}