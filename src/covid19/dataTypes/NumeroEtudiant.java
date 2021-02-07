package covid19.dataTypes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class NumeroEtudiant {

	@NotNull
	@Pattern(regexp = "")
	private static String numeroEt;

	public NumeroEtudiant() {
		// TODO Auto-generated constructor stub
	}
		
	
    public NumeroEtudiant(String numeroEt) {
		this.numeroEt=numeroEt;
	}
	
	public String getNumeroEt() {
		return numeroEt;
	}

	public void setNumeroEt(String numeroEt) {
		this.numeroEt = numeroEt;
	}
	
	
}
