package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 */

public class 가운데글자가져오기 {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(sc.readLine()));
    }

    public static String solution(String s) {
        String answer = "";
        int a = s.length()/2;
        System.out.println(a);
        return answer;
    }
}
