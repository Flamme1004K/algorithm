package flamme.algorithm.Programmers;

import java.awt.*;


/*처음 왼손 엄지손가락 * , 오른손 엄지손가락 #  키패드위치에서 시작하며 엄지손가락을 사용하는 규칙
 엄지손가락은 상하좌우 4가지 방향 이동, 키패드 이동 한 칸을 거리로 1에 해당
 왼쪽 열 3개지 1,4,7 왼손 엄지
 오른쪽 열의 3개 3,6,9 오른손 엄지
 가운데 열 2,5,8,0 두 엄지손가락의 현재 키패드의 위치에서 더 가까운엄지 사용
 4-1 만약 두 엄지손가락의 거리가 같다면  오른손잡이는 오른손 엄지 왼손잡이는 왼손 엄지

 3* 0 + 1 =1 0,1
 ..
 3 * 1 + 1 =4 1.1

 3 * 2 + 1 =7 2.1
*/
public class 키패드누르기 {
    public static void main(String[] args) throws Exception {



        int[] arrayString =  {1, 3, 4, 5, 8, 2, 1, 4, 5, 9,5};


        System.out.println(solution(arrayString, "right"));
    }

    public static String solution(int[] arr, String handle) {
        StringBuilder sb = new StringBuilder();

        Point[] nums = new Point[10];
        nums[0] = new Point(3, 1);
        nums[1] = new Point(0, 0);
        nums[2] = new Point(0, 1);
        nums[3] = new Point(0, 2);
        nums[4] = new Point(1, 0);
        nums[5] = new Point(1, 1);
        nums[6] = new Point(1, 2);
        nums[7] = new Point(2, 0);
        nums[8] = new Point(2, 1);
        nums[9] = new Point(2, 2);
        Point L = new Point(3, 0);
        Point R = new Point(3, 2);

        for (int num : arr) {
            if (num == 1 || num == 4 || num == 7) {
                L.x = nums[num].x;
                L.y = nums[num].y;
                sb.append("L");
            } else if (num == 3 || num == 6 || num == 9) {
                R.x = nums[num].x;
                R.y = nums[num].y;
                sb.append("R");
            } else {
                int disL = Math.abs(L.x - nums[num].x) + Math.abs(L.y - nums[num].y);
                int disR = Math.abs(R.x - nums[num].x) + Math.abs(R.y - nums[num].y);
                if (disL == disR) {
                    if (handle.equals("right")) {
                        R.x = nums[num].x;
                        R.y = nums[num].y;
                        sb.append("R");
                    } else {
                        L.x = nums[num].x;
                        L.y = nums[num].y;
                        sb.append("L");
                    }
                } else {
                    if (disR < disL) {
                        R.x = nums[num].x;
                        R.y = nums[num].y;
                        sb.append("R");
                    } else {
                        L.x = nums[num].x;
                        L.y = nums[num].y;
                        sb.append("L");
                    }
                }
            }
        }

        return sb.toString();
    }
}
