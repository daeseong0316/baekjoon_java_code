import java.io.*;
import java.util.*;

public class bj1439 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();	// 1과 0으로 된 문자열 입력
        char[] Carr = str.toCharArray();	// 하나씩 확인하기 위해 char형으로 바꿔 저장한다.
        
        int count0 = 0, count1 = 0;	// 1->0으로 바꿨을 때, 0->1로 바꿨을 때의 횟수 
        
        if(Carr[0] == '0') {	// 첫번째 그룹이 뭔지 확인
        	count0++;	
        }
        else {
        	count1++;	
        }
        
        for(int i=1;i<Carr.length;i++) {	// 문자 정체 순회
        	if(Carr[i] != Carr[i-1]) {	// 숫자가 바꿨을 경우
        		if(Carr[i] == '0') {
        			count0++;
        		}
        		else {
        			count1++;
        		}
        	}
        }
        
        int result = Math.min(count0, count1);	// 횟수가 더 적은 경우를 찾음
        
        bw.write(String.valueOf(result));	// 적은 횟수 출력
        
        bw.flush();
        bw.close();
    }
}
