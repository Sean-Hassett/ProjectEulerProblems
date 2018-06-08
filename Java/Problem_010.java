/* Problem 10 - Summation of Primes
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */

public class Problem_010 {
	static final int MAX_NUM = 2000000;
    public static void main(String[] args) {
		
		int testNum = 3;
		long sumPrimes = 2;		// Start at 2 to skip accounting for 2 when finding primes
		
		while (testNum < MAX_NUM) {
			if (isPrime(testNum))
				sumPrimes += testNum;
			testNum += 2;
		}
		System.out.println(sumPrimes);
	}
	
	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}
}