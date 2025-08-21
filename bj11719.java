import java.io.*;
import java.util.*;

public class bj11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str;
        
        while((str = br.readLine()) != null) {	// 문자열 입력
        	bw.write(str + "\n");	// 출력
        	bw.flush();
        }
        
        bw.close();
    }
}
