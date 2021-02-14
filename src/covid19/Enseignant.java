package covid19;


import javax.validation.constraints.NotNull;


import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType1;
import covid19.dataTypes.IdType;
import covid19.dataTypes.NameType;
import covid19.dataTypes.NameType1;
import covid19.dataTypes.NumeroEnseignant;
import covid19.dataTypes.NumeroEtudiant;
import covid19.dataTypes.PasswordType;
import covid19.dataTypes.PhoneNumberType;

import java.util.Date;
import java.util.Optional;

public class Enseignant extends Utilisateur{
	
	NumeroEnseignant numeroEnseignant;

	
	public Enseignant(NameType nom, FirstNameType1 prenom, EmailType email, PhoneNumberType numeroTel, Date date,
			IdType identifiant, PasswordType motDePass, NumeroEnseignant numeroEnseignant, Optional<TestCovid> test) {
		super(nom, prenom, email, numeroTel, date, identifiant, motDePass, test);
		this.numeroEnseignant = new NumeroEnseignant();
	
	}
	
	
	public NumeroEnseignant getNumeroEnseignant() {
		return numeroEnseignant;
	}
	public void setNumeroEnseignant(NumeroEnseignant num) {
		this.numeroEnseignant =num;
	}
	
	public String toString() {
		return super.toString()+", Numero enseignant : "+this.getNumeroEnseignant()+ getTest().get().getValue();
	}
}
