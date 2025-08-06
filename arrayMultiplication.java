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
        System.out.print(arr[0] * arr[1] + " ");
        for (int i = 1; i < size - 1; i++) {
            System.out.print(arr[i - 1] * arr[i + 1] + " ");
        }
        System.out.print(arr[size - 2] * arr[size - 1]);
        sc.close();
/*Sample Input 0

6
1 2 3 4 5 6
Sample Output 0

2 3 8 15 24 30 
*/
    }
}
