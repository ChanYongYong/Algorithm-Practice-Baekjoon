package Bronze2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens());
    }
}
/*
public class Main {
    public static void main(String[] args) throws IOException {
        int cnt = 0;
        int pre = ' ';
        while (true) {
            int ch = System.in.read();
            if(ch == '\n') {
                if(pre != ' ') cnt++;
                break;
            }
            if(ch == ' ') {
                if(pre != ' ') cnt++;
            }
            pre = ch;
        }
        System.out.println(cnt);
    }
}*/
