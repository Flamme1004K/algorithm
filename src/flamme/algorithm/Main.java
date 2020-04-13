package flamme.algorithm;

import java.io.*;

public class Main {
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        arr = new int[input+1];
        int result = recursive(input);
        System.out.println(result);
    }

    private static int recursive(int input) {
        if (input >= 0 && input <= 2) {
            arr[input] = input;
            return arr[input];
        }
        if (arr[input] > 0) {
            return arr[input];
        }

        arr[input] = (recursive(input-1) + recursive(input-2))%10007;

        return arr[input];
    }
}
