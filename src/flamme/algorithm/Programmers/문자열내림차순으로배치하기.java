package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

내가 원했던 것
public String reverseStr(String str){
        return Stream.of(str.split(""))
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.joining());
    }

 */
public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(sc.readLine()));
    }

    public static String solution(String s) {
        return Stream.of(s.split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
    }
}
