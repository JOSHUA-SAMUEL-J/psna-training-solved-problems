import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int num2 = sc.nextInt();
        int result = 0;
        if (op == '+') 
            result = num1 + num2;
        else if (op == '-') 
            result = num1 - num2;
        else if (op == '*') 
            result = num1 * num2;
        else if (op == '/') 
            result = num1 / num2;
        System.out.println(result);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
