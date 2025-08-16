import java.io.*;
import java.util.*;

public class bj7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();	// 괄호로 이루어진 그릇 입력
        
        int result = 10;	// 처음엔 그릇이 1개 있음
        for(int i=0;i<str.length()-1;i++) {
    		char c = str.charAt(i);
    		char cc = str.charAt(i+1);
    		
    		if(c == cc) {	// 현재 그릇 모양과 다음 그릇 모양 비교
    			result += 5;	// 같은 모양이면 +5
    		}
    		else {	
    			result += 10;	// 다른 모양이면 +10
    		}
        }
        
        bw.write(String.valueOf(result));	// 총 높이 출력
        
        bw.flush();
        bw.close();
    }
}
