package flamme.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AplusB2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList a = new ArrayList();
        for(int i=0; i<Integer.parseInt(input); i++){
            String numberGroup = br.readLine();
            String[] b = numberGroup.split(" ");
            int number1 = Integer.parseInt(b[0]);
            int number2 = Integer.parseInt(b[1]);
            a.add(number1+number2);
        }
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}
