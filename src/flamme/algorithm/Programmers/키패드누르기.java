package flamme.algorithm.Programmers;

/*처음 왼손 엄지손가락 * , 오른손 엄지손가락 #  키패드위치에서 시작하며 엄지손가락을 사용하는 규칙
 엄지손가락은 상하좌우 4가지 방향 이동, 키패드 이동 한 칸을 거리로 1에 해당
 왼쪽 열 3개지 1,4,7 왼손 엄지
 오른쪽 열의 3개 3,6,9 오른손 엄지
 가운데 열 2,5,8,0 두 엄지손가락의 현재 키패드의 위치에서 더 가까운엄지 사용
 4-1 만약 두 엄지손가락의 거리가 같다면  오른손잡이는 오른손 엄지 왼손잡이는 왼손 엄지
*/
public class 키패드누르기 {
    public static void main(String[] args) throws Exception {



        int[] arrayString =  {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};

        solution(arrayString, "right");
    }

    public static String[] solution(int[] arr, String handle) {
        String[] answer = new String[arr.length];
        int right = 0;
        int left = 0;

        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4 || arr[i] == 7) {
                answer[i] = "L";
                left = arr[i];
            } else if (arr[i] == 3 || arr[i] == 6 || arr[i] ==9) {
                answer[i] = "R";
                right = arr[i];
            } else if (arr[i] == 2 || arr[i] == 5 || arr[i] == 8 || arr[i] == 0) {

                int rightSum = Math.abs(right - arr[i]);
                int leftSum = Math.abs(left - arr[i]);

                if(leftSum == rightSum ) {
                    if (handle.equals("right")) {
                        answer[i] = "R";
                        right = arr[i];
                    } else if (handle.equals("left")) {
                        answer[i] = "L";
                        left = arr[i];
                    }
                }else if( rightSum < leftSum) {
                    answer[i] = "R";
                    right = arr[i];
                } else {
                    answer[i] = "L";
                    left = arr[i];
                }
            }
            System.out.println(answer[i]);
            //"LRLLLRLLRRL"
            //LRLLRRLLLRR

        }

        return answer;
    }
}
