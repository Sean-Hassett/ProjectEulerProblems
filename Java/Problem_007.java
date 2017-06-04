/* Problem 7 - 10001st prime

Solved.

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10,001st prime number? */

class Problem_007 {
	public static void main(String[] args) {

		int counter = 1;		// Start counter at 1 and test numbers at 3 to avoid accounting for 2 in the prime number generator
		int primeTest = 3;
		
		while(counter < 10001){
			if (isPrime(primeTest))
				counter++;
			if (counter == 10001)
				System.out.println(counter + ":" + primeTest);
			primeTest += 2;
		}
	}
	
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}
}