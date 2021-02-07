package covid19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType1;
import covid19.dataTypes.IdType;
import covid19.dataTypes.NameType1;
import covid19.dataTypes.NumeroEnseignant;
import covid19.dataTypes.NumeroEtudiant;
import covid19.dataTypes.PasswordType;
import covid19.dataTypes.PhoneNumberType;


public class TestMain {

	public static void AfficherMenu(){
		System.out.println("**************** Menue de l'application Covid_19 *******************\n");
		System.out.println("\n Veuillez choisir l'operation que vous souhaitez sinon cliquez sur 'q'ou 'Q' pour sortir !");
		System.out.println(" A|a : Enregistrer un nouveau étudiant.");
		System.out.println(" B|b : Enregistrer un nouveau Enseignant.");
		System.out.println(" C|c : Afficher la liste des etudiants.");
		System.out.println(" D|d : Afficher la liste des enseignants.");
		System.out.println(" Q|q : Quiter");
		
		//String op = null;
		//Scanner sc = new Scanner(System.in);
		//op = sc.next();
		//if(op.toLowerCase().equals("q")) {
			//System.exit(0);
		//}
		} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameType1 nom=new NameType1(); 
		FirstNameType1 prenom=new FirstNameType1(); 
		EmailType email=new EmailType();
		PhoneNumberType numeroTel=new PhoneNumberType();
		IdType id=new IdType();
		PasswordType mdp=new PasswordType();
		NumeroEtudiant numEtudiant=new NumeroEtudiant();
		NumeroEnseignant numEnseignant=new NumeroEnseignant();
		DateType date=new DateType();
		
		//LesEtudiants lesEt = new LesEtudiants();

		String operation=null;
		List<Etudiant> listeEtudiant = new ArrayList<Etudiant>();
		List<Enseignant> listeEnseignant = new ArrayList<Enseignant>();
		Scanner sc = new Scanner(System.in);
		
		/* for(Etudiant et : listeEtudiant) {
			System.out.println(et+"\n");
		}*/
		AfficherMenu();
		operation = sc.next();
					
		while(!operation.toLowerCase().equals("q")) {
			if(operation.toLowerCase().equals("q")) {
				System.out.println("merci, au revoir !");
				System.exit(0);
				sc.close();
			}
			else if (operation.toLowerCase().equals("a")) {
				System.out.println("rentrer les coordonnées de l'etudiant :");
				System.out.println("Nom :");
				nom.equals(sc.next());
				System.out.println("Prenom :");
				prenom.equals(sc.next());
				System.out.println("Email :");
				email.equals(sc.next());
				System.out.println("Numero de telephone :");
				numeroTel.equals(sc.next());
				System.out.println("Date de Niassance :");
				date.equals(sc.next());
				System.out.println("Identifiant : ");
				id.equals(sc.next());
				System.out.println("Mot de Passe : ");
				mdp.equals(String.valueOf(sc.next().hashCode()));
				System.out.println("Numero d'etudiant :");
				numEtudiant.equals(sc.next());
				
				Personne etudiant = new Etudiant(nom, prenom, email, numeroTel, date, id, mdp, numEtudiant);
				
				if(!listeEtudiant.contains(etudiant)) {
					//System.out.println("heho");
					listeEtudiant.add((Etudiant) etudiant);
					//System.out.println("heho_1");
					System.out.println(etudiant);
					AfficherMenu();
					//System.out.println("heho_2");

				}else {
					System.out.println("Cet etudiant est déja inscrit !");
					AfficherMenu();
				};
				sc.close();
			}
				
			else if  (operation.toLowerCase().equals("b")) {
			
				System.out.println(" Rentrer les coordonnées de l'enseignant :");
				System.out.println(" Nom :");
				nom.equals(sc.next());
				System.out.println("Prenom :");
				prenom.equals(sc.next());
				System.out.println(" Email :");
				email.equals(sc.next());
				System.out.println(" Numero de telephone :");
				numeroTel.equals(sc.next());
				System.out.println(" Date de Niassance :");
				date.equals(sc.next());
				System.out.println(" Identifiant : ");
				id.equals(sc.next());
				System.out.println(" Mot de Passe : ");
				mdp.equals(String.valueOf(sc.next().hashCode()));
				System.out.println(" Numero d'enseignant :");
				numEnseignant.equals(sc.next());
				Enseignant ens = new Enseignant(nom, prenom, email, numeroTel, date, id, mdp, numEnseignant);
				listeEnseignant.add(ens);
				
				sc.close();

			}
			
			else if (operation.toLowerCase().equals("c")) {
				System.out.println(" *********  Liste des Etudiants ******* ");
				if(listeEtudiant.isEmpty()) {
					System.out.println("La liste des etudiants est vide !");
					AfficherMenu();
				}else {
				for(Etudiant et : listeEtudiant) {	
				System.out.println(et+"\n");
				}
				}
			}
			
			else if (operation.toLowerCase().equals("d")) {
				System.out.println(" *********  Liste des Enseignants ******* ");
				for(Enseignant en : listeEnseignant) {
						System.out.println(en+"\n");
					}
			}
			
		}
		
		
	}
}
