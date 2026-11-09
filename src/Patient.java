public class Patient {
	String shotNeeded;
	String name;
	boolean approvedForShot;

	void greetDoctor() {
		System.out.println(name + " Please come to the doctor");
	}
	void getShot(String whichShot) {

		if (whichShot.equalsIgnoreCase(shotNeeded) && approvedForShot) {
			System.out.println(name + "got shot " + whichShot);
		} else {
			System.out.println(name + "NOT approved for  shot " + whichShot);
		}
	}
	void waveGoodbye() {
		System.out.println(name + "Have a good day!");
	}



}