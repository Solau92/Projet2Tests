package ClassesUtilitaires;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LireFichier {

	/**
	 * Parcours un fichier et renvoie une liste de String (un élément par ligne).
	 * @param nomFichier
	 * @return une liste de String contenant toutes les lignes du fichier entré en paramètre
	 * @return une liste vide si le fichier est vide
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static List<String> lireFichier(String nomFichier) throws IOException, FileNotFoundException {

		// parcours de toutes les lignes du fichier jusqu'à la fin
		FileReader freader = new FileReader(nomFichier);
		BufferedReader breader = new BufferedReader(freader);
		List<String> liste = new ArrayList<String>();

		String ligne = breader.readLine();

		while (ligne != null) {
			liste.add(ligne);
			ligne = breader.readLine();
		}

		freader.close();
		breader.close();

		return liste;
	}

}