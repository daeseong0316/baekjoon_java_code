import java.io.*;
import java.util.*;

public class bj11866 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Deque<Integer> que = new ArrayDeque<>();	// 원형큐를 위한 큐
        List<Integer> list = new ArrayList<>();		// 출력을 위한 리스트
        
        for(int i=1;i<=n;i++) {		// 큐 안에 1~7까지의 수를 차례로 넣기
        	que.addLast(i);
        }
        
        while(!que.isEmpty()) {		// 큐가 비워있지 않을시 반복
        	for(int i=0;i<k-1;i++) {	
        		que.addLast(que.removeFirst());	// k번째를 제거하기 위해 앞에 2명을 뒤로 보낸다 
        	}
        	list.add(que.removeFirst());	// k번째 수를 리스트에 넣는다
        }
        
        System.out.print("<");
        for(int i=0;i<list.size();i++) {
        	System.out.print(list.get(i));	// 요세푸스로 잘 정렬된 리스트를 출력
        	if(i != list.size()-1) {
        		System.out.print(", ");
        	}
        }
        System.out.println(">");
        System.out.println("hello");
    }
}
