import java.util.*;
class CopyOneToAnother
{

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array Size");
	int a[]=new int[sc.nextInt()];
	int b[]=new int[a.length];
	System.out.println("Enter Element");
	for(int i=0; i<a.length; i++)
	{
	 a[i]=sc.nextInt();
	
	b[i]=a[i];
	
	}	
	System.out.println(Arrays.toString(b));

	
	}
	

}