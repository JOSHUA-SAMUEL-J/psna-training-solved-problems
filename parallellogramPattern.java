import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  
        scanner.close();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) 
                System.out.print(" ");
            for (int col = 0; col < n; col++) 
                System.out.print("*");
            System.out.println();
        }
        /*
Sample Input 0
5
Sample Output 0

    *****
   *****
  *****
 *****
*****
            */
    }
}
