package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import ClassesUtilitaires.LireFichier;

class LireFichierTests {

	@Test
	void lireFichierTestGeneral() throws FileNotFoundException, IOException {
		
		List<String> attendu = new ArrayList<String>();
		attendu.add("Mot1");
		attendu.add("Mot2");
		attendu.add("Mot3");
		attendu.add("Mot4");
		
		String nomFichierTestGeneral = "./tests/lireFichierTestGeneral.txt";
		
		assertEquals(attendu, LireFichier.lireFichier(nomFichierTestGeneral));
	}
	
	@Test
	void lireFichierVideTest() throws FileNotFoundException, IOException {
		
		List<String> attendu = new ArrayList<String>();
		
		String nomFichierVideTest = "./tests/lireFichierVideTest.txt";
		
		assertEquals(attendu, LireFichier.lireFichier(nomFichierVideTest));
	}
	
	//TODO : voir comment faire un test sur les exceptions dans JUnit5
//	@Test // JUnit4(expected = FileNotFoundException.class)
//	void lireFichierNonTrouveTest() throws FileNotFoundException, IOException {
//		
//		Exception attendu = new FileNotFoundException();
//		
//		String nomFichierInexistant = "./tests/fichierQuiNExistePas.txt";
//		
//		assertEquals(attendu, LireFichier.lireFichier(nomFichierInexistant));
//		
//	}
}
