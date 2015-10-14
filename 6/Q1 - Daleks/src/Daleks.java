
public class Daleks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dalek1 d = new Dalek1(); // start off with a well-charged battery
	    d.move(11);              // move around and use up the charge
	    d.batteryReCharge(2.5);  // get a new charge
	    d.batteryReCharge(0.5);  // add a bit more
	    d.move(5);               // move some more
	    
	    Dalek2 d1 = new Dalek2();
	    String[] u1 = { "Exterminate, Exterminate!", "I obey!",
	            "Exterminate, annihilate, DESTROY!", "You cannot escape.",
	            "Daleks do not feel fear.", "The Daleks must survive!" };
	    d1.setSayings(u1);

	    System.out.println("\nDalek d1 says: ");
	    for (int i = 0; i < 10; i++) {
	        d1.speak();
	    }

	    System.out.println("\nDalek d2 says: ");
	    Dalek2 d2 = new Dalek2();
	    String[] u2 = { "I obey!" };
	    d2.setSayings(u2);

	    for (int i = 0; i < 10; i++) {
	        d2.speak();
	    }

	}

}
