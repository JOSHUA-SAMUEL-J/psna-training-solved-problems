import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] words = s.split("\\s+");
        StringBuilder rev = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            rev.append(words[i]);
            if (i != 0) rev.append(" ");
        }
        System.out.println(rev.toString());
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
