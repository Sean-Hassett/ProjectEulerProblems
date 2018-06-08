/* Problem 16 - Power Digit Sum
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 *
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115
 * (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance
 * with British usage.
 */

import java.util.HashMap;

public class Problem_017 {
	static HashMap<Integer, String> unitMap = new HashMap<Integer, String>();
	static HashMap<Integer, String> tensMap = new HashMap<Integer, String>();
	static HashMap<Integer, String> altTensMap = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		int total = 11;		// skip counting 1,000
		populateMaps();
		
		for (int i = 1; i < 1000; i++)
			total += countLetters(i);
		
		System.out.println(total);
	}
	
	private static void populateMaps() {
		unitMap.put(1, "one");
		unitMap.put(2, "two");
		unitMap.put(3, "three");
		unitMap.put(4, "four");
		unitMap.put(5, "five");
		unitMap.put(6, "six");
		unitMap.put(7, "seven");
		unitMap.put(8, "eight");
		unitMap.put(9, "nine");
		
		tensMap.put(2, "twenty");
		tensMap.put(3, "thirty");
		tensMap.put(4, "forty");
		tensMap.put(5, "fifty");
		tensMap.put(6, "sixty");
		tensMap.put(7, "seventy");
		tensMap.put(8, "eighty");
		tensMap.put(9, "ninety");
		
		altTensMap.put(0, "ten");
		altTensMap.put(1, "eleven");
		altTensMap.put(2, "twelve");
		altTensMap.put(3, "thirteen");
		altTensMap.put(4, "fourteen");
		altTensMap.put(5, "fifteen");
		altTensMap.put(6, "sixteen");
		altTensMap.put(7, "seventeen");
		altTensMap.put(8, "eighteen");
		altTensMap.put(9, "nineteen");
	}
	
	private static int countLetters(int number) {
		String numString = numDigitToLetter(number).replaceAll(" ", "");
		return numString.length();
	}

    private static String numDigitToLetter(int number) {
		String numString = Integer.toString(number);
		if (numString.length() == 1)
			return getUnits(number);
		else if (numString.length() == 2)
			return getTens(number);
		else
			return getHundreds(number);
	}

    private static String getUnits(int n) {
		return unitMap.get(n);
	}

    private static String getTens(int n) {
	    char[] digits = Integer.toString(n).toCharArray();
	    if (digits[0] == '1')
	    	return altTensMap.get(Character.getNumericValue(digits[1]));
	    else if (digits[1] == '0')
	    	return tensMap.get(Character.getNumericValue(digits[0]));
	    else
	    	return tensMap.get(Character.getNumericValue(digits[0])) + " " + getUnits(Character.getNumericValue(digits[1]));
	}

    private static String getHundreds(int n) {
		char[] digits = Integer.toString(n).toCharArray();
		if (digits[1] == '0' && digits[2] == '0')
			return unitMap.get(Character.getNumericValue(digits[0])) + " hundred";
		else if (digits[1] == '0')
			return unitMap.get(Character.getNumericValue(digits[0])) + " hundred and " + getUnits(Character.getNumericValue(digits[2]));
		else
			return unitMap.get(Character.getNumericValue(digits[0])) + " hundred and " + getTens(Integer.parseInt(Integer.toString(n).substring(1, 3)));
	}
}
