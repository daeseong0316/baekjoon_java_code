import java.io.*;
import java.util.*;

public class bj7785 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 출입 기록 수
        
        Map<String, String> map = new HashMap<>();	// 사원 이름, 출근 퇴근을 저장할 map 생성
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");	
        	String name = str[0];	// 사원 이름
        	String record = str[1];	// 출근 퇴근
        	
        	map.put(name, record);	// map에 저장
        }
        
        List<String> list = new ArrayList<>();	// 이름을 정렬하기 위해 list 생성
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();	// 컬랙션을 안전하게 순회하고 삭제 하기 위한 객체 생성
        while (iterator.hasNext()) {	// map 순회(다음 요소가 있는지 확인)
            Map.Entry<String, String> entry = iterator.next();	// 다음 요소 반환
            if (entry.getValue().equals("leave")) {	// 퇴근이 있을시(퇴근 여부 확인)
                iterator.remove();	// 해당 key 값 삭제
            } else {	
                list.add(entry.getKey());	// 아닌 key 값 list에 저장 
            }
        }
        
        Collections.sort(list);	// list 정렬
        
        for(int i=list.size()-1;i>=0;i--) {	// list 역순으로 출력
        	bw.write(list.get(i) + "\n");	// 사원 이름 출력
        }
        
        bw.flush();
        bw.close();
    }
}
