package covid19.dataTypes;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PhoneNumberType {

	@NotNull
	@Size(min=10, max =12)
	@Digits(fraction=0, integer=12)
	private String numero;
	
}
