package flamme.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int inputLength = input.length()/10;

        for(int i=0; i<inputLength+1; i++){
            if(i==inputLength){System.out.println(input.substring((inputLength)*10));}
            else{System.out.println(input.substring(i*10,(i+1)*10));}
        }
    }
}
