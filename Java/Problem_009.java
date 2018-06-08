/* Problem 9 - Special Pythagorean Triplet
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a**2 + b**2 = c**2
 *
 * For example, 3**2 + 4**2 = 9 + 16 = 25 = 5**2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * My Note:
 * From a<b<c and a+b+c = 1,000 the following facts can be drawn:
 *
 * The maximum value for a == 333
 * The maximum value for b == 499
 * The maximum value for c == 997
 */

public class Problem_009 {
	public static void main(String[] args) {
		for(int a = 1; a <= 333; a++){
			for(int b = a+1; b <= 499; b++) {		// b = a+1 ensures a < b
				int c = (1000 - b - a);				// Only use values for c that fulfills a+b+c = 1000
				if(c > b ){							// Only test if a<b<c
					if(((a*a) + (b*b)) == (c*c))
						System.out.println(a*b*c);
				}
			}
		}
	}
}
