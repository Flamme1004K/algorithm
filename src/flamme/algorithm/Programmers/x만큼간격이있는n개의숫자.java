package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

long을 써서 속도개선이 되었다?
https://krksap.tistory.com/1448
*/
public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(2,5));

    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp1 = x;
        //answer[0] = x;

        for(int i=0; i<answer.length; i++) {
            answer[i] = temp1;
            //answer[i] = answer[i-1]+x
            temp1 +=x;
            System.out.println(answer[i]);
        }
        return answer;
    }

}
