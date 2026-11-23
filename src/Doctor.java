import java.util.ArrayList;// All Jack

public class Doctor {
	public String name;
	private final ArrayList<Shot> shots = new ArrayList<>(); // Jack
	private final ArrayList<Patient> patients = new ArrayList<>();

	public Doctor (String name) {
		this.name = name;
	}

	public void acquireShot (String type) {
		shots.add(new Shot(type, 5));
	}
	
	public Shot administerShot (String type) {
		Shot temp = null;
		for (Shot shot : this.shots) {
			if (shot.disease.equalsIgnoreCase(type)) {
				temp = shot;
			}
		}
		if (temp == null) {
			acquireShot(type);
			temp = administerShot(type);
		}
		return temp;
	}

	public void assignPatient (Patient guy) {
		patients.add(guy);
	}

	public void treatPatients () {
		for (Patient patient : patients) {
			patient.getShot(this.administerShot(patient.getNeededShot()));
		}
	}
}