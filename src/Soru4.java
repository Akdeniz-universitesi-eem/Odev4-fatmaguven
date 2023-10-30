
public class Soru4 {

	public static void main(String[] args) {
		 int n = 20; 
	        double eApproximation = calculateEulerNumber(n);
	        System.out.println("Euler sayısının yaklaşık değeri: " + eApproximation);
	    }

	    public static double calculateEulerNumber(int n) {
	        double eApproximation = 1.0; 
	        double factorial = 1.0;

	        for (int i = 1; i <= n; i++) {
	            factorial *= i; 
	            eApproximation += 1.0 / factorial; 
	        }

	        return eApproximation;

	}

}
