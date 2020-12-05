/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	final static int size=26;
	static Scanner in=new Scanner(System.in);
	public static void checkLapindrome(String input){
	    // abcdcba , abcdacb , abcbca
	    //step1: check for odd /even
	    //step2: split the Strings int left and right
	    //step3: check left string frequency is equal to right or Not
        //step4: print yes or No
        int len=input.length();
        int leftStringFreq[]=new int[size];
        int rightStringFreq[]=new int[size];
        boolean flag=false;
        if(len%2==0){
            //even case
            leftStringFreq=checkFreq(input,0,len/2);
            rightStringFreq=checkFreq(input,len/2,len);
        }else{
            //odd case
            leftStringFreq=checkFreq(input,0,len/2);
            rightStringFreq=checkFreq(input,((len/2)+1),len);
        }
        for(int i=0;i<size;i++){
            if(leftStringFreq[i]==rightStringFreq[i])
                flag=true;
            else{
                flag=false;
                break;
            }
            }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
        
	}
	public static int[] checkFreq(String str,int start,int end){
	    int freq[]=new int[size];
	    for(int i=start;i<end;i++){
	        freq[str.charAt(i)-'a']++;
	    }
	    return freq;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int len=in.nextInt();
		for(int i=0;i<len;i++){
		    String inputString=in.next();
		    checkLapindrome(inputString);
		}
	}
}
