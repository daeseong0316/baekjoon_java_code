import java.io.*;
import java.util.*;

public class bj18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        
        int n = Integer.parseInt(br.readLine());	// n개의 좌표
        
        int[] arr = new int[n];	// 매핑 때 사용할 원래 위치를 저장한 배열
        Set<Integer> set = new HashSet<>();	// 중복을 제거할 set 객체
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	int x = Integer.parseInt(st.nextToken());	// 좌표
        	arr[i] = x;	
        	set.add(x);
        }
        
        List<Integer> list = new ArrayList<>(set);	// 정렬을 위해 set 값들을 list에 저장
        Collections.sort(list);	// 정렬
        
        Map<Integer, Integer> rank = new HashMap<>();	// 순위 매기기 위한 map 객체
        for(int i=0;i<list.size();i++) {
        	rank.put(list.get(i), i);	// 순위 매기기
        }
        
        int[] result = new int[n];	// 정답을 저장할 result 배열
        for(int i=0;i<arr.length;i++) {
        	if(rank.containsKey(arr[i])) {	// 값들의 순위에 맞게 매핑
        		result[i] = rank.get(arr[i]);
        	}
        }
        
        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");	// 출력
        }
        
        bw.flush();
        bw.close();
    }
}
