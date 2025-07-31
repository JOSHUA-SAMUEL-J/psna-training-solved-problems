import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
         int n2 = sc.nextInt();
         int n3 = sc.nextInt();
        if(n1+n2+n3 == 180 && (n1+n2 !=180) &&(n1+n3 !=180)&&(n3+n2 !=180) && n1 >=0 && n2 >=0 && n3 >=0)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
