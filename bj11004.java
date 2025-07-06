import java.io.*;
import java.util.*;

public class bj11004 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());	// 숫자 n개
        int k = Integer.parseInt(st.nextToken());	// 찾는 인덱스 위치
        
        List<Integer> list = new ArrayList<>();	// 숫자를 저장할 list객체 생성
        st = new StringTokenizer(br.readLine());	// StringToken을 다시 사용하기 위해 초기화
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(st.nextToken());	// 숫자 입력
        	list.add(num);	// list에 저장
        }
        
        Collections.sort(list);	// list 정렬
        
        bw.write(list.get(k-1) + "\n");	// 원하는 인덱스 출력
        
        bw.flush();
        bw.close();
    }
}
