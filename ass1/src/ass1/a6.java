package ass1;

public class a6 {
	public static void pattern(int n) {
		int i=0,j=0;
		for(i=0;i<n;i++) {
			for (j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		pattern(7);
	}
	}

