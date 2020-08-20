package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/*

문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.

121 -> 144
3 -> -1

x = (x+ (a/x))/2

Math.sqrt --> 121 -> 11로 제곱근을 만들어주는것
Math.pow --> 제곱근을 만드는
제곱근을 구해서 만약에 a*a가 기존과 같으면 답을 표출
만약에 틀리면 -1
 */

public class 정수제곱근판별 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(Long.parseLong(sc.readLine())));
    }
    public static long solution(long n) {
        long answer = 0;
        long a = (long)Math.sqrt(n);
        answer = Math.pow(a, 2) == n ? (long) Math.pow(a+1, 2) : -1;
        /*
        if(a*a == n) {
            a++;
            answer = a*a;
        } else {
            answer = -1;
        }
         */
        return answer;
    }
}
