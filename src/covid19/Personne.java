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
import covid19.dataTypes.FirstNameType1;
import covid19.dataTypes.NameType;
import covid19.dataTypes.NameType1;
import covid19.dataTypes.PhoneNumberType;

/**
 * 
 * @author portable
 *
 */

public class Personne {
	String nom1=null;
	String prenom1 =null;
	Nomtype nom = new Nomtype(nom1);
	private  FirstNameType prenom;
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
	public Personne(Nomtype nom, FirstNameType prenom, EmailType email, PhoneNumberType numeroTel, Date dateEt) {
		
		this.prenom=new FirstNameType(prenom1);
		this.email=new EmailType();
		this.numeroTel=new PhoneNumberType();
		this.date=date;
	}
	
	/*
	public NameType getNom() {
		return nom;
	}
	public void setNom(NameType n) {
		this.nom =n;
	}
	
	*/
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
		return "Nom : "+ nom.getClass().getRecordComponents()+", Pr�nom : "+prenom.getClass().getRecordComponents().toString()+ ", Email : "+email.getEmail()+", Date de naissance : "+date+ ", Num�ro de tel : "+numeroTel.getNumero();
	}
	
}
