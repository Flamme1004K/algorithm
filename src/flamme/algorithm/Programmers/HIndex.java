package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class HIndex {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int[] intArray =  {3, 0, 6, 1, 5};
        System.out.println("intArray = " + solution(intArray));
    }

    public static int solution(int[] citations) {

        int answer = 0;

        for(int i=1; i<=citations.length; i++) {
            int index = i;

            long count =Arrays.stream(citations).filter(x -> x >= index).count();

            if(index <= count) {
                answer = index;
            }
        }

        return answer;

    }
}
