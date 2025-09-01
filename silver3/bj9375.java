import java.io.*;
import java.util.*;

public class bj9375 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int t = Integer.parseInt(br.readLine());	// 테스트 개수
        
        for(int i=0;i<t;i++) {
        	int n = Integer.parseInt(br.readLine());	// 의상의 수
        	
        	int result = 1;
        	Map<String, Integer> map = new HashMap<>();		// 의상의 개수를 저장할 map
        	for(int j=0;j<n;j++) {
        		String[] str = br.readLine().split(" ");
        		String name = str[0];	// 의상의 이름
        		String dress = str[1];	// 의상의 종류
        		
        		// 같은 이름을 가진 의상은 없다
        		map.put(dress, map.getOrDefault(dress, 0)+1);	// 의상의 종류 개수 저장
        	}
        	for(int count: map.values()) {	// 의상의 개수를 순환
        		result *= (count + 1);	// 경우의 수 계산
        	}
        	result -= 1;	// 아무것도 입지 않은 경우
        	
        	bw.write(String.valueOf(result) + "\n");	// 정답 출력
        }
         
        bw.flush();
        bw.close();
    }
}
