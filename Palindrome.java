/*
 * Name:		Gerard Dobbs
 * College:		IT Carlow
 * Date:		September 2016
 * Purpose:		To find the largest palindrome made from the product of two 3-digit numbers.
 * Method:		Start out with a variable set to 999 and multiply it by itself.
 * 				Reduce 1st number by 1, multiply it by numbers => than it.
 * 				Continue Reducing the variable.
 * 				After each multiplication check to see if it is a palindrome.
 * 				To do this reverse the number & compare to the original.
 * 				Isolate the last digit by getting remainder of tnt number mod10.
 * 				Remainder will be 1st number of next digit
 * 				Continue getting remainder & adding to end of new digit, which is formed from the quotients,
 * 				If its a palindrome compare to current largest palindrome, 					
 */
public class Palindrome {

	public static void main(String[] args) {
		
		int number= 999;
		int largestPal=0;
		for(int i= number; i>99; i--)				 
		{
			for(int j=number; j>=i; j--)//Multiply number by 3 digit numbers > 0r = that number
			{
				if((i*j) == reverseResult(i*j))//Is it a palindrome
				{
					if(i*j>largestPal)			
						largestPal=i*j;//New largest palindrome
				}
			}
		}
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is " +(largestPal));
	}
	public static int reverseResult(int numToReverse){
		int reversedNum=0;
		while(numToReverse>0){
			reversedNum = reversedNum*10 + numToReverse%10; //Move decimal point and add last digit to create reversed number 
			numToReverse = numToReverse/10;//Continue with  number minus the last digit
		}
		return reversedNum;
	}
	

}
