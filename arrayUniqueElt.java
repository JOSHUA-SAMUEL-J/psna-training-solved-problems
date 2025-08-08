import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean uni = false;
        for (int i = 0; i < size; i++) {
            int freq = 0;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) freq++;
            }
            if (freq == 1) {
                System.out.print(arr[i] + " ");
                uni = true;
            }
        }
        if (!uni) 
            System.out.println("No unique elements in the array");
    }
}
