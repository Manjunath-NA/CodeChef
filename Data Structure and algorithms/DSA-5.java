/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static Scanner in=new Scanner(System.in);
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int len=in.nextInt();
	    while(len-- >0){
	        int numOfCars=in.nextInt();
	        int cur=in.nextInt();
	        int min=cur;
	        int count=1,present;
	        for(int i=1;i<numOfCars;i++){
	            present=in.nextInt();
	            if(present<cur && present<min){
	                count++;
	            }
	            min=Math.min(present,min);
	            cur=present;
	        }
	        System.out.println(count);
	    }
	}
}
