import java.util.*;
import java.io.*;

public class bj17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken()); 

        Map<String, String> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            String email = str[0];
            String pw = str[1];
            map.put(email, pw);
        }

        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            if (map.containsKey(query)) {
                bw.write(map.get(query));
                bw.newLine(); 
            }
        }

        bw.flush();
    }
}
