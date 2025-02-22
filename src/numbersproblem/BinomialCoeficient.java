package numbersproblem;

// finding binomial coefficient
/* Formula -   nCr =   n!
 *                   r!(n-r)!
 */
public class BinomialCoeficient {

	static int  fact(int n) {
		int factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		int num = 5;
		int r = 2;
		
		int factn = fact(num);
		int factr = fact(r);
		
		int nr = num - r;
		int factnr = fact(nr);
		
		int binomial = factn / (factr * factnr);
		
		System.out.println("Binomial Factorial : " + binomial);

	}

}
