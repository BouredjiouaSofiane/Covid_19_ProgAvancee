package covid19;

import java.util.Date;

import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType1;
import covid19.dataTypes.NameType;
import covid19.dataTypes.PhoneNumberType;

public record Personne1(NameType nom, FirstNameType1 prenom, EmailType email, PhoneNumberType numeroTel, Date dateEt) {

}
