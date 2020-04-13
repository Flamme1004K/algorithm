package flamme.algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1463 {
    static int[] d;

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        d = new int[n + 1];
        System.out.println(dp(n));

    }

    private static int dp(int n) {
        if (n == 1)
            return 0;
        if (d[n] > 0)
            return d[n];
        d[n] = dp(n - 1) + 1;
        if (n % 2 == 0) {
            int tmp = dp(n / 2) + 1;
            if (d[n] > tmp)
                d[n] = tmp;
        }
        if (n % 3 == 0) {
            int tmp = dp(n / 3) + 1;
            if (d[n] > tmp)
                d[n] = tmp;
        }
        return d[n];
    }
}