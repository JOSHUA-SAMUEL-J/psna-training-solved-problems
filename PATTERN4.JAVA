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
        int total = 2 * n;
        for (int row = 0; row < total; row++) {
            if (row == 0 || row == total - 1) {
                for (int col = 0; col < 2 * n; col++) {
                    System.out.print("*");
                }
            } else {
                int mirror = total - row - 1;
                int min = (row < mirror) ? row : mirror;
                int stars = n - min;
                int spaces = 2 * min ;

                for (int col = 0; col < stars; col++)
                    System.out.print("*");
                for (int col = 0; col < spaces; col++)
                    System.out.print(" ");
                for (int col = 0; col < stars; col++)
                    System.out.print("*");
            }
            System.out.println();
        }
        /* 
Sample Input
5
Sample Output 

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
    }
}
