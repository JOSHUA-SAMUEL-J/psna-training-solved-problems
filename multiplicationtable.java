import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int multiplicand = sc.nextInt();
int n = sc.nextInt();

for (int i = 1; i <= multiplicand; i++) {
    System.out.println(i + " * " + n + " = " + (i * n));
}
    }
}
