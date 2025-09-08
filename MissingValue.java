class MissingValue
{

	public static void main(String args[])
	{
	int a[]={1,4,7,9};
	int max=0;
	for(int i=0; i<a.length; i++)
	{
		if(max<a[i])
		max=a[i];
	}
	int b[]=new int[max];
	for(int i=0,j=i+1; i<max; i++,j++)
	
	{
		if((a[i]==i))
		i++;
		System.out.println(i);
	}
		
	}


}