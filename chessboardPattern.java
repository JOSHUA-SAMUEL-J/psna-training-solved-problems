import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int start = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j < n; j++) {
                System.out.print((j % 2 == 0) ? start : 1 - start);
            }
            System.out.println();
        }
    }
}
/* Sample Output 0

10101
01010
10101
01010
10101
Sample Input 1

6
Sample Output 1

101010
010101
101010
010101
101010
010101
  */
