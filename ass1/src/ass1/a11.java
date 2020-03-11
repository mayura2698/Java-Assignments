package ass1;

public class a11 {
	public static double sin(double a) {

	    if (a == Double.NEGATIVE_INFINITY || !(a < Double.POSITIVE_INFINITY)) {
	        return Double.NaN;
	    }

	    final double PI = 3.14159265358979323846;

	 	    a %= 2 * PI;
	    if (a < 0) {
	        a = 2 * PI - a;
	    }
	    int sign = 1;
	    if (a > PI) {
	        a -= PI;
	        sign = -1;
	    }
	 	    final int PRECISION = 50;
	    double temp = 0;
	    for (int i = 0; i <= PRECISION; i++) {
	        temp += Math.pow(-1, i) * (Math.pow(a, 2 * i + 1) / factorial(2 * i + 1));
	    }

	    return sign * temp;

	}
	public static int factorial(int n) {
		int i,fact=1;  
		      
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  }    
		return fact;
		
	}
}
