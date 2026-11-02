public class Shot {
    int numDoses;
    String disease;
    String effect;

    public void cureDisease() {
        System.out.println(disease + " was cured!  Yay!");
    }
   public  void getDisposed() {
        System.out.println(effect + "the right effect! yay!");
    }
    public void getsInjected() {
        System.out.println(numDoses + "The right amount for all patients!");
    }
}