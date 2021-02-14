package covid19;

import java.util.Date;
import java.util.Optional;

import javax.validation.constraints.NotNull;

import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType1;
import covid19.dataTypes.IdType;
import covid19.dataTypes.NameType;
import covid19.dataTypes.NameType1;
import covid19.dataTypes.NumeroEtudiant;
import covid19.dataTypes.PasswordType;
import covid19.dataTypes.PhoneNumberType;
import covid19.dataTypes.Asymptomatique;

public class Etudiant extends Utilisateur{


	private NumeroEtudiant numeroEtudiant;
	
	public Etudiant(NameType nom, FirstNameType1 prenom, EmailType email, PhoneNumberType numeroTel, Date dateEt,
			IdType identifiant, PasswordType motDePass, NumeroEtudiant numeroEtudiant, Optional<TestCovid> test) {
		super(nom, prenom, email, numeroTel, dateEt, identifiant, motDePass, test);
		this.numeroEtudiant = new NumeroEtudiant();
		
	}
	
	public NumeroEtudiant getNumeroEtudiant() {
		return numeroEtudiant;
	}
	public void setNumeroEtudiant(NumeroEtudiant num) {
		this.numeroEtudiant =num;
	}
	
	
	public String toString() {
		return (super.toString()+ ", Numero d'etudiant : "+getNumeroEtudiant().getNumeroEt()+ getTest().get().getValue().getValue());
	}
}
