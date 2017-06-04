/* Problem 5 - Smallest Multiple

Solved.

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */

class Problem_005 {
	public static void main(String[] args) {
		
		int testNum = 20;
		boolean testing = true;
		
		while(testing == true){
			if(divide(testNum) == false){
				testNum += 20;
			} else {
				testing = false;
				System.out.println(testNum);
			}
		}
	}
	
	public static boolean divide(int test){
		for(int i = 1; i <= 20; i++){
			if(test % i != 0)
				return false;
		}
		return true;
	}
}
