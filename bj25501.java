import java.io.*;
import java.util.*;

public class bj25501 {
	static int Rcount;
	
	public static int recursion(String s, int l, int r){
        if(l >= r) {
        	return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
        	return 0;
        }
        else {
        	Rcount++;
        	return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s) {	//  어떤 문자열이 팰린드롬인지 여부를 판단하는 함수
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());	// 테스트 개수
        
        for(int i=0;i<t;i++) {
        	String str = br.readLine();	// 문자열 입력
        	
        	Rcount = 1;	// 개수의 초기값
        	
        	System.out.print(isPalindrome(str) + " ");	// isPalindrome의 반환값
        	System.out.println(Rcount);	// recursion 호출 횟수
        }
        
        bw.flush();
        bw.close();
    }
}
