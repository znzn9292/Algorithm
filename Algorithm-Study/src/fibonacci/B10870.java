package fibonacci;

import java.util.Scanner;

/**
 * B10870 (BaekJoon, 10870번)
 *
 * 문제
 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
 * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
 *
 * 출력
 * 첫째 줄에 n번째 피보나치 수를 출력한다.
 */
public class B10870 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // 방법 1 (반복문)
//        int prevPrevNum = 0;
//        int prevNum = 1;
//
//        int sumNum = 0;
//        for(int i = 1; i < n; i++) {
//            sumNum = prevPrevNum + prevNum;
//
//            prevPrevNum = prevNum;
//            prevNum = sumNum;
//        }
//        System.out.println(sumNum);

        // 방법 2 (재귀)
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int num) {
        if(num == 0)
            return 0;
        if(num == 1)
            return 1;

        int prevPrevNum = fibonacci(num - 2);
        int prevNum = fibonacci(num - 1);

        return prevPrevNum + prevNum;
    }


}
