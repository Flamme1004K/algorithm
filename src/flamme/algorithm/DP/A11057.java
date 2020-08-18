package flamme.algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
1,2,3,4,5,6,7,8,9,0

   1~9 - 9
   0 - 10

   10 11 12 13 14 15 16 17 18 19 10
   11,12,13,14,15,16,17,18,19 9
   22, 23,24,25,26,27,28,29 8
   33, 34,35,36,37,38,39 7
   44, 45,46,47,48,49 6
   55, 56,57,58,59 5
   66, 67,68,69 4
   77,78,79 3
   88, 89 2
   99 1

   1 ~ 9 45
   10 10

   55

   55 220
   45 165
   36 120
   28 84
   21 56
   15 35
   10 20
   6
   3
   1

   1 ~ 9 165
   10 55
    n top => 1 ~ (n자리 수)-1의 합
    recursive n

    n last => 1~ n자리 수의 합

         0 1,2,3,4,5,6,7,8,9
       1 1  1  1  1  1  1  1  1 1 1
       2 10 9  8  7  6  5  4  3 2 1
       3 55 45 36 28 21 15 10 6 3 1
       4
       5
       6
       7
       8
       9

       2차원 배열을 생각하면 된다.
*/



public class A11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long input = Integer.parseInt(br.readLine());

        long[] dp = new long[10];

        for (int i = 0; i < 10; i++) {
            dp[i] = 1;
        }
        for (int j = 1; j < input; j++) {
            for (int i = 1; i < 10; i++) {
                dp[i] = (dp[i] + dp[i-1]) % 10007;
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dp[i];
        }

        System.out.println(sum % 10007); // 더한 값 역시 나머지 연산을 수행한다.
    }
}

