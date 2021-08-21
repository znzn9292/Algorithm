package string;

import java.util.Scanner;

/**
 * - 단어 뒤집기 -
 *
 * 설명
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();

        String[] inputArr = new String[inputInt];
        for(int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.next();
        }

        // 1. StringBuilder.reverse() 사용
//        for(String x : inputArr) {
//            StringBuilder xBuilder = new StringBuilder(x);
//            System.out.println(xBuilder.reverse());
//        }

        // 2. 자리 교환
        for(String x : inputArr) {
            char[] s = x.toCharArray();
            char temp;
            int sLeng = s.length;

            for(int i = 0; i < sLeng / 2; i++) {
                temp = s[i];
                s[i] = s[sLeng-i-1];
                s[sLeng-i-1] = temp;
            }

            System.out.println(new String(s));
        }
    }
}
