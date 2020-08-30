package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayString =  new int[4];
        arrayString[0] = 5;
        arrayString[1] = 9;
        arrayString[2] = 7;
        arrayString[3] = 10;

        solution(arrayString, 20);
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(x -> x%divisor==0).sorted().toArray();
        if(answer.length==0) {
            return answer = new int[]{-1};
        }
        return answer;
    }
}
