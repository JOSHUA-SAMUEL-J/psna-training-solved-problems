import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int size1 = sc.nextInt(); 
        int size2 = sc.nextInt(); 
        int size3 = sc.nextInt(); 
        int[] arr1 = new int[size1]; 
        int[] arr2 = new int[size2]; 
        int[] arr3 = new int[size3]; 
        for (int i = 0; i < size1; i++) 
            arr1[i] = sc.nextInt(); 
        for (int i = 0; i < size2; i++) 
            arr2[i] = sc.nextInt(); 
        for (int i = 0; i < size3; i++) 
            arr3[i] = sc.nextInt(); 
        int i = 0, j = 0, k = 0; 
        boolean found = false; 
        while (i < size1 && j < size2 && k < size3) { 
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) { 
                System.out.print(arr1[i] + " "); 
                found = true; 
                i++; j++; k++; 
            } else if (arr1[i] < arr2[j]) { 
                i++; 
            } else if (arr2[j] < arr3[k]) { 
                j++; 
            } else { 
                k++; 
            } 
        } 
        if (!found) System.out.print("No common elements"); 
    }
}
