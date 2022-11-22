package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ClassesMetier.ListeSymptomes;
import ClassesMetier.Symptome;

class ListeSymptomesTests {

	// Factoriser code ?

	@Test
	void chercherDansListeTrouveTest() {

		String nomSymptomeAChercher;
		Symptome symptome1 = new Symptome("symptome1", 1);
		Symptome symptome2 = new Symptome("symptome2", 2);
		Symptome symptome3 = new Symptome("symptome3", 3);
		Symptome symptome4 = new Symptome("symptome4", 4);
		Symptome symptome5 = new Symptome("symptome5", 5);
		ListeSymptomes listeSymptomesClasse = new ListeSymptomes();
		listeSymptomesClasse.ajouterNouveauSymptome(symptome5);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome2);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome4);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome1);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome3);

		nomSymptomeAChercher = "symptome1";

		assertEquals(symptome1, listeSymptomesClasse.chercherDansListe(nomSymptomeAChercher));
	}

	@Test
	void chercherDansListePasTrouveTest() {

		String nomSymptomeAChercher;
		Symptome symptome1 = new Symptome("symptome1", 1);
		Symptome symptome2 = new Symptome("symptome2", 2);
		Symptome symptome3 = new Symptome("symptome3", 3);
		Symptome symptome4 = new Symptome("symptome4", 4);
		Symptome symptome5 = new Symptome("symptome5", 5);
		ListeSymptomes listeSymptomesClasse = new ListeSymptomes();
		listeSymptomesClasse.ajouterNouveauSymptome(symptome5);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome2);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome4);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome1);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome3);

		nomSymptomeAChercher = "symptomexx";

		assertEquals(null, listeSymptomesClasse.chercherDansListe(nomSymptomeAChercher));
	}

	@Test
	void chercherDansListeVideTest() {

		ListeSymptomes listeSymptomesClasse = new ListeSymptomes();

		String nomSymptomeAChercher = "symptome1";

		assertEquals(null, listeSymptomesClasse.chercherDansListe(nomSymptomeAChercher));
	}

	@Test
	void incrementeTest() {

		String nomSymptomeAChercher;
		Symptome symptome1 = new Symptome("symptome1", 1);
		Symptome symptome2 = new Symptome("symptome2", 1);
		Symptome symptome3 = new Symptome("symptome3", 3);
		Symptome symptome4 = new Symptome("symptome4", 4);
		Symptome symptome5 = new Symptome("symptome5", 5);
		ListeSymptomes listeSymptomesClasse = new ListeSymptomes();
		listeSymptomesClasse.ajouterNouveauSymptome(symptome5);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome2);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome4);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome1);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome3);
		
		listeSymptomesClasse.incremente(symptome2);
		
		assertEquals(2, symptome2.getOccurences());
	}

	@Test
	void trierTest() {

		Symptome symptome1 = new Symptome("symptome1", 1);
		Symptome symptome2 = new Symptome("symptome2", 1);
		Symptome symptome3 = new Symptome("symptome3", 3);
		Symptome symptome4 = new Symptome("symptome4", 4);
		Symptome symptome5 = new Symptome("symptome5", 5);
		ListeSymptomes listeSymptomesClasse = new ListeSymptomes();
		listeSymptomesClasse.ajouterNouveauSymptome(symptome5);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome2);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome4);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome1);
		listeSymptomesClasse.ajouterNouveauSymptome(symptome3);
		
		ListeSymptomes listeSymptomesClasseAttendu = new ListeSymptomes();
		listeSymptomesClasseAttendu.ajouterNouveauSymptome(symptome1);
		listeSymptomesClasseAttendu.ajouterNouveauSymptome(symptome2);
		listeSymptomesClasseAttendu.ajouterNouveauSymptome(symptome3);
		listeSymptomesClasseAttendu.ajouterNouveauSymptome(symptome4);
		listeSymptomesClasseAttendu.ajouterNouveauSymptome(symptome5);
		
		listeSymptomesClasse.trier();
				
		for (int i = 0 ; i < listeSymptomesClasseAttendu.getListeSymptomes().size() ; i++) {
			assertEquals(listeSymptomesClasseAttendu.getListeSymptomes().get(i).getNom(), listeSymptomesClasse.getListeSymptomes().get(i).getNom());
		}		
	}

//	@Test
//	void trierListeVideTest() {
//		
//		ListeSymptomes listeSymptomesClasse = new ListeSymptomes();
//		
//		listeSymptomesClasse.trier();
//
//		fail("Not yet implemented");
//	}
}
