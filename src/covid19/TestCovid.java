package covid19;

import java.util.Date;

import javax.validation.constraints.Past;

import covid19.dataTypes.ValueTestCovid;

public class TestCovid {
	
	@Past
	private Date dateTest;
	@Past
	private Date dateSymptomes;
	ValueTestCovid value = new ValueTestCovid();
	
	public TestCovid(Date dateTest, Date dateSymptomes) {
		this.dateTest=dateTest;
		this.dateSymptomes=dateSymptomes;
	}
	
	public boolean isPositif() {
		if(value.equals("positif")) {
			return true;
		}else return false;
	}
	
	public void notification(Utilisateur ut) {
		if(isPositif()) {
			if(ut.identifiant.equals("..."))		// voir si lutilisateur est un etudiant  
			System.out.println("l'etudiant "+ut.identifiant+"est atteint du covid19, veuilly faire vos tests le plus vite possible !"); 
		}else {// si l'utilisateur est un enseignant ...
			System.out.println("l'enseignant "+ut.identifiant+"est atteint du covid19, veuillez faire vos tests le plus vite possible");
		}
	}
	
}
