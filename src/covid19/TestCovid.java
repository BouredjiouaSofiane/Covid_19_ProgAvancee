package covid19;

import java.util.Date;

import javax.validation.constraints.Past;

import covid19.dataTypes.DateType;
import covid19.dataTypes.ValueTestCovid;

public class TestCovid {
	
	@Past
	private static DateType dateTest;
	@Past
	private static DateType dateSymptomes;
	private static ValueTestCovid value;
	
	
	public TestCovid(DateType dateTest, DateType dateSymptomes, ValueTestCovid value) {
		this.dateTest=new DateType();
		this.dateSymptomes=new DateType();
		this.value = new ValueTestCovid();
	}
	
	public TestCovid() {
		
	}
	
	public static DateType getDateTest() {
		return dateTest;
	}

	public static void setDateTest(DateType dateTest) {
		TestCovid.dateTest = dateTest;
	}

	public static DateType getDateSymptomes() {
		return dateSymptomes;
	}

	public static void setDateSymptomes(DateType dateSymptomes) {
		TestCovid.dateSymptomes = dateSymptomes;
	}

	public static ValueTestCovid getValue() {
		return value;
	}

	public static void setValue(ValueTestCovid value) {
		TestCovid.value = value;
	}

	public void afficherTestCovid() {
		System.out.println("Value : "+this.value.getValue()+", Date du test : "+this.dateTest.getDate()+", Date d'apparition des symptomes :"+this.dateSymptomes.getDate());
	}
	
	
	public boolean isPositif() {
		if(value.equals("positif")) {
			return true;
		}else return false;
	}
	
	public void notification(Utilisateur ut) {
		if(isPositif()) {
			if(ut.getIdentifiant().equals("..."))		// voir si lutilisateur est un etudiant  
			System.out.println("l'etudiant "+ut.getIdentifiant()+"est atteint du covid19, veuilly faire vos tests le plus vite possible !"); 
		}else {// si l'utilisateur est un enseignant ...
			System.out.println("l'enseignant "+ut.getIdentifiant()+"est atteint du covid19, veuillez faire vos tests le plus vite possible");
		}
	}
	
}
