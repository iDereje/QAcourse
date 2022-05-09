package createTwoObjects;

public class CreateTwoObjectsOfMain {
	  int x = 5;

	  public static void main(String[] args) {
	    CreateTwoObjectsOfMain myObj1 = new CreateTwoObjectsOfMain();  // Object 1
	    CreateTwoObjectsOfMain myObj2 = new CreateTwoObjectsOfMain();  // Object 2
	    CreateTwoObjectsOfMain myObj3 = myObj2; // By References
	    System.out.println(myObj1.x +" From Object 1" +" Location in Memory "+ myObj1.toString());
	    System.out.println(myObj2.x +" From Object 2" +" Location in Memory "+ myObj2.toString());
	    System.out.println(myObj3.x +" From Object 3" +" Location in Memory "+ myObj3.toString());
	  }
	

public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
}