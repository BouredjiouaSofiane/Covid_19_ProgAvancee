package covid19.dataTypes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class PasswordType {

	@NotNull(message = "renseignez votre mot de passe !")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d\\W]{8,20}$")
	private static String pass;

	public PasswordType() {
		
	}
	
	public PasswordType(String pass) {
		this.pass=pass;
	}
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
