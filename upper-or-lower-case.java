import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if (ch >= 'a' && ch <= 'z') 
            System.out.println("LOWERCASE");
        else 
            System.out.println("UPPERCASE");
    }
}
