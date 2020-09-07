package flamme.algorithm.Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*

실패율은 다음과 같이 정의한다.
스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

전체 스테이지의 개수 N,
게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때,
실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.

스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
stages의 길이는 1 이상 200,000 이하이다.
stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.

 */
public class 실패율 {

    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayString =  {1,1,1,1,1,1,1,1};

        solution(5, arrayString);
    }

    public static int[] solution(int N, int[] stages) {
        int fail = stages.length;
        double rate;
        double[][] result = new double[N][2];

        int[] answer = new int[N];

        for(int i = 1; i<N+1; i++) {
            for (int stage : stages) {
                if (stage == i) {
                    answer[i - 1]++;
                }
            }
            //Double 0.0은 나눌수 없으므로 NaN이 나온다. 그러므로
            //NaN체크를 해줘서 0으로 만들어줘야 한다.gg
            rate = (float)answer[i-1]/fail;
            if(Double.isNaN(rate)){
                rate = 0;
            }
            System.out.println("answer = " + i +" result = " + rate);
            result[i-1][0] = rate;
            result[i-1][1] = i;
            fail -= answer[i-1];
        }
        Arrays.sort(result, Collections.reverseOrder(Comparator.comparingDouble(a -> a[0])));

        for (int i = 0; i<result.length; i++) {
            answer[i] = (int) result[i][1];
            System.out.println(answer[i]);
        }

        return answer;
    }
}
