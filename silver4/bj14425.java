import java.io.*;
import java.util.*;

public class bj14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);	// 집합 s1에 포함 되어 있는 문자열 수
        int m = Integer.parseInt(str[1]);	// 검사할 문자열 수
        
        Set<String> set = new HashSet<>();
        
        for(int i=0;i<n;i++) {
        	set.add(br.readLine());	// 집합 s1에 포함 되어 있는 문자열
        }

        int count = 0;	// 포함 된 총 개수
        
        for(int i=0;i<m;i++) {
        	if(set.contains(br.readLine())) {	// 포함 되어 있는지 확인
        		count++;
        	}
        }
        	
        bw.write(String.valueOf(count));	// 개수 출력
        
        bw.flush();
        bw.close();
    }
}
