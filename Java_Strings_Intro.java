package hackerrank_challenges;

import java.io.*;
import java.util.*;

public class Java_Strings_Intro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String A = scan.nextLine();
        String B = scan.nextLine();
        
        int sum = (A.length() + B.length());
        System.out.println(sum);
        
            if (A.charAt(0) < B.charAt(0)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            
            System.out.println((A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase()) + " " + B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase());
    }
}
