class Main {
	public static void main(String[] args) {
		Doctor drFreeman = new Doctor("Freeman");

		Patient chell = new Patient();
		chell.name = "Chell";
		chell.shotNeeded = "Flu";
		chell.approvedForShot = true;
		chell.greetDoctor();

		drFreeman.acquireShot("Flu");
		chell.getShot(drFreeman.administerShot());
		chell.waveGoodbye();
	}
}