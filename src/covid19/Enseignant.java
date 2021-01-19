package covid19;


import javax.validation.constraints.NotNull;

import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType;
import covid19.dataTypes.IdType;
import covid19.dataTypes.NameType;
import covid19.dataTypes.NumeroEnseignant;
import covid19.dataTypes.NumeroEtudiant;
import covid19.dataTypes.PasswordType;
import covid19.dataTypes.PhoneNumberType;

import java.util.Date;

public class Enseignant extends Utilisateur{

	
	NumeroEnseignant numeroEnseignant = new NumeroEnseignant();

	
	public Enseignant(NameType nom, FirstNameType prenom, EmailType email, PhoneNumberType numeroTel, DateType date,
			IdType identifiant, PasswordType motDePass, NumeroEnseignant numeroEnseignant) {
		super(nom, prenom, email, numeroTel, date, identifiant, motDePass);
		this.numeroEnseignant= numeroEnseignant;
	
	}
	
	
	public NumeroEnseignant getNumeroEnseignant() {
		return numeroEnseignant;
	}
	public void setNumeroEnseignant(NumeroEnseignant num) {
		this.numeroEnseignant =num;
	}
	
	
}