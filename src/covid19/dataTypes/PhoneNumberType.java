package covid19.dataTypes;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PhoneNumberType {

	@NotNull
	@Size(min=10, max =12)
	@Digits(fraction=0, integer=12)
	private static String numero;

	
	public PhoneNumberType() {
		
	}

    public PhoneNumberType(String numero) {
		this.numero=numero;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
