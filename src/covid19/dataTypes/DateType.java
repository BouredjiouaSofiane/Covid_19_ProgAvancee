package covid19.dataTypes;


import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.executable.ValidateOnExecution;

public class DateType {

	
	@Past()
	@Pattern(regexp="../../....")
	private String date;

	public DateType() {
		
	}
	
	public DateType(String date) {
		this.date=date;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String d) {
		this.date = d;
	}
}
