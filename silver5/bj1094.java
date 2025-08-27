import java.io.*;
import java.util.*;

public class bj1094 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 원하는 길이
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();	//  자동으로 가장 작은 값을 찾기 위한 최소 힙
        pq.add(64);	// 처음 막대기 길이 64를 heap에 넣음
        
        while(true) {	// 무한 반봇
        	int sum = 0;	// 모든 막대기의 총 합 변수
        	
        	for(int len: pq) {
        		sum += len;	// 모든 막대기의 총 합
        	}
        	
        	if(sum == n) {	
        		break;	// 모든 막대기의 총 합과 원하는 길이가 같으면 반복 멈춤
        	}
        	
        	int min = pq.poll();	// heap에서 가장 작은 값 꺼냄
        	min /= 2;	// 가장 작은 값을 절반으로 나눔
        	
        	pq.add(min);	// 
        	
        	sum = 0;
        	for(int len: pq) {
        		sum += len;
        	}
        	
        	if(sum < n) {
        		pq.add(min);
        	}
        }
        
        bw.write(String.valueOf(pq.size()));
        
        bw.flush();
        bw.close();
    }
}
