package flamme.algorithm.Programmers;

import java.io.*;
import java.util.*;

/*
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

신박한 덧글
길이 검사도 정규표현식으로 가능해요. "^[0-9]{4}|{6}$" 요렇게
dinohan―2020.02.26 00:31

 */
public class 문자열다루기기본 {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(sc.readLine()));
    }

    public static boolean solution(String s) {
        boolean answer = false;
        if(s.length() ==4 || s.length()==6 ) {
            String regEx = "^[0-9]+$";
            String[] strings = s.split("");
            answer = Arrays.asList(strings).stream().allMatch(a -> a.matches(regEx));
        }
        return answer;
    }
}
