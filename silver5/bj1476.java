import java.io.*;
import java.util.*;

public class bj1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int e = Integer.parseInt(st.nextToken());	// 지구 1<= e <=15
        int s = Integer.parseInt(st.nextToken());	// 태양 1<= s <=28
        int m = Integer.parseInt(st.nextToken());	// 달  1<= m <=19
        
        // 초기 값
        int count = 1;
        int[] arr = {1, 1, 1};	
        
        while(true) {	// 원하는 범위에 도달 할 때까지 무한 반복 
        	if(arr[0] == e && arr[1] == s && arr[2] == m) {	// 원하는 값에 도달하면 멈춤
        		break;
        	}
        	
        	// 다 같이 한 번에 증가
        	arr[0]++;
        	arr[1]++;
        	arr[2]++;
        	// 년도 증가
        	count++;

        	if(arr[0] > 15) {	// 지구의 최대 범위
        		arr[0] = 1;
        	}
        	if(arr[1] > 28) {	// 태양의 최대 범위
        		arr[1] = 1;
        	}
        	if(arr[2] > 19) {	// 달의 최대 범위
        		arr[2] = 1;
        	}
        }
        
        bw.write(String.valueOf(count));	// 년도 출력
        
        bw.flush();
        bw.close();
    }
}
