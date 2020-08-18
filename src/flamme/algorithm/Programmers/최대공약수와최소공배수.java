package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*


두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.

*/
public class 최대공약수와최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(2,5));

    }
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = gcd(n, m);
        answer[0] = a;
        answer[1] = n*m / a;
        return answer;
    }
    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}
