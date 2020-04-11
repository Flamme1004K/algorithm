package flamme.algorithm.InOutStream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A202004072 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(in.readLine());
        String NumberGroup = in.readLine();
        if(input == NumberGroup.length()){
            int sum = 0;
            for(int i=0; i<NumberGroup.length(); i++){
                sum += Integer.parseInt(NumberGroup.substring(i,i+1));
            }
            System.out.println(sum);
        }
    }
}
