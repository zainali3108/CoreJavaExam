package javaleads.lesson2;

import java.util.Scanner;

class question30{

	public static void main(String arghs[]){
			 Scanner Sc = new Scanner (System.in );
			 System.out.println("Enterthenum");
			 float num1 =Sc.nextFloat();
				System.out.println("enterthenum2");
				float num2 = Sc.nextFloat();
				System.out.println(num1/num2);
				
				try{
				}
				
	catch (ArithmeticException e) {
		System.out.println(("you should not divide a number"));
	}
	
	}
}
