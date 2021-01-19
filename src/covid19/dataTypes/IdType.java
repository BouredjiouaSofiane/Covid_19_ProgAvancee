package covid19.dataTypes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class IdType {

	@NotNull
	@Pattern(regexp = "[a-zA-Z0-9_]")
	private String id;
}
