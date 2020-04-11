package flamme.algorithm.InOutStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//빠른 예제에서는 먼저 별과 "" 를 모두 10개를 찍고나서 후에 갯수로 subString을 이용해서 삭제시켜주었다.
public class A2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        for(int i=0; i<input; i++) {
            String front = "";
            String middle = "";
            for(int j = 0; j<=i; j++){
                front += "*";
            }
            for(int j = 0; j<(input*2)-(front.length()*2); j++) {
                middle += " ";
            }
            builder.append(front+middle+front+"\n");
        }

        for(int i = 1; i < input; i++) {
            String front = "";
            String middle = "";
            for(int j = input-i; j>0; j--) {
                front +="*";
            }
            for(int j = 1; j<= i*2; j++ ) {
                middle += " ";
            }
            builder.append(front+middle+front+"\n");
        }
        System.out.println(builder);
    }
}
