import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int max = Math.max(a, b);
while (true) {
    if (max % a == 0 && max % b == 0) {
        System.out.println(max);
        break;
    }
    max++;
}

    }
}
