import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("No input provided.");
            sc.close();
            return;
        }

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("No majority element found in the array");
                sc.close();
                return;
            }
        }

        int candidate = arr[n / 2];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("The majority element is : " + candidate);
        } else {
            System.out.println("No majority element found in the array");
        }

        sc.close();
        }
}
