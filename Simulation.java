
public class Simulation {

	Train[] trains;
	int distance;
	Client[] clients;

	public Simulation(int nbTrains, int dist, int nbClients) {
		trains = new Train[nbTrains];
		distance = dist;
		clients = new Client[nbClients];
		this.initSimulation(nbTrains);

	}

	public void initSimulation(int nbTrains) {
		int rand;
		for (int i = 0; i < nbTrains; i++) {
			rand = ((int) (Math.random() * 100)) % 3 + 1;
			System.out.println(rand);
			switch (rand) {
			case 1:
				trains[i] = new TER(i);
				break;
			case 2:
				trains[i] = new InterCite(i);
				break;
			case 3:
				trains[i] = new TGV(i);
				break;
			default:
				break;
			}
		}

	}

	public boolean estPossible() {
		int totalPlace = 0;
		for (Train t : trains) {
			totalPlace += t.nbPlacesLibres;
		}

		return totalPlace >= clients.length;
	}

	public int runSimulation() {
		if (!this.estPossible()) {
			System.out.println("La capacite des trains est insuffisante\n");
			return -1;

		}

		return 0;

	}

	public static void main(String[] args) {
		Simulation s1 = new Simulation(10, 10, 10);

	}
}
