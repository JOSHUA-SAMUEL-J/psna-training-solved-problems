import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int u = 0, l = 0, n = 0, s = 0;

        if (a.length() >= 10) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (c >= 'A' && c <= 'Z')
                    u = 1;
                else if (c >= 'a' && c <= 'z')
                    l = 1;
                else if (c >= '0' && c <= '9')
                    n = 1;
                else
                    s = 1;
            }
            if (u + l + n + s == 4)
                System.out.println("Strong password");
            else
                System.out.println("Weak password");
        } else {
            System.out.println("Weak password");
        }
    }
}
