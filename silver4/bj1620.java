import java.io.*;
import java.util.*;

public class bj1620 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" "); // 포켓몬 개수n, 문제 개수 m을 문자열로 입력 후 공백으로 나눔
        int n = Integer.parseInt(str[0]);	// 포켓몬의 개수
        int m = Integer.parseInt(str[1]);	// 문제 개수
        
        Map<String, Integer> map = new HashMap<>();		// 포켓몬 도감을 저장할 HashMap 
        String[] arr = new String[n+1];
        for(int i=0;i<n;i++) {
        	String name = br.readLine();	// 포켓몬 이름 입력
        	map.put(name, i+1);		// 이름 순서에 맞게 번호 저장
        	arr[i+1] = name;
        }
        for(int i=0;i<m;i++) {
        	String found = br.readLine();	// 찾을 포켓몬 이름 or 번호
	        
        	if(found.matches("\\d+")) {		// found가 숫자인지 문자인지 확인
        		int index = Integer.parseInt(found);	// 숫자라면 번호 확인
        		bw.write(arr[index]);	// 번호에 맞는 이름 출력
        	}
        	else {
        		bw.write(String.valueOf(map.get(found)));	// 이름에 맞는 번호 출력
        	}
        	bw.newLine();	// 엔터
        }
        
        bw.flush();
        bw.close();
    }
}
