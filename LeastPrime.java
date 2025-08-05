import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int leastPrime = -1;
    for (int i = 2; i <= n; i++) {
        if (n % i == 0) {
            leastPrime = i;
            break; 
        }
    }

    System.out.println(leastPrime);
    }
}
