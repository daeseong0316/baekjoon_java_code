import java.io.*;
import java.util.*;

public class bj11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str;
        
        while((str = br.readLine()) != null) {	// ���ڿ� �Է�
        	bw.write(str + "\n");	// ���
        	bw.flush();
        }
        
        bw.close();
    }
}
