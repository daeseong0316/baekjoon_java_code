import java.io.*;
import java.util.*;

public class bj10867 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n개의 정수
        
        Set<Integer> set = new HashSet<>();	//set은 중복은 허용하지 않음
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {        	
        	int num = Integer.parseInt(st.nextToken());	// 정수 입력
        	set.add(num);	// set에 정수 넣기
        }
        List<Integer> list = new ArrayList<>(set);	// 정렬을 사용하기 위해 list에 set 내용물 넣기
        Collections.sort(list);	// 정렬
        
        for(int i: list) {
        	bw.write(i + " ");	// 출력
        }
        
        
        bw.flush();
        bw.close();
    }
}
