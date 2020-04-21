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
       1
       2
       3
       4
       5
       6
       7
       8
       9

       2차원 배열을 생각하면 된다.
*/



public class A11057 {
    static int dp[][] ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        dp = new int [input+1][10];

        // 초기값은 n이 1일 경우 모두 1로 초기화 한다.
        dp[1][0] = dp[1][1] =dp[1][2] = dp[1][3] =dp[1][4] = dp[1][5] =dp[1][6] = dp[1][7] =dp[1][8] = dp[1][9] =1;

        for(int i=2;i<=input;i++) { //  2부터 n까지 반복
            for(int j=0;j<10;j++) { // 0 ~ 9를 탐색하는데,
                for(int k=0;k<=j;k++) { // j를 기준으로 0부터 j까지 탐색
                    dp[i][j] += dp[i-1][k]; // k로 탐색한 값을 j에 누적
                }
                dp[i][j] %= 10007; // 데이터 타입 범위를 위해 나머지 연산 후 저장한다.
            }

        }

        int sum = 0;
        for(int i=0;i<10;i++) { // n번 째 행의 경우들을 모두 더한다.
            sum+=dp[input][i]; // 더하는 과정에서 값이 또 커질 수 있으므로
        }

        System.out.println(sum % 10007); // 더한 값 역시 나머지 연산을 수행한다.
    }
}
