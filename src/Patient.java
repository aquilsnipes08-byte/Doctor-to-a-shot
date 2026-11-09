public class Patient {
	String shotNeeded;
	String name;
	boolean approvedForShot;

	void greetDoctor() {
		System.out.println(name + " Please come to the doctor");
	}
	void getShot(Shot whichShot) {

		if (shotNeeded.equalsIgnoreCase(whichShot.disease) && approvedForShot) {
			System.out.println(name + "got shot " + whichShot.disease);
		} else {
			System.out.println(name + "NOT approved for  shot " + whichShot.disease);
		}
	}
	void waveGoodbye() {
		System.out.println(name + "Have a good day!");
	}



}