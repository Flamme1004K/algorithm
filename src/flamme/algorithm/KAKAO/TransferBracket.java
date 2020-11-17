package flamme.algorithm.KAKAO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;


//https://web2eye.tistory.com/184
// 느낀점 : 문제가 주는데로 푸는 것도 나쁘지는 않다..?
public class TransferBracket {

    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(sc.readLine()));
    }
    //()))((() > ()(())()
    public static String solution(String s) {

        if(s.length()==0) {
                return "";
        }
        //[0] ))(( [1]()
        String[] bracketArray = division(s);
        if (isCorrect(bracketArray[0])) {
            return bracketArray[0] + solution(bracketArray[1]); // (())() -> ()(())()
        //() ,
            // ))((()
            // ))((
            // ()
        }
        String result = makeNotCorrectCaseText(bracketArray);
        System.out.println("result = " + result);
        return result;
    }

    private static String makeNotCorrectCaseText(String[] divisionText) {
        //divisionText[0] u ))(( / divisionText[1]  v ()
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(solution(divisionText[1])); //()
        sb.append(")"); // (())
        System.out.println("sb1 = " + sb.toString());
        sb.append(reverseText(deleteFirstAndLastText(divisionText[0]))); //)( -> ()
        System.out.println("sb2 = " + sb.toString());// (())()
        return sb.toString();
    }

    private static String reverseText(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                sb.append(')');
            } else {
                sb.append('(');
            }
        }
        System.out.println("sb.toString() = " + sb.toString());
        return sb.toString();
    }

    private static String deleteFirstAndLastText(String text) {
        return text.substring(1, text.length() - 1);
    }
    //()
    private static boolean isCorrect(String u) {
        Stack<Character> stack = new Stack<>();
        try {
            //))((
            for (int i = 0; i < u.length(); i++) {
                char text = u.charAt(i);
                if (text == '(') {
                    //
                    stack.add(text);
                } else {
                    stack.pop();
                }
            }
        } catch (EmptyStackException e) {
            System.out.println("e = " + e);
            return false;
        }
        return true;
    }
    //()))((()
    private static String[] division(String s) { //
        int endIndex = endIndex(s); // 2
        System.out.println("endIndex = " + endIndex);
        String u = s.substring(0, endIndex); // u-> ()
        System.out.println("u = " + u);
        String v = s.substring(endIndex); //v -> ))((()
        System.out.println("v = " + v);
        return new String[]{u, v}; // () , ))((()
    }
    //()
    public static int endIndex(String s) {
        int openCount = 0;
        int closeCount = 0;
        int size = s.length(); //()))((() = leng -> 8
        System.out.println("size = " + size);
        for (int i = 0; i < size; i++) {
            char text = s.charAt(i);
            if (text == '(') {
                openCount++; // ( = 1
            } else {
                closeCount++; // ) = 1
            }

            if ((openCount > 0 && closeCount > 0) && openCount == closeCount) {
                return i + 1; //-> 2
            }
        }
        return size;
    }

}
