/* Problem 7 - 10001st prime
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10,001st prime number?
 */

public class Problem_007 {
	public static void main(String[] args) {

		int counter = 1;
		int primeTest = 3;
		
		while(counter < 10001) {
			if (isPrime(primeTest))
				counter++;
			primeTest += 2;
		}
		primeTest -= 2;
        System.out.println(primeTest);
    }
	
	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}
}