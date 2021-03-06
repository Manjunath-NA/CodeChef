/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static Scanner in=new Scanner(System.in);
	public static void calculateMaximumRevenue(long[] arr,long len){
	    long max=0L;
	    for(long i=0;i<len;i++){
	      long revenue=(arr[(int)i]*(len-i));
	      max=(revenue>max)? revenue:max;  
	    }
	    System.out.println(max);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//step1: read the numbers as long
		//step2: sort the Array
		//step3: calculate price from lower to higher as revenue=(arr[(int)i]*(len-i));
		//step4: store the revenue and print the maximum revenue
		long len=in.nextInt();
	    long arr[]=new long[(int)len];
	    for(long i=0;i<len;i++){
		    arr[(int)i]=in.nextLong();
	    }
	    Arrays.sort(arr);
	   calculateMaximumRevenue(arr,len);
	}
}
