package Programme;

import java.io.FileNotFoundException;
import java.io.IOException;

import ClassesUtilitaires.AnalyseFichier;

public class Programme {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String nomFichierALire = "./fichiers/Symptomes.txt";
		String nomFichierResultat = "./fichiers/Result.out.txt";

		AnalyseFichier.analyserFichier(nomFichierALire, nomFichierResultat);

	}
}
