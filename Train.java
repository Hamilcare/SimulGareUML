import java.sql.Timestamp;

public abstract class Train {
	int nbPlacesLibres;
	int vitesse;
	int type; //1= TGV 2=TER 3=InterCite
	int id;
	Timestamp depart = new Timestamp(1462075200);
	Timestamp arrive;

	public int getNbPlacesLibres() {
		return nbPlacesLibres;
	}

	public void setNbPlacesLibres(int nbPlaces) {
		this.nbPlacesLibres = nbPlaces;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public boolean estComplet() {

		if (nbPlacesLibres > 1) {
			nbPlacesLibres--;
			return true;
		}

		else
			return false;
	}

	public Timestamp calculArrive(Simulation s) {
		int temps;
		temps = s.distance / this.vitesse * 60 * 60 * 1000;

	}

	/*public void attribuerTrain(){
		int i;
		
		for(i=0; i<)
		Simulation.trains[i]
	}*/
}
