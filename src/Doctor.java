public class Doctor {
	public String name;
	public Shot[] shots = new Shot[5];
	public int shotCount = 0;

	public Doctor (String name) {
		this.name = name;
	}

	public Shot acquireShot (String type) {
		Shot shot = new Shot();
		shot.disease = type;
		return shot;
	}

	public void storeShot (int index, Shot shot) {
		if (shots[index] == null) {
			shots[index] = shot;
			return;
		}
		throw new RuntimeException("attempted to store a shot in a place that is already occupied");
	}
	
	public void administerShot (int index) {
		shots[index] = null;
	}
}