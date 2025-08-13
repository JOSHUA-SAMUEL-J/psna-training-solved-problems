import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        boolean[] found = new boolean[26];
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (!found[c - 'a']) {
                    found[c - 'a'] = true;
                    count++;
                }
            }
        }
        if (count == 26)
            System.out.println("Pangrams");
        else
            System.out.println("Not Pangrams");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
