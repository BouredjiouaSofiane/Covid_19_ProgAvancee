package covid19.dataTypes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class IdType {

	@NotNull
	@Pattern(regexp = "[a-zA-Z0-9_]")
	private static String id;

	public IdType() {
		
	}
	
	public IdType(String id) {
		this.id=id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
