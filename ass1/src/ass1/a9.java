package ass1;

public class a9 {
	public static void sumOfEvensAndOdds(int []nums) { 
		int i=0;
		int esum=0,osum=0;
		for(i=0;i<10;i++) {
			if(nums[i]%2==0) {
				esum=esum+nums[i];
			}
			else {
				osum=osum+nums[i];
			}
			}
			
	
		
		System.out.println(esum+","+osum);
	}
	public static void main(String [] args) {
		int [] a= {19,2,3,4,5,6,7,8,9,10};
		sumOfEvensAndOdds(a);
	}
	}


