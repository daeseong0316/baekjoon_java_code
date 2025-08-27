import java.io.*;
import java.util.*;

public class bj1343 {
	public static String convert(int count) {	// X를 AAAA, BB로 변경하는 함수
		StringBuilder sb = new StringBuilder();
		
		int a = count / 4;	// AAAA가 들어갈 공간
		int b = (count % 4) / 2;	// BB가 들어갈 공간
		
		for(int i=0;i<a;i++) {
			sb.append("AAAA");	// AAAA로 변경
		}
		for(int i=0;i<b;i++) {
			sb.append("BB");	// BB로 변경
		}
		
		return sb.toString();	// 변경한 문자열을 반환
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();	// X와 .이 섞인 문자열 입력 받기
        
        StringBuilder sb = new StringBuilder();	// 변경 된 문자열을 저장할 클래스(수정과 저장에 효율적)
        
        int count = 0;	// X의 개수를 확인할 변수
        for(int i=0;i<str.length();i++) {	// 문자열 전체를 확인
        	char c = str.charAt(i);	// 문자 하나하나 확인
        	
        	if(c == 'X') {	// c가 X일 때
        		count++;	// 개수 증가
        	}
        	else {	// c가 .일 경우
        		if(count % 2 == 1) {	// .전까지의 X의 개수가 홀수일 경우
        			System.out.println("-1");	// 덮을 수 없으므로 -1 출력
        			return;
        		}
        		sb.append(convert(count));	// X를 AAAA, BB에 맞게 변경
        		sb.append('.');	// .추가
        		count = 0;	// X의 개수를 초기화
        	}
        }
        
        // 마지막 남은 X 검사
        if(count % 2 == 1) {		
        	System.out.println("-1");
        	return;
        }
        sb.append(convert(count));	
        
        System.out.println(sb.toString());	// 변경 된 문자열 출력
        
        bw.flush();
        bw.close();
    }
}
