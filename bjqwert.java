import java.io.*;
import java.util.*;

public class bjqwert {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ?��?��?�� 개수
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(",");	// ,�? 구분 ?�� ?��?�� 2�? ?��?��
        	int a = Integer.parseInt(str[0]);	// ?��?�� 1�?
        	int b = Integer.parseInt(str[1]);	// ?��?�� 2�?
        	
        	bw.write(a+b + "\n");	// ?��?�� 1�?+2�? 출력	
        }
        
        bw.flush();
        bw.close();
    }
}
