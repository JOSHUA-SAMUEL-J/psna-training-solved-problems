import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        if (digits.length() == 0)
            System.out.println(0);
        else 
            System.out.println(digits.toString());
        /* 
 Sample Input 0
hi12hello13
Sample Output 0
1213

Sample Input 1
heaven
Sample Output 1
0
        */
    }
}
