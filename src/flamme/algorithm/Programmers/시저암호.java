package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
시저함호는 고대 암호라고 합니다.

https://jhnyang.tistory.com/188

문제 설명
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다.
 z는 1만큼 밀면 a가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.

문제풀이 :
char?
문자를 저장하기 위한 변수를 선언할 때 사용되며, char 타입의 변수는 하나의 문자만 저장할 수 있다.

'char'의 형태로 나타낼 수 있는 방법은 유니코드, ASCII코드, 문자 세 가지 방법이 있다.

가장 쉽게 사용할 수 있는 방법은 다음과 같이 한 문자를 표현할 때 사용하는 것이다.
https://keep-cool.tistory.com/12

charAt (문장중에 인덱스 위치에 해당되는 문자 추출하기)
영어는 26개의 숫자로 되어있음.
 */
public class 시저암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution("A B",1));
    }
    public static String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            char alpa = s.charAt(i);
            if(alpa >= 'a' && alpa <= 'z') {
                if(alpa + n > 'z') answer += (char)(alpa + n-26);
                else answer += (char)(alpa + n);
            }
            else if(alpa >= 'A' && alpa <= 'Z') {
                if(alpa + n > 'Z') answer += (char)(alpa + n-26);
                else answer += (char)(alpa + n);
            }
            else answer += (char)alpa;

        }
        return answer;
    }
}
