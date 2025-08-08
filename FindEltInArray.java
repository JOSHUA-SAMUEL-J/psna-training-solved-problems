import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < Size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.print("Found");
        else 
            System.out.print("Not found");
    }
}
