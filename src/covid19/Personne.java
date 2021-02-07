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
import covid19.dataTypes.FirstNameType1;
import covid19.dataTypes.NameType;
import covid19.dataTypes.NameType1;
import covid19.dataTypes.PhoneNumberType;


/**
 * 
 * @author bouredjioua
 *
 */
public class Personne {

	private  NameType nom;
	private  FirstNameType1 prenom;
	private EmailType email;
	private PhoneNumberType numeroTel;
	private Date date;
	
	
	
	/**
	 * Constructeur de la classe Personne:
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param numeroTel
	 * @param dateEt
	 */
	public Personne(NameType nom, FirstNameType1 prenom, EmailType email, PhoneNumberType numeroTel, Date dateEt) {
		this.nom=nom;
		this.prenom=new FirstNameType1();;
		this.email=new EmailType();
		this.numeroTel=new PhoneNumberType();
		this.date=date;
	}
	
	
	public NameType getNom() {
		return nom;
	}
	public void setNom(NameType n) {
		this.nom =n;
	}
	/************************************/
	public FirstNameType1 getprenom() {
		return prenom;
	}
	public void setprenom(FirstNameType1 pren) {
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date d) {
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

	
	public String toString() {
		return "Nom : "+ nom.getNom()+", Prénom : "+prenom.getPrenom()+ ", Email : "+email.getEmail()+", Date de naissance : "+date+ ", Numéro de tel : "+numeroTel.getNumero();
	}
	
}
