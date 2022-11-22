package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ClassesMetier.ListeSymptomes;
import ClassesMetier.Symptome;
import ClassesUtilitaires.EcrireFichier;
import ClassesUtilitaires.LireFichier;

class EcrireFichierTests {

	@Test
	void ecrireDansFichierTest() throws IOException {
		
		Symptome symptome1 = new Symptome("symptome1", 1);
		Symptome symptome2 = new Symptome("symptome2", 2);
		Symptome symptome3 = new Symptome("symptome3", 3);
		Symptome symptome4 = new Symptome("symptome4", 4);
		Symptome symptome5 = new Symptome("symptome5", 5);
		ListeSymptomes listeSymptomesClasse = new ListeSymptomes();
		listeSymptomesClasse.ajouterNouveauSymptome(symptome1);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome2);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome3);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome4);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome5);
		
		File fichier = new File("./tests/ecrireFichierTestGeneral.txt");
		fichier.delete();
		String nomFichier = "./tests/ecrireFichierTestGeneral.txt";
		
		//Attendu 
		List<String> listeAttendue = new ArrayList<String>();
		String symptome1String = "symptome1" + " : " + "1";
		listeAttendue.add(symptome1String);
		String symptome2String = "symptome2" + " : " + "2";
		listeAttendue.add(symptome2String);
		String symptome3String = "symptome3" + " : " + "3";
		listeAttendue.add(symptome3String);
		String symptome4String = "symptome4" + " : " + "4";
		listeAttendue.add(symptome4String);
		String symptome5String = "symptome5" + " : " + "5";
		listeAttendue.add(symptome5String);
		
		// A tester	
		EcrireFichier.ecrireDansFichier(nomFichier, listeSymptomesClasse);
		List<String> listeEcrite = LireFichier.lireFichier(nomFichier);
	
		// Vérification 
		assertEquals(listeAttendue,listeEcrite);		
	}
	
//	@Test
//	void ecrireDansFichierNonTrouveTest() {
//		
//		String nomFichierInexistant = "./tests/fichierQuiNExistePas.txt";
//
//	}

}
