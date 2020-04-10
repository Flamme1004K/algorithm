package flamme.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A2440 {
    public static void main(String[] args)throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String line = bfr.readLine();
        int N = Integer.parseInt(line);

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i< N;i++){
            for (int j = i; j < N; j++){
                strBuilder.append("*");
            }
            strBuilder.append("\n");
        }
        System.out.print(strBuilder);
    }
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=input; i>0; --i){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

     */
}
