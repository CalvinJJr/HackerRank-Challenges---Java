package hackerrank_challenges;

import java.io.*;
import java.util.*;

public class Java_Strings_Intro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1. must read the two test strings
        String A = scan.nextLine();
        String B = scan.nextLine();
        
        // 2. must sum the length of each string, and print it out
        int sum = (A.length() + B.length());
        
        System.out.println(sum);
        
        // 3. Must determine if A comes before B lexicographically, and print out yes or no.
            if (A.charAt(0) <= B.charAt(0)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        // 4. Must capitalize the first letter of each string, separate them with a space, and print out in one line.
            System.out.println((A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase()) + " " + B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase());
            
            scan.close();
    } 
}
