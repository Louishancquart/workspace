package tourdefrance;

public class Temps implements Comparable{
	int sec;
	int min;
	int h;
	
	/**Réinitialise le temps d'un coureur à 0
	 */
	public Temps(){
		
	}
	
	/**Donne le temps d'un coureur
	 * @param le temps d'un coureur en heures, minutes, ou secondes
	 */
	public Temps(int heures,int minutes, int secondes){
		
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the sec
	 */
	public int getSec() {
		return sec;
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @return the h
	 */
	public int getH() {
		return h;
	}
	
	/**Ajoute un temps au temps courant
	 * @param Temps à  ajouter
	 */
	public void addTime(Temps t){
		
	}
	
	/**Surcharge du hashCode en utilisant la licence (unique par coureur)
	 * @return Retourne un hashCode unique
	 */
	public int hashCode(){
		return h;	
	}
	
	/**Compare l'objet Temps avec un autre objet
	 * @return vrai si les 2 objets sont similaire
	 */
	public boolean equals(Object o){
		return false;
	}
}
