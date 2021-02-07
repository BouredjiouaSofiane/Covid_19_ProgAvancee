package covid19.dataTypes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class NumeroEnseignant {
 
	@NotNull
	@Pattern(regexp = "")
	private static String numeroEns;

	public NumeroEnseignant() {
		
	}
	
    public NumeroEnseignant(String numeroEns) {
		this.numeroEns=numeroEns;
	}
	
 
    
	public String getNumeroEns() {
		return numeroEns;
	}

	public void setNumeroEns(String numeroEns) {
		this.numeroEns = numeroEns;
	}
	
	
}
