package covid19.dataTypes;

public class Asymptomatique {

	private static boolean value ;

	public Asymptomatique() {
		
	}
	
	public Asymptomatique(boolean value) {
		this.value=value;
	}	
	
	public boolean getValue() {
		return value;
	}
	public void setValue(boolean value) {
		this.value = value;
	}
	
}
