import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int zc = 0;  
        int oc = 0; 
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                zc++;
            } else if (num == 1) {
                oc++;
            }
        }
        System.out.println("zc = " + zc);
        System.out.println("oc = " + oc);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
