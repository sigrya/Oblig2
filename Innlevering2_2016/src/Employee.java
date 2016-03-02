import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.LogRecord;

public class Employee extends Kort implements Konstanter{
	double lonn;
	GregorianCalendar ansatt;
	
	public Employee(String navn, int pinkode) {
		super(navn, pinkode);
		this.lonn = 200;
		ansatt = new GregorianCalendar();
	}
	
	public Employee(String navn, int pinkode, GregorianCalendar ansatt) {
		super(navn, pinkode);
		this.lonn = 200;
		this.ansatt = ansatt;
	}
	
	@Override
	public boolean sjekkPin(int pin) {  
		if (isSperretKort())
			return false;
		
		GregorianCalendar date = new GregorianCalendar();
		int hour = date.get(Calendar.HOUR_OF_DAY);
		int day = date.get(Calendar.DAY_OF_WEEK);
		
		if (hour >=7 && hour <=17 && day !=1 && day !=7)
			return true;
		if (pin == getPinkode())
			return true;
		return false;	
		
		}

	@Override
	public String hentFornavn() {
		return super.getFornavn();
	}

	@Override
	public String hentEtternavn() {
		return super.getEtternavn();
	}

	@Override
	public void setFulltNavn(String navn) {
		String[] names = navn.split(" ", 2);
		setFornavn(names[0]);
		setEtternavn(names[1]);
	}

	@Override
	public String hentFulltNavn() {
		return super.getNavn();
	}

	@Override
	public double beregnKreditt() {
		return lonn * KREDITT_FAKTOR;
	}

	@Override
	public double beregnBonus() {
		int aarNaa = new GregorianCalendar().get(Calendar.YEAR);
		int aarAnsatt = ansatt.get(Calendar.YEAR);
		return (aarNaa- aarAnsatt) * BONUS_FAKTOR;
	}
	
	}

