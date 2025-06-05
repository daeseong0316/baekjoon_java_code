import java.io.*;
import java.util.*;

public class bj10845 { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String cmd = input[0];

            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(input[1]);
                    que.offer(x);  // 뒤에 넣기
                    break;
                case "pop":
                    if (que.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(que.poll()).append('\n');  // 앞에서 꺼내기
                    }
                    break;
                case "size":
                    sb.append(que.size()).append('\n');
                    break;
                case "empty":
                    sb.append(que.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    if (que.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(que.peekFirst()).append('\n');
                    }
                    break;
                case "back":
                    if (que.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(que.peekLast()).append('\n');
                    }
                    break;
            }
        }

        System.out.print(sb);
    }
}
