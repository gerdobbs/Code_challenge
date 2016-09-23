/*
 * Name:			Gerard Dobbs
 * College:			IT Carlow
 * Date:			September 2016
 * Purpose:			To find the largest palindrome made from the product of two 3-digit numbers.
 * Method:			Start out with a variable set to 999 and multiply it by itself.
 * 					Reduce 1st number by 1, multiply it by numbers => than it.
 * 					Continue Reducing the variable.
 * 					After each multiplication check to see if it is a palindrome.
 * 					To do this isolate the last digit by getting remainder of mod10.
 * 					Remainder will be 1st number of next digit
 * 					Continue getting remainder & adding to end of new digit, which is formed from the quotients,
 * 					If its a palindrome compare to current largest palindrome, 					
 */
public class Palindrome {

	public static void main(String[] args) {
		
		int number= 999;
		int largestPal=0;
		
		for(int i= number; i>=0; i--)				 
		{
			for(int j=number; j>=i; j--)//Multiply first number by number >= firdt Number
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
		int tempNum = 0;//Variable to stpre last digit each time
		while(numToReverse>0){
			tempNum = numToReverse%10;//Isolate last digit
			reversedNum = reversedNum*10 + tempNum; //Move decimal point and add 
			numToReverse = numToReverse/10;//Continue with New number without last digit
		}
		return reversedNum;
	}
	

}
