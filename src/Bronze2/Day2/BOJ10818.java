package Bronze2.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        /* 모든 정수와 비교 가능한 안전한 초기값,
        만약 배열에 음수만 있다면? 예: {-5, -9, -3}
        → max는 끝까지 0보다 큰 수를 못 만나므로 0 그대로 남음 → ❌ 틀림*/
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp > max) max = temp;
            if (temp < min) min = temp;
        }
        System.out.println(min + " " + max);
    }
}
