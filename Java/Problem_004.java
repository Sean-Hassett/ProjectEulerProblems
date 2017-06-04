/* Problem 4 - Largest Palindrome Product

Solved.

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers. */

class Problem_004 {
	public static void main(String args[]){
		
		int largestPalindrome = 0;
		
		for(int i = 999; i > 0; i--){
			for(int j = 999; j > 0; j--){
				String numA = String.valueOf(i * j);
				String numB = new StringBuilder(numA).reverse().toString();
				if(numA.equals(numB)){
					if((i*j) > largestPalindrome)
						largestPalindrome = (i*j);
				}
			}
		}
		System.out.println(largestPalindrome);
	}
}
