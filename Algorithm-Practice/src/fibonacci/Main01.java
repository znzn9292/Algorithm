package fibonacci;

/**
 * 피보나치 수열 연습 01
 * 배열 사용
 */
public class Main01 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        // 1 인덱스, 2 인덱스는 항상 1로 초기화
        arr[1] = 1;
        arr[2] = 1;

        for(int i = 3; i < 100; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for(int i = 1; i <= 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
