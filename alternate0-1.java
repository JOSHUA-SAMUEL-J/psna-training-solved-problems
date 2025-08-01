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
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) 
                System.out.print(row%2);
            System.out.println();
        }
        /* 
Sample Input 
5
Sample Output 
11111
00000
11111
00000
11111 
*/
    }
}
