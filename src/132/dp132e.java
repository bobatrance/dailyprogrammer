/*
http://www.reddit.com/r/dailyprogrammer/comments/1hvh6u/070813_challenge_132_easy_greatest_common_divisor/

(Easy): Greatest Common Divisor

The Greatest Common Divisor of a given set of integers is the greatest integer that can divide these 
integers without any remainder. From Wikipedia, take a look at this example: for the integers 8 and 12, 
the highest integer that divides them without remainder is 4.

Your goal is to write a program that takes two integers, and returns the greatest common divisor. You may 
pick any algorithm or approach you prefer, though a good starting point is Euclid's algorithm.

Author: nint22
Formal Inputs & Outputs
Input Description

You will be given two space-delimited integers on the standard console input.
Output Description

Simply print the GCD value for the two given integers. If no GCD exists, print one ('1').
Sample Inputs & Outputs
Sample Input

32 12
142341 512345
65535 4294967295

Sample Output

4
1
65535

*/

import java.lang.Long;
public class dp132e
{

	public static long gcd(long a, long b)
	{		
		if(b == 0)
		{
			return a;
		}
		else
		{
			return gcd(b, a%b);
		}
	}
	public static void main(String[] args)
	{
		if(args.length == 2)
		{
			long gcdResult;
			long a = Long.parseLong(args[0]);
			long b = Long.parseLong(args[1]);
			
			if((a > b) || (a == b))
			{
				gcdResult = gcd(a, b);
			}
			else
			{
				gcdResult = gcd(b, a);
			}
			System.out.println(gcdResult);
		}
		else
		{
			System.out.println("Please type two space seperated numbers");
		}
	
	}
}