import java.util.ArrayList;

public class Doctor {
	public String name;
	ArrayList<Shot> shots = new ArrayList<Shot>();

	public Doctor (String name) {
		this.name = name;
	}

	public void acquireShot (String type) {
		shots.add(new Shot(type, 5));
	}
	
	public Shot administerShot () {
		Shot temp = shots.get(0);
		shots = null;
		return temp;
	}
}