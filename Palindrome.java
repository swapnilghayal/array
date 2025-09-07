import java.util.*;
class Palindrome
{

	public static void main(String args[])
	{
	boolean flag = false;
	int a[]={1,2,3,2,1};
	for(int i=0,j=a.length-1; j>a.length/2; i++, j--){
		if(a[i]==a[j])
		flag = true;

		else{
			flag = false;
			break;
			}
	}

	if(flag)
		System.out.println("Array is a palindrome");
	else
		System.out.println("Array is not a palindrome");

}
}