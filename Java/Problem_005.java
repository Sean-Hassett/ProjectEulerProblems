/* Problem 5 - Smallest Multiple
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem_005 {
	public static void main(String[] args) {
		
		int testNum = 20;
		boolean testing = true;
		
		while(testing) {
			if(!divideTest(testNum))
				testNum += 20;
			else
				testing = false;
		}
        System.out.println(testNum);
	}
	
	private static boolean divideTest(int test) {
		for(int i = 1; i <= 20; i++)
			if(test % i != 0)
				return false;
		return true;
	}
}
