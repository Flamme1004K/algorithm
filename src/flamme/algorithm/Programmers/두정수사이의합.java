package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

등차수열의 합 공식

 */

public class 두정수사이의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(3,5));
    }

    public static Long solution(int a, int b) {
        long sum = 0;
        long num1 = Math.max(a, b);
        long num2 = Math.min(a, b);

        for(long i = num2; i<= num1; i++) {
            if(num1 == num2) {
                return num1;
            }
            sum += i;
        }

        return sum;
    }

}
