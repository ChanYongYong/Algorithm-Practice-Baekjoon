package Bronze2.Day3;

import java.util.Scanner;

public class BOJ2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        char[] text = String.valueOf(a*b*c).toCharArray();
        int[] count = new int[10];

        for(int i=0;i<text.length;i++){
            count[Integer.parseInt(String.valueOf(text[i]))]++;
            // count[text[i]-'0']++;
        }
        for(int i=0;i<count.length;i++){
            System.out.println(count[i]);
        }
    }
     //    Integer.parseInt()는 **문자열(String)**만 처리
}
