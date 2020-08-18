package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

풀이법
배열을 이용한 문제이다.
문자열 전체를 배열로 만들어서 배열에 대한 길이를 만들고,
cnt값을 만든다 그리고 공백이 올때마다 0을 초기화해주고
cnt가 짝수면 대문자로 만들고주고 cnt가 홀수면 소문자로 만들어주면 된다.
*/

public class 이상한문자만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(sc.readLine()));

    }
    public static String solution(String s) {
        String[] data = s.split("");
        String answer = "";
        int len = data.length;
        int cnt = 0;
        for (int i = 0; i <len; i++) {
            if(data[i].equals(" ")) {
                cnt = 0;
            } else {
                if(cnt %2 ==0) {
                    data[i] = data[i].toUpperCase();
                    cnt ++;
                }else {
                    data[i] = data[i].toLowerCase();
                    cnt ++;
                }
            }
            answer += data[i];
        }
        return answer;
    }
}
