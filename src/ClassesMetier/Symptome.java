package ClassesMetier;

public class Symptome implements Comparable<Symptome> {

	public String nom;
	public int occurences;

	public Symptome() {
		this.occurences = 0;
	}

	public Symptome(String nom, int occurences) {
		this.nom = nom;
		this.occurences = occurences;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Symptome other = (Symptome) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	@Override
	public int compareTo(Symptome o) {

		if (this.nom.equals(o.nom)) {
			return 0;
		} else if (this.nom.compareTo(o.nom) > 0) {
			return 1;
		} else {
			return -1;
		}
	}

}
