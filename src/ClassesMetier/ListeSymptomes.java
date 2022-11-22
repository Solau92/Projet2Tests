package ClassesMetier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListeSymptomes {

	private List<Symptome> listeSymptomes;

	public ListeSymptomes() {
		this.listeSymptomes = new ArrayList<Symptome>();
	}
	
	/**
	 * @return the listeSymptomes
	 */
	public List<Symptome> getListeSymptomes() {
		return listeSymptomes;
	}

	/**
	 * Cherche dans une liste de symptome si un symptome est présent, à partir d'un libellé (String).
	 * @param nomSymptome
	 * @return symptome si symptome trouvé à partir de son libellé
	 * @return renvoie null si liste vide
	 */
	public Symptome chercherDansListe(String nomSymptome) {

		for (Symptome s : this.listeSymptomes) {
			if (nomSymptome.equals(s.getNom())) {
				return s;
			}
		}
		return null;
	}

	/**
	 * Ajoute un nouveau symptome dans la liste de symptome de la ListeSymptomes.
	 * @param symptome
	 */
	public void ajouterNouveauSymptome(Symptome symptome) {
		this.listeSymptomes.add(symptome);
	}

	/**
	 * Incrémente le nombre d'occurences d'un symptome entré en paramètre.
	 * @param symptome
	 */
	public void incremente(Symptome symptome) {

		for (Symptome s : this.listeSymptomes) {
			if (symptome.getNom().equals(s.getNom())) {
				int nombreOccurencesMisAJour = s.getOccurences() + 1;
				s.setOccurences(nombreOccurencesMisAJour);
				break;
			}
		}
	}

	/**
	 * Trie la liste de symptome de la ListeSymptomes, par ordre alphabétique des libellés des symptomes. 
	 */
	public void trier() {
		Collections.sort(this.listeSymptomes);
	}

}
