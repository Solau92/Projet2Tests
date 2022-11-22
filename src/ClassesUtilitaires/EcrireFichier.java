package ClassesUtilitaires;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ClassesMetier.ListeSymptomes;

public class EcrireFichier {

	/**
	 * Ecris dans un fichier dont le nom est entrée en paramètre les attributs des symptomes d'une liste entrée en paramètre. 
	 * @param nomFichierSortie
	 * @param liste
	 * @throws IOException
	 */
	public static void ecrireDansFichier(String nomFichierSortie, ListeSymptomes liste) throws IOException {

		FileWriter fwriter = new FileWriter(nomFichierSortie);
		BufferedWriter bwriter = new BufferedWriter(fwriter);

		for (int i = 0; i < liste.getListeSymptomes().size(); i++) {

			String aEcrire = liste.getListeSymptomes().get(i).getNom() + " : " + liste.getListeSymptomes().get(i).getOccurences();
			bwriter.write(aEcrire);
			bwriter.newLine();

		}
		bwriter.flush();
		fwriter.close();
		bwriter.close();

	}

}
