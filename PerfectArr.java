//Q20. Write a java program to find perfect number of a array.
// [10,20,9,20]
import java.util.*;
public class PerfectArr
{
	public static void main(String x[])
	{
		int a[] = new int [5];
		int digit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of array");
		for(int i = 0; i<a.length; i++)
		{
				a[i] =sc.nextInt(); 
		}
		
		for(int i= 0; i<a.length; i++)
		{	digit = 0;
			for(int j=1; j<=(a[i] / 2); j++)
			{
				if((a[i] % j) == 0)
				{
					digit = digit + j;
				}
			//System.out.println(digit);
				
			}
			if(digit == a[i]){
				System.out.printf("a[%d] %d number is perfect\n",i,a[i]);
			}
			// else{
					// System.out.printf("a[%d] %d number is not perfect\n",i,a[i]);
			// }
		}
	}
}