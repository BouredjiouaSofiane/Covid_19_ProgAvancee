package covid19;


import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;
import java.util.Vector;

import covid19.dataTypes.Asymptomatique;
import covid19.dataTypes.DateType;
import covid19.dataTypes.EmailType;
import covid19.dataTypes.FirstNameType;
import covid19.dataTypes.FirstNameType1;
import covid19.dataTypes.IdType;
import covid19.dataTypes.NameType;
import covid19.dataTypes.NumeroEnseignant;
import covid19.dataTypes.NumeroEtudiant;
import covid19.dataTypes.PasswordType;
import covid19.dataTypes.PhoneNumberType;

public class TestClasse {

	
	public static void afficherMenu(){
		
		System.out.println("  ********  Menu  ******** \n\n");
		System.out.println("Choisissez votre op�ration (Entrez le num�ro correspondant) :\n\n");
		System.out.println(" *****  1 - Ajouter un etudiant. \n *****  2 - Ajouter un Enseignant. \n *****  3 - Afficher toute la classe. \n *****  4 - Supprimer un etudiant. \n *****  5 - Supprimer un enseignant. \n *****  6 - Quiter.");
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("src\\MesFichiers\\file.txt");
		FileWriter fr = new FileWriter(file);

		StringBuilder sb = new StringBuilder();
		sb.append("Fichier contenant les �tudiants de la classe ainsi l'enseignant.\n");
		Vector <Utilisateur> liste = new Vector<Utilisateur>();
		Scanner sc = new Scanner(System.in);
		Promotion c1;
		Etudiant et;
		c1= new Promotion(liste);
		String nom = null, prenom=null, dateNaiss, email, tel, numet, id, pass, datetest, datesymp;
		int choix;
		boolean testC;
		
		Nomtype nomEns = new Nomtype(nom); Nomtype nomEt = new Nomtype(nom), nomEt2 = new Nomtype(nom);
		FirstNameType prenomEns = new FirstNameType(prenom), prenomEt = new FirstNameType(prenom), prenomEt2 = new FirstNameType(prenom);
		EmailType emailEns = new EmailType(), emailEt = new EmailType(), emailEt2 = new EmailType();
		PhoneNumberType numeroTelEns = new PhoneNumberType(), numTelEt = null, numTelEt2 = new PhoneNumberType();
		Date dateEns = new Date(), dateEt= new Date(), dateEt2 = new Date();
		IdType idEns = new IdType(), idEt = new IdType(), idEt2 = new IdType();
		NumeroEnseignant numEns = new NumeroEnseignant();
		NumeroEtudiant numEt = null;
		NumeroEtudiant numEt2 = new NumeroEtudiant();
		PasswordType passEns= new PasswordType(), passEt = new PasswordType(), passEt2 = new PasswordType();
		Asymptomatique valueEt = new Asymptomatique(), valueEt2 = new Asymptomatique();
		
		DateType dateTes = null, dateSympt= new DateType();
		
		System.out.println("  ********  Menu  ******** \n\n");
		System.out.println("Choisissez votre op�ration (Entrez le num�ro correspondant) :\n\n");
		System.out.println(" *****  1 - Ajouter un etudiant. \n *****  2 - Ajouter un Enseignant. \n *****  3 - Afficher toute la classe. \n *****  4 - Supprimer un etudiant. \n *****  5 - Supprimer un enseignant. \n *****  6 - Quiter.");
		
		
		try {
			choix = sc.nextInt();
		
		
		while(choix > 1 || choix < 6){
			
			if(choix < 1 || choix > 6) {
				System.out.println("\n CHOIX INCORRECTE !\n\n");
				afficherMenu();
				choix = sc.nextInt();
			}
			else {
			switch(choix) {
			case 1 :{
				System.out.println("Ajout d'un etudiant : \n");
				System.out.println("\n Nom :");
				nom = sc.next();
				nomEt= new Nomtype(nom);
				
				System.out.println("prenom :");
				prenom= sc.next();
				prenomEt = new FirstNameType(prenom);
				
				System.out.println("date de naissance :");
				dateNaiss= sc.next();
				dateEt= new Date(dateNaiss);
				
				System.out.println("Email :");
				email= sc.next();
				emailEt = new EmailType(email);
				
				System.out.println("tel :");
				tel= sc.next();
				numTelEt = new PhoneNumberType(tel);
				
				System.out.println("Num etudiant :");
				numet= sc.next();
				numEt = new NumeroEtudiant(numet);
				
				System.out.println("Id :");
				id= sc.next();
				idEt = new IdType(id);
				
				System.out.println("Password :");
				pass= sc.next();
				passEt = new PasswordType(pass);
				
				System.out.println("Valeur du Test covid :");
				testC= sc.nextBoolean();
				valueEt= new Asymptomatique(testC);	 
				
				if(testC==true){					
					System.out.println("Date Test covid :");
					datetest= sc.next();
					dateTes= new DateType(datetest);
					
					System.out.println("Date symptomes du covid :");
					datesymp= sc.next();
					dateSympt= new DateType(datesymp);
				}
				
				Optional<TestCovid> tc = Optional.ofNullable(new TestCovid(dateTes, dateSympt, valueEt));
				et= new Etudiant(nomEt, prenomEt, emailEt, numTelEt, dateEt, idEt, passEt, numEt, tc);
				
				liste.add(et);
				et.toString();
				
				sb.append(et);
				fr.write(sb.toString());
				afficherMenu();
				choix=sc.nextInt();
			}
			break;
			case 2:
				{
				System.out.println("Nom :");
				nom = sc.next();
				nomEt= new Nomtype(nom);
				
				System.out.println("prenom :");
				prenom= sc.next();
				prenomEt = new FirstNameType(prenom);

				System.out.println("date de naissance :");
				dateNaiss= sc.next();
				dateEt= new Date(dateNaiss);
				
				System.out.println("Email :");
				email= sc.next();
				emailEt = new EmailType(email);
						
				System.out.println("tel :");
				tel= sc.next();
				numTelEt = new PhoneNumberType(tel);
				
				System.out.println("Num etudiant :");
				numet= sc.next();
				numEt = new NumeroEtudiant(numet);
				
				System.out.println("Id :");
				id= sc.next();
				idEt = new IdType(id);
				
				System.out.println("Password :");
				pass= sc.next();
				passEt = new PasswordType(pass);
				
				System.out.println("Date Test covid :");
				datetest= sc.next();
				dateTes= new DateType(datetest);
				 
				System.out.println("Date symptomes du covid :");
				datesymp= sc.next();
				dateSympt= new DateType(datesymp);
				
				System.out.println("Valeur du Test covid :");
				testC= sc.nextBoolean();
				valueEt= new Asymptomatique(testC);	 
				
				Optional<TestCovid> tc = Optional.ofNullable(new TestCovid(dateTes, dateSympt, valueEt));
				
				et= new Etudiant(nomEt, prenomEt, emailEt, numTelEt, dateEt, idEt, passEt, numEt, tc);
						
				liste.add(et);
				
				sb.append(et);
				fr.write(sb.toString());
				afficherMenu();
				choix = sc.nextInt();
			}break;
			
			case 3 :{
				c1.afficherPromotion();
				afficherMenu();
				choix = sc.nextInt();
			}break;
			case 4: {
				System.out.println("Rentrer l'Id de l'etudiant � supprimer ?");
				String ident =null;
				ident=sc.next();
				idEt2 = new IdType(ident);
				c1.supprimerEnseignant(idEt2);
				afficherMenu();
				choix = sc.nextInt();
			}
			break;
			
			case 5 :{
				System.out.println("Rentrer l'Id de l'enseignant � supprimer ?");
				String ident =null;
				ident=sc.next();
				idEt2 = new IdType(ident);
				c1.supprimerEnseignant(idEt2);
				afficherMenu();
				choix = sc.nextInt();
			}
			case 6 :{
				System.out.println("\n Merci, au revoir ! *******");
				sc.close();
				fr.flush();
				fr.close();
				System.exit(0);
			}
			
			}
		}		
	}
		
		
		} catch (Exception e) {
			throw new Exception(" !!!!!!!    Vous devez rentrez un nombre   !!!!!!!");
		}
		
		//nomEt.setNom("sofiane"); nomEt2.setNom("anas");nomEns.setNom("Soto");
		//prenomEt.setPrenom("soso"); prenomEt2.setPrenom("iuyu"); prenomEns.setPrenom("michel");
		//emailEt.setEmail("sofiane@gamail.com");emailEt2.setEmail("anas.09@gmail.com"); emailEns.setEmail("soto@hotmail.fr");
		//dateEt.setDate("20/09/1996"); dateEt2.setDate("18/10/2000"); dateEns.setDate("");
		//numTelEt.setNumero("0102989090"); numTelEt2.setNumero("056089780"); numeroTelEns.setNumero("0000000000");
		//idEt.setId("ii12560"); idEt2.setId("ih12450"); idEns.setId("ens3489");
		//numEt.setNumeroEt("ii12560"); numEt2.setNumeroEt("ih12450"); numEns.setNumeroEns("ens3489");
		//passEt.setPass("0000"); passEt2.setPass("abcd"); passEns.setPass("1234");
		//valueEt.setValue(true);valueEt2.setValue(false);

		//Etudiant et1 = new Etudiant(nomEt, prenomEt, emailEt, numTelEt, dateEt, idEt, passEt, numEt, tc);
		//Etudiant et2 = new Etudiant(nomEt2, prenomEt2, emailEt2, numTelEt2, dateEt2, idEt2, passEt2, numEt2, tc2);
		//Enseignant ens = new Enseignant(nomEns, prenomEns, emailEns, numeroTelEns, dateEns, idEns, passEns, numEns);


		//c1.afficherClasse();

		//c1.ajouter(et);
		//c1.ajouter(et2);
		//c1.ajouter(ens);
		//et1.afficherPersonne();
		//c1.afficherClasse();

		
		
	}
}

