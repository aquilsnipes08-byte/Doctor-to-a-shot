public class Shot {
	int numDoses;
	String disease;
	String effect;

	public void cureDisease() {
		getsInjected();
		System.out.println(disease + " was cured!  Yay!");
		getDisposed();
	}
	public void getDisposed() {
		System.out.println(effect + "the right effect! yay!");
		numDoses = 0;
		disease = null;
		effect = null;
	}
	public void getsInjected() {
		System.out.println(numDoses + "The right amount for all patients!");
	}
}