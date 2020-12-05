/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static Scanner in=new Scanner(System.in);
	public static int reverseNum(int num){
	    int rev=0,rem=0;
	    while(num>0){
	        rem=num%10;
	        rev=rev*10+rem;
	        num/=10;
	    }
	    return rev;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int len=in.nextInt();
		for(int i=0;i<len;i++){
		    int numToReverse=in.nextInt();
		    int res=reverseNum(numToReverse);
		    System.out.println(res);
		}
	}
}
