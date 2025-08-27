import java.io.*;
import java.util.*;

public class bj11931 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n개의 정수
        
        List<Integer> list = new ArrayList<>();	// 정렬을 위해 list 구조 사용
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(br.readLine());	// 정수 입력
        	list.add(num);	// list에 넣기
        }
        
        Collections.sort(list);	// 정렬
        
        for(int i=list.size()-1;i>=0;i--) {
        	bw.write(list.get(i) + "\n");	// 정렬 된 list를 거꾸로 출력
        }
        
        bw.flush();
        bw.close();
    }
}
