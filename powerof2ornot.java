import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int i,n,flag=0,p=2;
    n=sc.nextInt();
        while(n>=p){
            if(n==p){
                flag=1;
            }
            p=p*2; 
        }
        if(flag==1)
            System.out.print("YES");
        else
            System.out.print("NO");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
