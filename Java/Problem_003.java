/* Problem 3 - Largest Prime Factor

Solved.

The prime factors of 13,195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600,851,475,143 ? */

class Problem_003 {
	public static void main(String args[]){
		long largestPrimeFactor = 0;
		long testNum = 600851475143L;
		for(long testFactor = 2; testFactor <= (Math.sqrt(testNum) + 1); testFactor++){
			if(testNum % testFactor == 0){
				if (isPrime(testFactor))
					largestPrimeFactor = testFactor;
			}
		}
		System.out.println(largestPrimeFactor);
	}

	public static boolean isPrime(long number)
	{
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}
}
