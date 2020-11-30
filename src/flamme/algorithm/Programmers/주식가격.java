package flamme.algorithm.Programmers;
/*
초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,

가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록

solution 함수를 완성하세요.
 */
public class 주식가격 {

    public static void main(String[] args) throws Exception {

        int[] numbers =  {1,2,3,2,3};

        System.out.println(solution(numbers));

    }

    private static int[] solution(int[] numbers) {

        int[] answer = new int[numbers.length];

        int cnt = 0;

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                cnt++;
                if(numbers[i] > numbers[j]) {
                    break;
                }
            }

            answer[i] = cnt;

            cnt = 0;
        }

        return answer;

    }

}
