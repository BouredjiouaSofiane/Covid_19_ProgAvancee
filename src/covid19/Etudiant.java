package covid19;

import java.util.Date;

import javax.validation.constraints.NotNull;

import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType;
import covid19.dataTypes.IdType;
import covid19.dataTypes.NameType;
import covid19.dataTypes.NumeroEtudiant;
import covid19.dataTypes.PasswordType;
import covid19.dataTypes.PhoneNumberType;
import covid19.dataTypes.ValueTestCovid;

public class Etudiant extends Utilisateur{


	TestCovid test;
	private NumeroEtudiant numeroEtudiant;
	
	public Etudiant(NameType nom, FirstNameType prenom, EmailType email, PhoneNumberType numeroTel, Date dateEt,
			IdType identifiant, PasswordType motDePass, NumeroEtudiant numeroEtudiant, TestCovid test) {
		super(nom, prenom, email, numeroTel, dateEt, identifiant, motDePass);
		this.numeroEtudiant = new NumeroEtudiant();
		this.test=new TestCovid();
	}
	
	public NumeroEtudiant getNumeroEtudiant() {
		return numeroEtudiant;
	}
	public void setNumeroEtudiant(NumeroEtudiant num) {
		this.numeroEtudiant =num;
	}
	
	
	public String toString() {
		return (super.toString()+ ", Numero d'etudiant : "+getNumeroEtudiant().getNumeroEt()+ this.test.getValue());
	}
}
