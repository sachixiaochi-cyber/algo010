import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class algo010 {
    public static void main(String[] args) {

        // 初期処理
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] step = sc.nextLine().split("");

        // 初期の座標
        int x = 0;
        int y = 0;

        // 位置の記録
        Set<String> visited = new HashSet<>();
        visited.add(x + "," + y);

        boolean revisited = false; 

        // n回ループで移動する
        for (int i = 0; i < n; i++) {
            switch (step[i]) {
                case "R" -> x += 1;
                case "L" -> x -= 1;
                case "U" -> y += 1;
                case "D" -> y -= 1;
            }

            String pos = x + "," + y;
            if (!visited.add(pos)) {
                revisited = true;
            }
        }

        // 結果出力
        if (revisited) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}