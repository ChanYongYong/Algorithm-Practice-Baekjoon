package Bronze2.Day3;

import java.util.Scanner;

public class BOJ8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < n; j++) {
            char[] text = sc.nextLine().toCharArray();
            int sum = 0;
            int count = 0;
            for (int i = 0; i < text.length; i++) {
                if (text[i] == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
