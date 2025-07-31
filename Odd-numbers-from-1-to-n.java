import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = 1;
        int a = sc.nextInt();
        while(i<=a){
            if(i%2!=0)
                System.out.print(i+" ");
            i++;
        } 
    }
}
