import java.io.*;
import java.util.*;

public class bj11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();	// 문자열 입력
        
        StringBuilder sb = new StringBuilder(str);	// 문자열을 sb에 넣는다
        while(sb.length() > 0) {	// 남은 문자열이 없으면 그만
        	if(sb.length() >= 10) {	// 남은 문자열이 10개 이상이면
        		for(int i=0;i<10;i++) {	// 문자 10개 출력
        			bw.write(sb.charAt(0));	// 출력
        			sb.deleteCharAt(0);	// sb에서 삭제
        		}
        	}
        	else if(sb.length() < 10){	// 남은 문자열이 10개 미만이면
        		bw.write(sb.toString());	// 남은 문자열 전체 출력
        		sb.setLength(0);	// 삭제
        	}
        	bw.write("\n");	// 엔터
        }
        
        bw.flush();
        bw.close();
    }
}
