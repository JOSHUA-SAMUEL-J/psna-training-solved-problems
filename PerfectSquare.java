import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Not");
            return;
        }
        boolean isPerfectSquare = false;
        for (int i = 0; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }
        if (isPerfectSquare) 
            System.out.println("Perfect Square");
        else
            System.out.println("Not");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
