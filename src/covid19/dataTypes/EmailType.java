package covid19.dataTypes;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmailType {

	@NotNull
	@Email 
	@Pattern(regexp="*@*")
	private String email;

	
}
