public class Doctor {
	public String name;
	public Shot shot = null;

	public Doctor (String name) {
		this.name = name;
	}

	public void acquireShot (String type) {
		shot = new Shot();
		shot.disease = type;
		shot.effect = "Fight against " + shot.disease;
		shot.numDoses = 1;
	}
	
	public Shot administerShot () {
		Shot temp = shot;
		shot = null;
		return temp;
	}
}