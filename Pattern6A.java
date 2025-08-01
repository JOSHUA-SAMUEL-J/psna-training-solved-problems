import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int mid1, mid2;
        boolean isEven = (n % 2 == 0);
        if (isEven) {
            mid1 = n / 2 - 1;
            mid2 = n / 2;
        } else 
            mid1 = mid2 = n / 2;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == mid2  || col == mid2  ) 
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        } 
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
