package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
다르면 False를 return 하는 solution를 완성하세요.
'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.

획기적 답안

 return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
 */
public class 문자열내p와y의개수 {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(sc.readLine()));
    }

    public static boolean solution(String s) {

        if(s.length() > 50 ){
            return false;
        }

        String[] test = s.toLowerCase().split("");

        int p = 0;
        int y = 0;

        for (String stringArray: test
             ) {
            if(stringArray.equals("p")) {
                p++;
            } else if(stringArray.equals("y")) {
                y++;
            }
        }

        boolean answer = true;

        if(p==y) {
            answer = true;
        } else  {
            answer = false;
        }

        return answer;
    }
}
