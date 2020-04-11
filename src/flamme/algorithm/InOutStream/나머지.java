package flamme.algorithm.InOutStream;

import java.util.Scanner;
import java.util.stream.Stream;

public class 나머지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int[] array =  Stream.of(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println(a*(array[2]));
        System.out.println(a*(array[1]));
        System.out.println(a*(array[0]));
        System.out.println(a*b);
    }
}
