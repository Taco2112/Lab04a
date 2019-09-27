// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.
// all code commented was for experimental purposes only
import java.util.*;

public class Lab04avst
{
	public static void main(String[] args)
	{
		//System.out.println("Lab04a, Student Version\n");

			//double principal  = 250000;
			//double annualRate = 4.85;
			//double numYears   = 30;

	  Scanner console = new Scanner(System.in);


	        System.out.println("Lab04a, Student Version 80 point version ");
	       // System.out.print("principle:    "+  (double loan););

	        double loan = 250000;
	          System.out.println("principle:     " + (double) loan);
	        //System.out.print("Number of Years:  "+ (int years););

	        int years = 30;
	           System.out.println("Number of Years:  " + (int) years);
	    //    System.out.print("anual rate:   "+ (double rate););

	        double rate = 4.85;
	        System.out.println("anual rate:       " + (double) rate);
	        System.out.println();

	        // compute the data we need to complete the problems we have
//side note : MATH.POW is 📋 returns the value of the first argument raised to the power of the second argument.
	        int numberof = 12 * years;
	        double calculations = rate / 12.0 / 100.0;
	        double payment = loan * calculations * Math.pow(1 + calculations, numberof) /
	                         (Math.pow(1 + calculations, numberof) - 1);
	        System.out.println("Monthly of Payment = $" + (int) payment);

// below i [attempt] to do 90


//the payments are below and are belived to be alright ?😅
					double calculations21 = 12 * (double)payment;
					double calculations22 = (double)calculations21 * 30;
					System.out.println("Total Payments:		" + (double) calculations22);

//below is the total intrest wich is belived to be not rigght... 85? 😬
					double calculations2 = 1 +  (double)rate * (int)years;
					double calculations3 = (int)payment * (double)calculations2;
					System.out.println("Toytal Intrest:		"  + (double) calculations3);



			//System.out.println();
	}
}
