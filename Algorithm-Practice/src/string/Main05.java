package string;

import java.util.Scanner;

/**
 * - 특정 문자 뒤집기 -
 *
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */
public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] chars = input.toCharArray();
        int leftIndex = 0, rightIndex = chars.length - 1;

        while(leftIndex < rightIndex) {
            if(!Character.isAlphabetic(chars[leftIndex])) {
                leftIndex ++;
            }else if(!Character.isAlphabetic(chars[rightIndex])) {
                rightIndex --;
            }else {
                char temp = chars[leftIndex];
                chars[leftIndex] = chars[rightIndex];
                chars[rightIndex] = temp;

                leftIndex ++;
                rightIndex --;
            }
        }

        System.out.println(new String(chars));
    }

//    public static boolean isAlphabet(char c) {
//        if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
//            return true;
//        }else {
//            return false;
//        }
//    }
}
