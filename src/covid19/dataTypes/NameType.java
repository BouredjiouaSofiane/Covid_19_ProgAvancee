package covid19.dataTypes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class NameType {

	@NotNull(message = "Ce champs ne doit pas être vide ! ") 
	@Size(min = 1, max=25)
	@Pattern(regexp= "[^0-9]*")
	private static String nom;
	
	public NameType(String nom) {
		this.nom = nom;
	}
	
	public NameType() {
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
}
