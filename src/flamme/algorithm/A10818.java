package flamme.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String input2 = br.readLine();
        String[] numberGroup = input2.split(" ");
        if (input == numberGroup.length) {
            int[] numberArraysortGroup = new int[input];
            for(int i = 0; i<input; i++) {
                numberArraysortGroup[i] = Integer.parseInt(numberGroup[i]);
            }
            Arrays.sort(numberArraysortGroup);
            System.out.println(numberArraysortGroup[0]+" "+numberArraysortGroup[input-1]);
        }
    }

    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String input2 = br.readLine();
        StringTokenizer str = new StringTokenizer(input2);
        if (input == str.countTokens()) {
            int[] numberArraysortGroup = new int[input];
            for(int i= 0; i<input; i++) {
                numberArraysortGroup[i] = Integer.parseInt(str.nextToken());
            }
            Arrays.sort(numberArraysortGroup);
            System.out.println(numberArraysortGroup[0]+" "+numberArraysortGroup[input-1]);
        }
    }

     */
}