package covid19;

import java.util.Date;

public class Cours {

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
