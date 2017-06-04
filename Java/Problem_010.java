/* Problem 10 - Summation of Primes

Solved.

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million. */

class Problem_010 {
	public static void main(String[] args) {
		
		int testNum = 3;
		long sumPrimes = 2;		// Start at 2 to skip accounting for 2 when finding primes
		
		while (testNum < 2000000){
			if (isPrime(testNum))
				sumPrimes += testNum;
			testNum += 2;
		}
		System.out.println(sumPrimes);
	}
	
	public static boolean isPrime(int number){
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}
}