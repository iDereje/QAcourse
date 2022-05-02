package abc;

import java.util.Scanner;

public class dd {
	

	public static void main(String[] args) {	
         Scanner a=new Scanner(System.in);
         int x,y,z;
         System.out.print("please enter first number: ");
         x=a.nextInt();
         System.out.print("pleasee enter second number: ");
         y=a.nextInt();
         z=MultiSwitch(x, y);
         System.out.println(z);
         
         
		
	}
	
	static int MultiSwitch(int num1,int num2) {
		num1=num2*2;
		num2=num1*2;
		return num1*num2;
	}
	
	

}
