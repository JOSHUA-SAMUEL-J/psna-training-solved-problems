import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        int pos = sc.nextInt();

        if (pos < 1 || pos > n) {
            System.out.println("Deletion not possible.");
        } else {
            for (int i = pos - 1; i < n - 1; i++) {
                data[i] = data[i + 1];
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.print(data[i] + " ");
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
