import java.util.*;
public class bitXORapp {
    static int XorCom(int n ) {
        // To XOR the function from 1 to n and print the output
        int ans = 0;
        if (n % 4 == 0) {
            ans = n;
        }
        if (n % 4 == 1) {
            ans = 1;

        }  if (n % 4 == 2) {
            ans = n + 1;
        }  if (n % 4 == 3) {
            ans = 0;
        }

        return ans;

    }
    public static void main(String[] args) {
        System.out.println(XorCom(5));
    }
}

