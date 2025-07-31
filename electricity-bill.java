import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        double bill = 0;
        if (u <= 50) 
            bill = u * 0.50;
        else if (u <= 150) 
            bill = 50 * 0.50 + (u - 50) * 0.75;
        else if (u <= 250) 
            bill = 50 * 0.50 + 100 * 0.75 + (u - 150) * 1.20;
        else 
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (u - 250) * 1.50;
        bill = bill + (bill * 0.20); 
        System.out.printf("%.2f\n", bill);
    }
}
