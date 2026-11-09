
class Main {
	public static void main(String[] args) {
		Doctor drFreeman = new Doctor("Freeman");
		drFreeman.name = "You're next for your flu shot Chell";
		Doctor drKliener = new Doctor("Kliener");
		Doctor drVance = new Doctor("Vance");
		Doctor drCoomer = new Doctor("Coomer");
		Doctor drMagnuesson = new Doctor("Magnuesson");

		Patient chell = new Patient();
		chell.name = "Chell";
		chell.shotNeeded = "Flu";
		chell.greetDoctor();
		Patient caroline = new Patient();
		Patient wheatly = new Patient();
		Patient cave = new Patient();
		Patient doug = new Patient();


	}
}
