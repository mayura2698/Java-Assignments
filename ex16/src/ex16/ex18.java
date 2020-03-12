package ex16;
import java.util.*;
public class ex18 {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count=0,sum=0,it=0,dou=0;
		double sumd=0;
		int num = 0;
		double d = 0;
		for(int i=0;i<n;i++) {
			
			if( s.hasNextInt()) {
				num=s.nextInt();
			it=it+1;
			}
			else if(s.hasNextDouble()) {
			d=s.nextDouble();
				dou=dou+1;
			}			
			System.out.println("do you wish to continue? (yes/no)");
			
			String input = s.next();
			if(input=="no") {
				break;
			}
			
			count=count+1;
			sum=sum+num;
			sumd=sumd+d;
		}
			System.out.println("no of inputs:"+count);
			System.out.println("no of int inputs:"+it);
			System.out.println("no of non int inputs:"+dou);
			System.out.println("sum of ints"+sum);
			System.out.println("sum of ints"+sumd);
		}
	}


