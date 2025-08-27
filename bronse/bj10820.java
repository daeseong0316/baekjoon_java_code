import java.io.*;
import java.util.*;

public class bj10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str;
        
        while ((str = br.readLine()) != null) {	// EOF까지만 입력 받는다
        	int count1 = 0;	// 소문자
        	int count2 = 0;	// 대문자
        	int count3 = 0;	// 숫자
        	int count4 = 0;	// 공백
        	
        	for(int j=0;j<str.length();j++) {	// 문자열의 길이 만큼
        		char c = str.charAt(j);	// 문자 하나씩 확인
        		
        		if(c >= 'a' && c <= 'z') {	// 소문자 판별
        			count1++;
        		}
        		else if(c >= 'A' && c <= 'Z') {	// 대문자 판별
        			count2++;
        		}
        		else if(c >= '0' && c <= '9') {	// 숫자 판별
        			count3++;
        		}
        		else if(c == ' ') {	// 공백 판별
        			count4++;
        		}
        	}
        	bw.write(count1 + " " + count2 + " " + count3 + " " + count4 + "\n");	// 차례대로 출력
        }
        
        bw.flush();
        bw.close();
    }
}
