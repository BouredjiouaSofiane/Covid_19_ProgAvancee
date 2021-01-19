package covid19;

import java.util.Date;
import javax.validation.constraints.NotNull;

import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType;
import covid19.dataTypes.IdType;
import covid19.dataTypes.NameType;
import covid19.dataTypes.PasswordType;
import covid19.dataTypes.PhoneNumberType;

public class Utilisateur extends Personne{
	
	IdType identifiant = new IdType();
	PasswordType motDePass = new PasswordType();
	
	
	/**
	 * Constructeur de la classe Utilisateur;
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param numeroTel
	 * @param date
	 * @param identifiant
	 * @param motDePass
	 */
	public Utilisateur(NameType nom, FirstNameType prenom, EmailType email, PhoneNumberType numeroTel, DateType date, IdType identifiant, PasswordType motDePass) {
		super(nom, prenom, email, numeroTel, date);
		this.identifiant=identifiant;
		this.motDePass=motDePass;
	}

	

	public IdType getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(IdType id) {
		this.identifiant =id;
	}
	
	public PasswordType getMotDePass() {
		return motDePass;
	}
	public void setMDP(PasswordType mdp) {
		this.motDePass =mdp;
	}
	
	
	public void connexion() {
		/**
		 * a faire : connecter a la bdd
		 */
	}
	
	public void deconnexion() {
		/**
		 * a faire 
		 */
	}
	
	public void ChangeMDP(PasswordType mdp) {
		this.motDePass = mdp;
	}
	
	
}