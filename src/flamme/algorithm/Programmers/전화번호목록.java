package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 문제 설명
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 *
 * 구조대 : 119
 * 박준영 : 97 674 223
 * 지영석 : 11 9552 4421
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
 * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록
 * solution 함수를 작성해주세요.
 */
public class 전화번호목록 {

    public static void main(String[] args) throws Exception {

        String[] arrayString =  new String[3];
        arrayString[0] = "97674223";
        arrayString[1] = "1195524421";
        arrayString[2] = "118";

        System.out.println(solution(arrayString));

    }
    // clean 하네요 우왕
    private static boolean solution(String[] phoneBook) {
        return checkDuplicatePhoneNumber(phoneBook);

    }

    private static boolean checkDuplicatePhoneNumber(String[] phoneBook) {
        for(String phoneNumber : phoneBook) {
            if(countPrefixDuplicatePhoneNumber(phoneBook, phoneNumber) > 1) return false;
        }
        return true;
    }

    private static int countPrefixDuplicatePhoneNumber(String[] phoneBook, String phoneNumber) {
        return (int)Arrays.stream(phoneBook).filter(s -> s.startsWith(phoneNumber)).count();
    }
}
