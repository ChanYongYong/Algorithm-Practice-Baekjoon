package Bronze2.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();
        //알파벳을 순회하며
        for(int i = 0; i <26; i++){
            int temp =-1;
            for(int j=0;j<text.length;j++){
                if(text[j]-'a'==i){
                    temp=j;
                    break;
                }
                System.out.print(temp+" ");
            }
        }


        /*int[] alphabet = new int[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Arrays.fill(alphabet, -1);
        int j=0;
        for (int i : s.toCharArray()) {
            if(alphabet[i-'a']==-1){
                alphabet[i-'a']=j;
            }
            j++;
        }
        for(int i=0;i<alphabet.length;i++){
            System.out.print(alphabet[i]+" ");
        }
*/

    }
}
