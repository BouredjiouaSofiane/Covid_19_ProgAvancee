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

public class Etudiant extends Utilisateur{

	String valeurTest;
	NumeroEtudiant numeroEtudiant = new NumeroEtudiant();
	
	public Etudiant(NameType nom, FirstNameType prenom, EmailType email, PhoneNumberType numeroTel, DateType date,
			IdType identifiant, PasswordType motDePass, NumeroEtudiant numeroEtudiant) {
		super(nom, prenom, email, numeroTel, date, identifiant, motDePass);
		
	}
	
	public NumeroEtudiant getNumeroEtudiant() {
		return numeroEtudiant;
	}
	public void setNumeroEtudiant(NumeroEtudiant num) {
		this.numeroEtudiant =num;
	}
	public String toString() {
		return this.nom+ " "+this.prenom+ " "+this.date+" "+this.email+" "+this.numeroTel+" "+this.identifiant+" "+this.numeroEtudiant+" "+this.motDePass+" ";
	}
}
