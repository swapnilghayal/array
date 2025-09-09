import java.util.*;
class DeleteValueAtSpecific
{

	public static void main(String args[])
	{
	int a[]={1,22,33,4,5,99};
		
	int max=0;
	int smax=0;
		
	for(int i=0; i<a.length; i++)
	
		if(max<a[i])
		{
		smax=max;
		max=a[i];		
		}
		
		System.out.println("max "+max);
		System.out.println("smax "+smax);
			
		
				
					
				
	
		}



}