package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*

문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.

temp 값을 잘 이용하면 풀 수 있따.

 */
public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = solution(Long.parseLong(sc.readLine()));
        System.out.println(ar.length);
    }

    public static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int index= 0;
        int temp =0;
        while (n > 0) {
            temp = (int) (n%10);
            n = n/10;
            answer[index] = temp;
            index ++;
        }

        return answer;
    }
}
