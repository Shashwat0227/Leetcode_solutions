import java.util.Arrays;

public class multiplicationtable {
    static int[] multiplication(int m, int n) {
        int[] result = new int[m * n];

        for (int i = 1, idx = 0; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                result[idx++] = i * j;
            }
        }
        return result   ;
    }

    public static void main(String[] args) {
        int []res = multiplication(3,3);
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}
