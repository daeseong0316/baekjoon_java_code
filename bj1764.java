import java.io.*;
import java.util.*;

public class bj1764 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");	
        int n = Integer.parseInt(str[0]);	// 듣도 못한 사람 수
        int m = Integer.parseInt(str[1]);	// 보도 못한 사람 수
        
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n+m;i++) {
        	String name = br.readLine();
        	
        	map.put(name, map.getOrDefault(name, 0)+1);	// 같은 이름이 나온 경우 value 값 1증가
        }
        
        List<String> list = new ArrayList<>();	// 듣보잡인 사람을 넣을 리스트(정렬을 위해 리스트로 저장)
        for(Map.Entry<String, Integer> entry: map.entrySet()) {	
        		if(entry.getValue() == 2) {	// value 값이 2인 경우(듣도 못하고, 보도 못한 사람)
        			list.add(entry.getKey());	// 리스트에 듣보잡인 사람 이름 넣기
        		}
        }
        
        Collections.sort(list);	// 사전순으로 정렬
        
        bw.write(list.size() + "\n");	// 사람 수
        for(int i=0;i<list.size();i++) {
        	bw.write(list.get(i) + "\n");	// 사전 순으로 이름 출력
        }
        
        bw.flush();
        bw.close();
    }
}
