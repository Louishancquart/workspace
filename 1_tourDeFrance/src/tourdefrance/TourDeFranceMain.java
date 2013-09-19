package tourdefrance;

import java.util.ArrayList;
import java.util.List;

import tourdefrance.util.InitListeCoureurs;

public class TourDeFranceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Coureur> lesCoureurs = InitListeCoureurs.SINGLETON.init("/data/coureurs.txt");
				
		List<Etape> lesEtapes = new ArrayList<Etape>();
		for(int i = 0; i < 2; i++) {
			lesEtapes.add(new Etape(i+1));
		}	
		
		TourDeFrance tour = new TourDeFrance(lesEtapes,lesCoureurs);
		tour.disputeCourse();
	}

}
