import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int row = 1 ; row<=n ; row++ ){
            for (int col = 1 ; col <= row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = n ; row>=1 ; row-- ){
            for (int col = 1 ; col <= row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        /* 
Sample Input 0

4
Sample Output 0

*
**
***
****
****
***
**
*
    */
    }
}
