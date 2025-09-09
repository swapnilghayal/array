import java.util.*;
class PrimeNo
{

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter array size");
	int a[]=new int[sc.nextInt()];
	System.out.println("enter element");
	for(int i=0; i<a.length; i++)
	{
	a[i]=sc.nextInt();
	}
	for( int i=0; i<a.length; i++)
	if(a[i]==2)
{
	System.out.println("no is prime" +a[i]);
}
	else
	{
	if(a[i]%2==0)
	System.out.println("no is not prime" +a[i]);
	else
	System.out.println("no is prime" +a[i]);
	}
	
}
}