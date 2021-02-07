package covid19.dataTypes;

public class ValueTestCovid {

	private static boolean value ;

	public ValueTestCovid() {
		
	}
	
	public ValueTestCovid(boolean value) {
		this.value=value;
	}	
	
	public boolean getValue() {
		return value;
	}
	public void setValue(boolean value) {
		this.value = value;
	} 
	
}
