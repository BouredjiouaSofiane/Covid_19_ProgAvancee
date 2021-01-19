package covid19;

import java.util.Date;

import javax.validation.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType;
import covid19.dataTypes.NameType;
import covid19.dataTypes.PhoneNumberType;


/**
 * 
 * @author bouredjioua
 *
 */
public class Personne {

	NameType nom = new NameType();
	FirstNameType prenom = new FirstNameType();
	EmailType email = new EmailType();
	PhoneNumberType numeroTel = new PhoneNumberType();
	DateType date = new DateType();
	
	
	
	/**
	 * Constructeur de la classe Personne:
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param numeroTel
	 * @param date
	 */
	public Personne(NameType nom, FirstNameType prenom, EmailType email, PhoneNumberType numeroTel, DateType date) {
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.numeroTel=numeroTel;
		this.date=date;
	}
	
	
	public NameType getNom() {
		return nom;
	}
	public void setNom(NameType n) {
		this.nom =n;
	}
	/************************************/
	public FirstNameType getprenom() {
		return prenom;
	}
	public void setprenom(FirstNameType pren) {
		this.prenom =pren;
	}	
	/************************************/
	public EmailType getEmail() {
		return email;
	}
	public void setEmail(EmailType em) {
		this.email =em;
	}
	/************************************/
	public DateType getDate() {
		return date;
	}
	public void setDate(DateType d) {
		this.date =d;
	}
	/************************************/
	public PhoneNumberType getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(PhoneNumberType numtel) {
		this.numeroTel =numtel;
	}
	/************************************/

	
	
}
