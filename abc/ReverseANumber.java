import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		/*
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int num = scan.nextInt();
        scan.close();
        */
		
		int  reversed = 0;

		for (int num =873 ; num != 0; num = num/ 10) { //int num should  be deleted if we use scanner
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}

		System.out.println("Reversed Number: " + reversed);
	}

}


