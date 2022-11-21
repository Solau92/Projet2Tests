package ClassesUtilitaires;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EcrireFichier {

	public static void ecrireDansFichier(String nomFichierSortie, ListeSymptomes liste) throws IOException {

		FileWriter fwriter = new FileWriter(nomFichierSortie);
		BufferedWriter bwriter = new BufferedWriter(fwriter);
		
		for (int i = 0 ; i < liste.listeSymptomes.size() ; i++) {
			
			String aEcrire = liste.listeSymptomes.get(i).nom + " : " + liste.listeSymptomes.get(i).occurences;
			bwriter.write(aEcrire);
			bwriter.newLine();
			
		}
		bwriter.flush();			
		fwriter.close();
		bwriter.close();
			
	}

}
