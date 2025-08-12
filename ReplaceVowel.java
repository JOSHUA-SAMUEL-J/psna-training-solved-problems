import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = input.replaceAll("(?i)[aeiou]", " ");
        System.out.println(output);
        /*
Sample Input 0
Replace all vowels 
Sample Output 0
R pl c   ll v w ls  */
    }
}
