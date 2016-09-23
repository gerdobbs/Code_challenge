/*
 * 
 * Name:		Gerard Dobbs
 * College:		IT Carlow
 * Date:		September 2016
 * Purpose:     Check for the Highest Prime Factor of a Number. ( In this case 600851475143)
 * Method:		Divide 600851475143 (largeNumber) by 2(factorCheck) initially to find largest factor
				If it does not divide evenly keep increase factorCheck until highest factor is found
				LargeNumber is then set to factorCheck and process repeated until the factor which is a prime is found
 */
public class LargestPrime {

	private static long largeNumber = 600851475143L;  
	private static long factorCheck = 2L;
	
	public static void main(String[] args)
	{
		System.out.print("The largest prime factor of " + largeNumber +" is " +checkFactor());
	}
	
	private static  long checkFactor()
	{
		while(Math.sqrt(largeNumber) > factorCheck)//Stop search after square root is reached	
		{
			if(largeNumber % factorCheck == 0){			
				largeNumber = largeNumber/factorCheck;//Divides evenly to give next highest factor. Is it a prime?
			}
			else{
				factorCheck++;//Does not divide evenly so check for factor again
			}
		}
		return largeNumber;
	}
}
