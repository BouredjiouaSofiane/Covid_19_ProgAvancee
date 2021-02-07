package covid19.dataTypes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class FirstNameType1 {

	@NotNull(message = "Ce champs ne doit pas être vide ! ")
	@Size(min = 1, max=25)
	@Pattern(regexp= "[^0-9]*")
	private static String prenom;

	public FirstNameType1() {
		
	}
	
	public FirstNameType1(String prenom) {
		this.prenom= prenom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
}
