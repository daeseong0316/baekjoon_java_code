import java.util.*;
import java.io.*;

public class bj18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (count < n) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens() && count < n) {
                list.add(Integer.parseInt(st.nextToken()));
                count++;
            }
        }
        
        int ave = Math.round(n * 15.0f / 100.0f);
        Collections.sort(list);
        
        Deque<Integer> que = new ArrayDeque<>(list);
        while (ave-- > 0) {
            que.pollFirst();
            que.pollLast();
        }
        
        int sum = 0;
        for (int num : que) {
            sum += num;
        }
        
        int result = Math.round((float) sum / que.size());
        bw.write(String.valueOf(result));
        bw.newLine();
        bw.flush();
    }
}
