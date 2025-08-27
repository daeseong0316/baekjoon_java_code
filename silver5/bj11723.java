import java.io.*;
import java.util.*;

public class bj11723 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int m = Integer.parseInt(br.readLine());	//연산의 수
        
        Set<Integer> s = new HashSet<>();	// set객체를 이용한 s객체변수 생성
        for(int i=0;i<m;i++) {
        	String[] str = br.readLine().split(" ");	// str의 문자열을 공백을 기준으로 나눈다
        	String cmd = str[0];	// 배열의 0번째 문자열을 cmd에 지정
        	int n = 0;
        	if(str.length == 2) {	// 만약 str을 공백으로 나눴을 때 배열의 길이가 2칸인 경우
        		n = Integer.parseInt(str[1]);	// 배열의 1번째 문자열을 n에 지정
        	}
        	
        	switch(cmd) {	// cmd를 맞는 경우를 찾는다
        	case "add":		// s에 n값 넣기
        		s.add(n);
        		break;
        	case "remove":	// s에 n값 삭제
        		s.remove(n);
        		break;
        	case "check":	// s안에 n값이 있는지 확인 후 있으면 1출력 없으면 0 출력
        		if(s.contains(n)) {
        			bw.write("1\n");
        		}
        		else {
        			bw.write("0\n");
        		}
        		break;
        	case "toggle":	// s안에 n값이 있으면 삭제 없으면 n값 넣기
        		if(s.contains(n)) {
        			s.remove(n);
        		}
        		else {
        			s.add(n);
        		}
        		break;
        	case "all":		// s를 비우고 {1,2,3,4,...,20}으로 바꾸기
        		s.clear();
        		for(int j=1;j<=20;j++) {
        			s.add(j);
        		}
        		break;
        	case "empty":	// s를 비운다.
        		s.clear();
        		break;
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
