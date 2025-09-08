import java.util.*;
class InsertValueAtSpecificIndex
{

	public static void main(String args[])
	{
	int a[]={1,2,3,4,5};
	int key=200;
	int index=3;
	for(int i=0; i<a.length; i++)
	{
	int temp=a[index];
	a[index]=key;
	}
	System.out.println(Arrays.toString(a));
	}

}