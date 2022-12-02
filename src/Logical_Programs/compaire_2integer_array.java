package Logical_Programs;

import java.util.Arrays;

public class compaire_2integer_array
{
	
	public static void main(String[]args)
	{
		int a[]= {10,20,30,40};
		int b[]= {40,30,20,10};
		int c[]= {10,20,30,40};
		
//		System.out.println(a.equals(b));
//		System.out.println(b.equals(c));
//		
		//Arrays inbuild class arrays .
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(b, c));
		
	}
}