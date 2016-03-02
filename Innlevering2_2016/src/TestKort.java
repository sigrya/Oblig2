
import java.util.ArrayList;
public class TestKort {
	 public static void main(String[] args) {

	 ArrayList<Kort> kortArray = new ArrayList<>();

	 Kort k1 = new Employee("Ole Olsen", 1234);
	 Kort k2 = new Guest("Marit Olsen", 9999);

	 kortArray.add(k1);
	 kortArray.add(k2);
	 for (Kort kort : kortArray) {
	 System.out.println(kort);
	 System.out.println("Kode 1234 er " + (kort.checkPIN(1234) ? "gyldig": "ugyldig"));
	 System.out.println("Kode 9999 er " + (kort.checkPIN(9999) ? "gyldig": "ugyldig"));
	 }
	 }
	}