import java.util.*;
public class weeklyq1 {
    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isSymmetric(int n) {
        String strNum = String.valueOf(n);
        int length = strNum.length();
        if (length % 2 == 1) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < length / 2; i++) {
            sum1 += strNum.charAt(i) - '0';
            sum2 += strNum.charAt(length - 1 - i) - '0';
        }
        return sum1 == sum2;
    }
    }
