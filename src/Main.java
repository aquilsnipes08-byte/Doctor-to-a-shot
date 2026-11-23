class Main {
	public static void main(String[] args) { //Jack
		Doctor drFreeman = new Doctor("Freeman");//Jack

		Patient chell = new Patient();//AJ
		chell.name = "Chell";//AJ
		chell.shotNeeded = "Flu";//AJ
		chell.approvedForShot = true;//Jack
		chell.greetDoctor();//Jack

		drFreeman.acquireShot("Flu");//AJ
		chell.getShot(drFreeman.administerShot());//Jack
		chell.waveGoodbye();//Jack
	}
}