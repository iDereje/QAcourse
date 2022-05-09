package tryAndCatch;

public class TryAndCatchExample {
	  public static void main(String[] args) {
	    try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[10]);//if you change to 2 the catch will never enabled
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    } finally {
	      System.out.println("The 'try catch' is finished.");
	    }
	  }
	}