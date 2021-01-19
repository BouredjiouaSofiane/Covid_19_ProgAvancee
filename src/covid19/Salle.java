package covid19;

public class Salle {

	protected static String idSalle;
	/**
	 * Constructeur de la classe Salle:
	 * @param idSalle
	 */
	public Salle(String idSalle) {
		this.idSalle=idSalle;
	}
	
	public static String getIdSalle() {
		return idSalle;
	}
	
	public void setIdSalle(String id) {
		this.idSalle = id;
	}
	/**
	 * A comleter apres /.......................
	 * @param idSalle
	 * @return
	 */
	public boolean isCluster(String idSalle) {
		boolean etat = true;
		if(etat) {
			return true;
		}
		else return false;
	}
	
	public void desinfecter() {
		System.out.println("La salle est un cluster et doit etre desinfecte !!");
	}
	
}
