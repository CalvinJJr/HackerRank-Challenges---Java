package hackerrank_challenges;

import java.io.*;
import java.util.*;

public class Java_SubStrings_Comparisons_Solution {
	 public static void main(String[] args) {
	        
		 Scanner scan = new Scanner(System.in);
	     String s = scan.next();
	     int k = scan.nextInt();
	    
	     String[] S = new String[s.length() - k + 1];

	     for (int i = 0; i < s.length() - (k - 1); i++) {
	        S[i] = s.substring(i, i + k);
	     }

	     Arrays.sort(S);
	     String smallest = S[0];
	     String largest = S[S.length-1];
	    
	     System.out.println(smallest);
	     System.out.println(largest);
	        
	    } 
	}
