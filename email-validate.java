import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        if (email.contains("@")) {
            int atIndex = email.indexOf("@");
            if (email.indexOf(".", atIndex) != -1) {
                System.out.println("Valid");
                return;
            }
        }
        System.out.println("Invalid");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
