package flamme.algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[] arr = new int[input+1];
        arr[1] = 1;
        if(input >1) arr[2] = 3;
        int result = 0;
        result = recursive(input, arr);
        System.out.println(result);
    }

    private static int recursive(int input, int[] arr) {
        if (arr[input] > 0) {
            return arr[input];
        }
        if(input >2) arr[input] = (recursive(input-1, arr) + (recursive(input-2, arr))*2)%10007;
        return arr[input];
    }
}
