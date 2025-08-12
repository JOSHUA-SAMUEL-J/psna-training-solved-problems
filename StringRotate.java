import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int len = str.length();
        n = n % len;
        String rot = str.substring(n) + str.substring(0, n);
        System.out.println(rot);
        /*
Sample Input 
6
apple
Sample Output 
pplea        
        */
    }
}
