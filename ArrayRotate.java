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
        for(int i = 0;i < size ; i++) 
            arr[i] = sc.nextInt();
        int r = sc.nextInt();
        r = r % size;
        int start = size - r;
        for(int i = start; i < size; i++)
            System.out.print(arr[i]+" ");
        for(int i = 0; i < start; i++) 
            System.out.print(arr[i]+" ");
        sc.close();
    }
}
