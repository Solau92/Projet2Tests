package ClassesUtilitaires;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.List;

import ClassesMetier.ListeSymptomes;
import ClassesMetier.Symptome;

public class AnalyseFichier {

	public static void analyserFichier(String nomFichierALire, String nomFichierResultat)
			throws FileNotFoundException, IOException {

		// Je lis le fichier et r�cup�re la liste des symptomes sous forme de String
		List<String> listeLue = LireFichier.lireFichier(nomFichierALire);

		// Je cr�e ma liste de symptomes vide
		ListeSymptomes liste = new ListeSymptomes();

		// Je parcours ma liste de Strings lue
		for (String s : listeLue) {

			if (liste.getListeSymptomes().isEmpty()) {
				// liste vide : 1�re ligne (= comme pas trouv�)
				String nom = s; // Donc r�cup�rer ligne lue
				Symptome symptomeAAjouter = new Symptome(nom, 1);
				liste.ajouterNouveauSymptome(symptomeAAjouter);
			} else {
				// liste pas vide
				Symptome symptomeCourant = liste.chercherDansListe(s);

				if (symptomeCourant != null) {
					// si trouv�
					liste.incremente(symptomeCourant);
				} else {
					// pas trouv�
					String nom = s; // Donc r�cup�rer ligne lue
					Symptome symptomeAAjouter = new Symptome(nom, 1);
					liste.ajouterNouveauSymptome(symptomeAAjouter);
				}
			}

		}

		liste.trier();

		EcrireFichier.ecrireDansFichier(nomFichierResultat, liste);
	}

}
