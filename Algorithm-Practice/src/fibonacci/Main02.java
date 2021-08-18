package fibonacci;

/**
 * 피보나치 수열 연습 02
 * 배열 미사용
 */
public class Main02 {
    public static void main(String[] args) {
        // 1 인덱스, 2 인덱스는 항상 1로 초기화
        int prevNum = 1;
        int prevPrevNum = 1;

        System.out.print(prevNum + " ");
        System.out.print(prevPrevNum + " ");

        for(int i = 3; i <= 10; i++) {
            int sunNum = prevPrevNum + prevNum;
            System.out.print( sunNum + " ");

            prevPrevNum = prevNum;
            prevNum = sunNum;
        }
    }

}
