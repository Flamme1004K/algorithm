package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/*

문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.

문제 해결
Arrays.sort를 해서 일단 소트를 한다.

Collections.reversOrder?를 이용하여 역순으로 정렬을 한다.

*/
public class 정수내림차으로배치하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(Long.parseLong(sc.readLine())));
    }

    public static long solution(long n) {
        long answer = 0;
        int len = Long.toString(n).split("").length;

        String[] array = Long.toString(n).split("");

        String temp = "";
        Arrays.sort(array, Collections.reverseOrder());

        for(int i=0; i<len; i++) {
            temp += Integer.parseInt(array[i]);
        }
        answer = Long.parseLong(temp);
        return answer;
    }
}
