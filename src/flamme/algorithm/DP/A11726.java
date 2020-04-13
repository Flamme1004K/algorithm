package flamme.algorithm.DP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//직사각형 2*n문제
//10007로 나눈 나머지를 출력
//top bottom 방식. 재귀호출 이용하여 풀이
public class A11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[] arr = new int[input+1];
        arr[1] = 1;
        if(input >1) arr[2] = 2;
        int result = 0;
        if(input >2)  result = recursive(input, arr);
        System.out.println(result%10007);
    }

    private static int recursive(int input, int[] arr) {
        arr[input] = recursive(input-1, arr) + recursive(input-2, arr);
        return arr[input];
    }
    /*

    짧은 코드 차이인데 속도개선이 왜 된걸까?
    위로했을때는 50초 이상걸리는데 아래는 1초만에 된다..

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
     */
}
