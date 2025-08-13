import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().trim();
        String str2 = scanner.nextLine().trim();
        String normalizedStr1 = str1.replaceAll("\\s+", "").toLowerCase();
        String normalizedStr2 = str2.replaceAll("\\s+", "").toLowerCase();
        char[] arr1 = normalizedStr1.toCharArray();
        char[] arr2 = normalizedStr2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are Not Anagrams.");
        } 
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
