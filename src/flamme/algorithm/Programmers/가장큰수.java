package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class 가장큰수 {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int[] intArray =  {6, 10, 2};
        System.out.println("intArray = " + solution(intArray));
    }

    public static String solution(int[] numbers) {
        String[] stringArray = new String[numbers.length];

        for(int i=0; i< stringArray.length; i++) {
            stringArray[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(stringArray, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        return stringArray[0].equals("0") ? "0" : String.join("",stringArray);
    }
}
