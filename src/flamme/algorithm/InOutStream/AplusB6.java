package flamme.algorithm.InOutStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusB6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int[][] a = new int[input][2];

        for(int i=0; i<input; i++){
            String numberGroup = br.readLine();
            String[] b = numberGroup.split(" ");
            int number1 = Integer.parseInt(b[0]);
            int number2 = Integer.parseInt(b[1]);
            a[i][0] = number1;
            a[i][1] = number2;
        }

        for(int i=0; i<input; i++){
            System.out.printf("Case #%d: %d + %d = %d \n",i+1,a[i][0],a[i][1], a[i][0]+a[i][1]);
        }
    }
}
