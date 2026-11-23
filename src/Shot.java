
public class Shot {
	// this doesn't need to be private
	public int numDoses; //All AJ
	public String disease;
	public String effect;

	public Shot (String disease, int numDoses) {
		this.disease = disease;
		this.effect = "Fight against " + this.disease;
		this.numDoses = numDoses;
	}

	public String getDisease() {
		return disease;
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
		System.out.println(numDoses + " The right amount for all patients!");
	}
}