package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.
 */
public class 문자열내맘대로정렬하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayString =  new String[3];
        arrayString[0] = "sun";
        arrayString[1] = "bed";
        arrayString[2] = "car";

        solution(arrayString, 1);
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);

            if(c1 == c2){
                return s1.compareTo(s2);
            } else return c1 - c2;
        });

        return strings;
    }
}
