import java.io.*;
import java.util.*;

public class bj11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();		// 문자열 입력
        
        StringBuilder st = new StringBuilder();	// 바뀐 문자열을 담을 공간
        for(int i=0;i<str.length();i++) {	// 문자열의 처음부터 끝까지 순회
        	char c = str.charAt(i);	// 문자를 하나씩 꺼낸다
        	if (c >= 'a' && c <= 'z') {	// 소문자 계산
        	    st.append((char)('a' + (c - 'a' + 13) % 26));	// 13개씩 민다	
        	} else if (c >= 'A' && c <= 'Z') {	// 대문자 계산
        		st.append((char)('A' + (c - 'A' + 13) % 26));	// 13개씩 민다
        	} else {
        		st.append(c);	// 알파벳이 아니면 그대로 담는다
        	}
        }
        
        bw.write(st.toString());	// 바뀐 문자열 출력
        
        bw.flush();
        bw.close();
    }
}
