package covid19.dataTypes;


import javax.validation.constraints.Digits;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class DateType {

	@Past()
	@Pattern(regexp="../../....")
	private String date;
	
}
