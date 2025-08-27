import java.io.*;
import java.util.*;

public class bj1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);	// a집합
        int b = Integer.parseInt(str[1]);	// b집합
        
        Set<Integer> Aset = new HashSet<>();
        Set<Integer> Bset = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++) {
        	Aset.add(Integer.parseInt(st.nextToken()));	// A집합에 원소 넣기 
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++) {
        	Bset.add(Integer.parseInt(st.nextToken()));	// B집합에 원소 넣기
        }
        
        int result = AB(Aset, Bset) + BA(Aset, Bset);	// 개수 입력 받기
        
        bw.write(String.valueOf(result));	// 출력
        
        bw.flush();
        bw.close();
    }
    public static int AB(Set<Integer> a, Set<Integer> b) {	// A-B 계산
    	Set<Integer> diff = new HashSet<>(a);
    	diff.removeAll(b);
    	
    	return diff.size();
    }
    public static int BA(Set<Integer> a, Set<Integer> b) {	// B-A 계산
    	Set<Integer> diff = new HashSet<>(b);
    	diff.removeAll(a);
    	
    	return diff.size();
    }
}
