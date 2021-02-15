package covid19;

import java.util.Date;
import java.util.Vector;

import covid19.dataTypes.CourseType;
import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType1;
import covid19.dataTypes.HourType;
import covid19.dataTypes.IdType;
import covid19.dataTypes.NameType1;
import covid19.dataTypes.NumeroEnseignant;
import covid19.dataTypes.PasswordType;
import covid19.dataTypes.PhoneNumberType;

public class Cours {
//attributs du cours;
	private CourseType nomCours;
	private DateType date;
	private HourType heure;
	  
	
	/**
	 * Constructeur de la classe Cours:
	 * @param nomCours
	 * @param date
	 */
	public Cours(CourseType nomCours, DateType date, HourType heure) {
		nomCours = new CourseType();
		date = new DateType();
		
	}
	
	public CourseType getNomCours() {
		return nomCours;
	}
	public void setNomCours(CourseType n) {
		this.nomCours =n;
	}
	/*********************************/
	
	public String getSalleId() {
		return Salle.getIdSalle();
	}
	
	
	/*********************************/

	public DateType getDateCours() {
		return date;
	}
	
	public void setIdSalle(DateType d) {
		this.date = d;
	}
	
}
