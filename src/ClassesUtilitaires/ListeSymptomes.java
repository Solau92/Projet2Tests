package ClassesUtilitaires;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ClassesMetier.Symptome;

public class ListeSymptomes {
	
	 List<Symptome> listeSymptomes;
	 
	 public ListeSymptomes() {
		 this.listeSymptomes = new ArrayList();
	 }

	public Symptome chercherDansListe(String nomSymptome) {

		for (Symptome s : this.listeSymptomes) {
			if (nomSymptome.equals(s.nom)) {
				return s;
			} 
		}
		return null;	
	}
	
	public void ajouterNouveauSymptome(Symptome symptome) {
		this.listeSymptomes.add(symptome);
	}
	
	public void incremente(Symptome symptome) {
		
		for (Symptome s : this.listeSymptomes) {
			if (symptome.nom.equals(s.nom)) {
				s.occurences ++; 
				break;
			}
		}

	}

	public void trier() {
		Collections.sort(this.listeSymptomes);
	}

}
