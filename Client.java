
public class Client {
	int id;
	Train train;

	public Client(int id, Train train) {
		this.id = id;
		this.train = train;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

}