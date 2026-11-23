public class Shot {
	int numDoses;
	String disease;//AJ
	String effect;//AJ

	public Shot (String disease, int numDoses) {
		this.disease = disease;//Jack
		this.effect = "Fight against " + this.disease;//Jack
		this.numDoses = numDoses;//Jack
	}

	public void cureDisease() {
		getsInjected();
		System.out.println(disease + " was cured!  Yay!");//AJ
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