package string;

import java.util.Scanner;

/**
 * - 중복문자제거 -
 *
 * 설명
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */
public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String answer = "";

        // 1. 문자열 존재 여부 접근
//        for(char x : input.toCharArray()) {
//            if(answer.indexOf(x) < 0) {
//                answer += x;
//            }
//        }

        // 2. 인덱스 비교 접근
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(i == input.indexOf(c)) {
                answer += c;
            }
        }

        System.out.println(answer);
    }
}
