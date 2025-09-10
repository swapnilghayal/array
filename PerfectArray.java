import java.util.*;
class PerfectArray
{
	public static void main(String args[])
	{
	int digit=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size");

	int a[]=new int[sc.nextInt()];
	
	System.out.println("Enter Element");
	for(int i=0; i<a.length;i++)
	{
	a[i]=sc.nextInt();

	}
	for(int i=0; i<a.length; i++)
	{
		digit=0;
			
			for(int j=1; j<(a[i]/2); j++)
			{
				if(a[i] % j==0)
					digit+=j;
			}


		if(a[i]==digit)
			System.out.println("no is perfect "+ a[i]);
		else
			System.out.println("no is not perfect"+ a[i]);
	}
	
}
}