import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        boolean[] seen = new boolean[26];
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (seen[c - 'a']) {
                    System.out.println("NOT ISOGRAM");
                    return;
                }
                seen[c - 'a'] = true;
            }
        }
        System.out.println("ISOGRAM");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
