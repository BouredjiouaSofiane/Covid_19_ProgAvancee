package covid19;

import java.util.Date;
import java.util.Vector;

import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType1;
import covid19.dataTypes.IdType;
import covid19.dataTypes.NameType1;
import covid19.dataTypes.NumeroEnseignant;
import covid19.dataTypes.PasswordType;
import covid19.dataTypes.PhoneNumberType;

public class Cours {
//attributs du cours;
	private String nomCours;
	private Date date;
	
	
	
	/**
	 * Constructeur de la classe Cours:
	 * @param nomCours
	 * @param idSalle
	 * @param date
	 */
	public Cours(String nomCours, Date date) {
		this.nomCours= nomCours;
		this.date = date;
	
	}
	
	public String getNomCours() {
		return nomCours;
	}
	public void setNomCours(String n) {
		this.nomCours =n;
	}
	/*********************************/
	
	public String getSalleId() {
		return Salle.getIdSalle();
	}
	
	
	/*********************************/

	public Date getDateCours() {
		return date;
	}
	
	public void setIdSalle(Date d) {
		this.date = d;
	}
	
}
