package Bronze2.Day2;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.next();
        int j = scanner.nextInt();
        if (j < 45) {
            j += 60;
            i--;
            if (i < 0) {
                i += 24;
            }
        }
        j -= 45;
        System.out.println(i + " " + j);
    }
}
