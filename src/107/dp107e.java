/*
Consider the translation from letters to numbers a -> 1 through z -> 26. 
Every sequence of letters can be translated into a string of numbers this way, 
with the numbers being mushed together. For instance hello -> 85121215. 
Unfortunately the reverse translation is not unique. 85121215 could map to hello, 
but also to heaubo. Write a program that, given a string of digits, outputs every 
possible translation back to letters.

Sample input:

123

Sample output:

abc

aw

lc
*/

public class dp107e{

	public static void main(String[] args){
		
		decode(args[0]);
		
		/*for(int i = 0; i < output.size(); i++){
			return output.get(i);
		}*/
		
	}
	
	public String decode(String input){
		int MAX_ALPHABET = 26;
		String[] alphabet {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z};
		List<String> output;
		String tempString;
		int checking;
	
		//empty
		if(input.length() == 0 || input == null || input.equals("0"){
			return null;
		}
		
		//1 digit
		
		//2 or more digits

	}

}