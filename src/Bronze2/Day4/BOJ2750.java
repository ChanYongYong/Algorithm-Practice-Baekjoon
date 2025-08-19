package Bronze2.Day4;

import java.util.Scanner;

public class BOJ2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        /*Arrays.sort(A); 이 기능은 시간 복잡도 nlogn
        Arrays.sort(arr, Collections.reverseOrder()); 내림차순
        문제에서의 시간 제한은 1초 이기에 n제곱도 가능.
        즉 버블정렬 사용 가능*/

        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(A[j]>A[j+1]){ // 내림차순의 경우 부호를 <
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }
}
