import java.io.*;
import java.util.*;

public class bj2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); 	// n까지의 수
        int k = Integer.parseInt(st.nextToken());	// k번째 지워진 수 
        
        boolean[] removed = new boolean[n+1];	// 지움 판별
        int count = 0;	
        
        for(int p=2;p<=n;p++) {	// 2부터 n까지의 수에서
        	if(!removed[p]) {	// 아직 지우지 않았다면
        		for(int multiple=p;multiple<=n;multiple+=p) {
        			if(!removed[multiple]) {	// p의 배수 크기 순으로 지운다
        				removed[multiple] = true;	// 숫자 지움
        				count++;	// 개수 확인
        				
        				if(count == k) {	// 지운 개수가 같으면
        					bw.write(String.valueOf(multiple));	// k번재 지워진 수 출력
        					bw.flush();
        			        bw.close();
        			        return;
        				}
        			}
        		}
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
