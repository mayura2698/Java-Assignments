package ass1;

public class a3 {
	public static void sortThreeNumbers(int a, int b, int c) { 
		if(a<b && a<c ) {
			
			if(b<c) {
				System.out.println(a+","+b+","+c);
				
			}
			else System.out.println(a+","+c+","+b);
			}
		if(b<a && b<c ) {
			
			if(a<c) {
				System.out.println(b+","+a+","+c);
			}
			else System.out.println(b+","+c+","+a);
			}
		if(c<a && c<b ) {
			
			if(a<b) {
				System.out.println(c+","+a+","+b);
			}
			else System.out.println(c+","+b+","+a);
			}
		}
	public static void main(String [] args) {
		sortThreeNumbers(2, 3, 1);
		
	}

}
