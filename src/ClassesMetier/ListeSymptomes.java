package ClassesMetier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListeSymptomes {

	private List<Symptome> listeSymptomes;

	public ListeSymptomes() {
		this.listeSymptomes = new ArrayList();
	}
	
	/**
	 * @return the listeSymptomes
	 */
	public List<Symptome> getListeSymptomes() {
		return listeSymptomes;
	}

	public Symptome chercherDansListe(String nomSymptome) {

		for (Symptome s : this.listeSymptomes) {
			if (nomSymptome.equals(s.getNom())) {
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
			if (symptome.getNom().equals(s.getNom())) {
				int nombreOccurencesMisAJour = s.getOccurences() + 1;
				s.setOccurences(nombreOccurencesMisAJour);
				break;
			}
		}

	}

	public void trier() {
		Collections.sort(this.listeSymptomes);
	}

}
