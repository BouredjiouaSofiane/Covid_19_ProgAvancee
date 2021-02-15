package covid19;


import java.util.Date;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType;
import covid19.dataTypes.PhoneNumberType;

public record Personne1(Nomtype nom, FirstNameType prenom, EmailType email, PhoneNumberType numeroTel, Date dateEt) {

}
