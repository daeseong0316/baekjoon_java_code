import java.io.*;
import java.util.*;

public class bj2161 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n개의 카드 수
        
        Queue<Integer> card = new ArrayDeque<>();	// 카드를 저장할 que 객체 생성
        for(int i=0;i<n;i++) {
        	card.offer(i+1);	// 1번부터 n번까지의 숫자를 que에 저장
        }
        
        List<Integer> list = new ArrayList<>();	// 버린 카드를 출력에 사용할 list 객체 생성
        while(card.size() != 1) {	// 카드가 1장만 남을 때까지 계속 반복
        	list.add(card.poll());	// que에서 제일 위에 있는 카드를 버리고 버린 카드를 list에 저장
        	card.add(card.poll());	// 그다음 que에서 제일 위에 있는 카드를 버리고 버린 카드를 que의 제일 뒤에 저장
        }
        
        for(int i: list) {
        	bw.write(i + " ");	// list(버린 카드가 모인 곳)를 차례로 출력
        }
        bw.write(String.valueOf(card.peek()));	// 마지막 카드 1장 출력
        
        bw.flush();
        bw.close();
    }
}
