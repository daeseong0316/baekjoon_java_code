import java.io.*;
import java.util.*;

public class bj2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str;
        
        while((str = br.readLine()) != null) {	// 문자열 입력
        	String[] s = str.split(" ");	// 띄어쓰기로 문자열 분리
        	
        	int sum = 0;	
        	for(int i=0;i<s.length;i++) {
        		sum += Integer.parseInt(s[i]);	// 등의 총 합 
        	}
        	
        	if(sum == 0) {	// 등 0개
        		bw.write("D\n");	// 윷
        	}
        	else if(sum == 3) {	// 등 3개
        		bw.write("A\n");	// 도
        	}
        	else if(sum == 2) {	// 등 2개
        		bw.write("B\n");	// 개 
        	}
        	else if(sum == 1) {	// 등 1개
        		bw.write("C\n");	// 걸
        	}
        	else if(sum == 4) {	// 등 4개
        		bw.write("E\n");	// 모
        	}
        	
        	bw.flush();
        }
        
        bw.close();
    }
}
