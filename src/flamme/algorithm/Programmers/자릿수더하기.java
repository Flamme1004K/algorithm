package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수

풀이방법 :

int를 넣어서 String으로 교체해준 다음에 String을 나누는 작업을 하였다.
그리고 그것을 더해주었다.
하지만 리소스를 많이먹는 코드라고 하였다.

나눠서 나머지를 더하는 형식도 괜찬을듯하다.

*/

public class 자릿수더하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(Integer.parseInt(sc.readLine())));
    }

   public static int solution(int n) {
        String answer = Integer.toString(n);
        String data[] = answer.split("");
        int sum = 0;
        for(int i = 0; i<data.length; i++) {
            sum += Integer.parseInt(data[i]);
        }

        return sum;
    }
}
