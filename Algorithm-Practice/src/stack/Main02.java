package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * - 괄호문자제거 -
 *
 * 설명
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 남은 문자만 출력한다.
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Stack<Character> stack = new Stack<>();
        for(char x : input.toCharArray()) {
            if(x == ')') {
                while(true) {
                    Character pop = stack.pop();
                    if(pop == '(') {
                        break;
                    }
                }
            }else {
                stack.push(x);
            }
        }

        String answer = "";
        for(int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }

        System.out.println(answer);

    }
}
