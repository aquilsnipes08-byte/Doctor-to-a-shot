public class Patient {
	String shotNeeded;
	String name;
	boolean approvedForShot;

	void greetDoctor() {
		System.out.println(name + " Please come to the doctor");
	}

	public void getShot(Shot whichShot) {

		if (shotNeeded.equalsIgnoreCase(whichShot.getDisease()) && approvedForShot) {
			System.out.println(name + " got " + whichShot.getDisease() + " shot " );
			whichShot.cureDisease();
		} else {
			System.out.println(name + " NOT approved for  shot " + whichShot.getDisease());
		}
	}

	public String getNeededShot () {
		return shotNeeded;
	}
	
	void waveGoodbye() {
		System.out.println(name + " Have a good day! ");
	}//AJ



}