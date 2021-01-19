package covid19.dataTypes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class NumeroEnseignant {
 
	@NotNull
	@Pattern(regexp = "")
	String numeroEns;
}
