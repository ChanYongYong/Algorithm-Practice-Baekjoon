package Bronze2.Day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class BOJ3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i <10; i++) {
            int temp = sc.nextInt()%42;
            mySet.add(temp);
        }
        System.out.println(mySet.size());

    }
}

// set이라는 자료구조는 중복값을 허용 안 함