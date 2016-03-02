
public interface Konstanter {
	
	void  setFornavn(String fornavn);
	String hentFornavn();
	
	void setEtternavn(String etternavn);
	String hentEtternavn();
	
	void setFulltNavn();
	String hentFulltNavn();
	
	double beregnKreditt();
	
	double beregnBonus();
}