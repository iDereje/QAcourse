
public class BreakOrContinue {

	public static void main(String[] args) {


	
	for (int number = 1; number < 101; number++) {
		

			  if (number % 2 == 0) {
			    System.out.println(number+" Number is Even");
			    if (number ==88) {
				    System.out.println(number+" Number 88 is skipped / Break");

			    	//break;
			    	//continue;
			    }
			   } else {
			    System.out.println(number+" Number is odd , because "+number+"/2 is "
			    		+ "left with mod of "+number % 2 );
			  }
			 
	}		
	}

}
