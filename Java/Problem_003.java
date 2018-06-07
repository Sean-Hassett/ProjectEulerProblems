/* Problem 3 - Largest Prime Factor
 *
 * The prime factors of 13,195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600,851,475,143 ?
 */

public class Problem_003 {
    final static long TEST_NUM = 600851475143L;
	public static void main(String args[]){
		for(long testFactor = (long)(Math.sqrt(TEST_NUM) + 1); testFactor >= 2 ; testFactor--) {
			if(TEST_NUM % testFactor == 0) {
				if (isPrime(testFactor)) {
                    System.out.println(testFactor);
                    testFactor = 0;
                }
			}
		}
	}

	private static boolean isPrime(long number) {
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}
}
