
package covid19;
import java.util.Vector;
import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType1;
import covid19.dataTypes.IdType;
import covid19.dataTypes.NameType1;
import covid19.dataTypes.NumeroEnseignant;
import covid19.dataTypes.PasswordType;
import covid19.dataTypes.PhoneNumberType;
import covid19.dataTypes.Asymptomatique;

public class Classe {

			// liste des eetudiants qui seront present au cours;
			private static Vector <Utilisateur> li;
			
			public Classe(Vector <Utilisateur> li) {
				this.li = li;
			}
			
			public void afficherClasse() {
				if(li.isEmpty()){
					System.out.println("liste vide");
				}else {
				for(Utilisateur ut : li) {
					if(ut instanceof Enseignant) System.out.println("Enseignant : "+ut.toString());
					else {
						System.out.println("Affichage du professeur et les etudiants :");
						System.out.println("Etudiant : "+ut.toString());
					}
				}
				}
			}
			
			// ajouter un etudiant  
			public boolean ajouter(Etudiant etud){
				if (etud != null) {
					if (li.contains(etud)) return false;					
					return (li.add(etud));
				}				
				return false;
			}
			
		/* ajouter un enseignant : 
			public boolean ajouter(Enseignant en){
				if (en != null) {
					if (li.contains(en)) return false;
					return li.add(en);
				} return false;
			}

		*/
			//Supprimer un etudiant de la liste des etudiants .
			public boolean supprimer(Etudiant etud){	
				if (etud != null) {
					return li.remove(etud);
				} return false;
			}
			
			//Obtenir l'etudiant à l'indice i 
			public Etudiant getEtudiant(int i){
				if ((i < 0) || (i >= li.size())) return null;
				return (Etudiant) li.elementAt(i);
			}
}
