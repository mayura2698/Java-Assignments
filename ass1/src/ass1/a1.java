package ass1;

public class a1 {
	static boolean isValidDate(int year, int month, int day) { 
		if(month>=13) {
		return false; 
	}
		else if(day>=31) {
			return false;
		}
		else if(month==2 && day>=30) {
			return false;
		}
		else if(month==2 && year%4!=0 && day>=29) {
			return false;
		}
		else return true;
	}
	public static void main(String [] args) {
		int day=34;
		int month=2;
		int year=2009;
		boolean res=isValidDate(year, month, day);
		System.out.println("The given date is:"+res);
	}
}
