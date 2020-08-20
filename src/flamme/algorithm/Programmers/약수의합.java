package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

 */
public class 약수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(Long.parseLong(sc.readLine())));
    }
    public static long solution(long n) {
        long answer = 0;
        int a;
        for (a = 1; a <= n; a++) {
            if ((n % a) == 0) {
                answer +=a;

            }
        }
        return answer;
    }
}
