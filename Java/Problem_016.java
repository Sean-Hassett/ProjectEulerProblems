/* Problem 16 - Power Digit Sum
 *
 * What is the sum of the digits of the number 2 ^ 1000?
 */

import java.math.BigDecimal;

public class Problem_016 {
	public static void main(String[] args) {
		BigDecimal number = new BigDecimal(Math.pow(2, 1000));
		String numString = number.toString();
		char[] numDigits = numString.toCharArray();
		
		int total = 0;
		for (int i = 0; i < numDigits.length; i++)
			total += Character.getNumericValue(numDigits[i]);
		
		System.out.println(total);
	}
}