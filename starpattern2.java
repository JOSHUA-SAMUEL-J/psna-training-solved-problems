import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            int stars = 2 * (n - i) + 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
        /*
Sample Input 0
4
Sample Output 0

*******
 *****
  ***
   *
 */
