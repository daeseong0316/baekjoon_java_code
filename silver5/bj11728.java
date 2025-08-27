import java.io.*;
import java.util.*;

public class bj11728 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);	// 첫 번째 배열 사이즈
        int m = Integer.parseInt(str[1]);	// 두 번째 배열 사이즈
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) {
        	arr1[i] = Integer.parseInt(st.nextToken());	// 첫 번째 배열 값 입력
        }
        
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++) {
        	arr2[i] = Integer.parseInt(st.nextToken());	// 두 번째 배열 값 입력
        }
        
        List<Integer> list = new ArrayList<>();	// 두 배열을 담을 list 생성
        for(int i: arr1) {
        	list.add(i);	// list에 1번 배열 값 넣기
        }
        for(int i: arr2) {
        	list.add(i);	// list에 2번 배열 값 넣기
        }
        
        Collections.sort(list);	// list 값 정렬
        
        for(int i: list) {
        	bw.write(i + " ");	// 출력
        }
        
        bw.flush();
        bw.close();
    }
}
