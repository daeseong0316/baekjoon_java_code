import java.io.*;
import java.util.*;

public class bj10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 테스트 개수
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(",");	// ,로 구분 된 숫자 2개 입력
        	int a = Integer.parseInt(str[0]);	// 숫자 1번
        	int b = Integer.parseInt(str[1]);	// 숫자 2번
        	
        	bw.write(a+b + "\n");	// 숫자 1번+2번 출력	
        }
        
        bw.flush();
        bw.close();
    }
}
