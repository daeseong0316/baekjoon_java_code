import java.io.*;
import java.util.*;

public class bj3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        
        int r2 = 2*s - r1;
        
        bw.write(String.valueOf(r2));
        
        bw.flush();
        bw.close();
    }
}
