package covid19.dataTypes;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmailType {

	@NotNull
	@Email 
	@Pattern(regexp="*@*")
	private static String email;

	public EmailType() {
		
	}
	
	public EmailType(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
