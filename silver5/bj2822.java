import java.io.*;
import java.util.*;

public class bj2822 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int q = 8;	// 8문제를 푼다
        final int s = 5;	// 가장 높은 5개의 점수
        
        int[] arr = new int[q];
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<q;i++) {
        	int num = Integer.parseInt(br.readLine());
        	maxheap.offer(num);	// 바로 내림차순으로 정렬이 된다
        	arr[i] = num;	// 나중에 인덱스를 찾기 위한 배열
        }
        
        int sum = 0;	// 총 점수용 변수
        List<Integer> maxlist = new ArrayList<>();	// 점수 인덱스를 정렬하기 위한 리스트
        for(int i=0;i<s;i++) {
        	int max = maxheap.poll();	// 점수 중 가장 큰 점수를 꺼내고 지운다
        	sum += max;	// 가장 큰 점수 순서로 저장
        	for(int j=0;j<q;j++) {
        		if(max == arr[j]) {	// 점수의 인덱스 확인
        			maxlist.add(j+1);	// 실제 인덱스 저장
        			break;
        		}
        	}
        }
        
        Collections.sort(maxlist);	// 인덱스 정렬
        
        bw.write(sum + "\n");	// 총점 출력 
        
        for(int i: maxlist) {
        	bw.write(i + " ");	// 인덱스 출력
        }        
        
        bw.flush();
        bw.close();
    }
}
