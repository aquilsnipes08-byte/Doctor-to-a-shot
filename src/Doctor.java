public class Doctor {
	public String name;
	public Shot shot = null;
	public int shotCount = 0;

	public Doctor (String name) {
		this.name = name;
	}

	public void acquireShot (String type) {
		shot = new Shot();
		shot.disease = type;
	}
	
	public Shot administerShot () {
		Shot temp = shot;
		shot = null;
		return temp;
	}
}