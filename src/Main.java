class Main {
	public static void main(String[] args) {
		Doctor drFreeman = new Doctor("Freeman");

		Patient chell = new Patient();
		chell.name = "Chell";
		chell.shotNeeded = "Flu";
		chell.approvedForShot = true;
		chell.greetDoctor();

		Shot flu = new Shot();
		flu.disease = "Flu";
		flu.effect = "Fight against flu";
		flu.numDoses = 1;
		flu.cureDisease();

		chell.getShot(flu);
		chell.waveGoodbye();

	}
}