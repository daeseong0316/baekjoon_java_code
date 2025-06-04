import java.io.*;
import java.util.*;

public class bj11866 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Deque<Integer> que = new ArrayDeque<>();	// ����ť�� ���� ť
        List<Integer> list = new ArrayList<>();		// ����� ���� ����Ʈ
        
        for(int i=1;i<=n;i++) {		// ť �ȿ� 1~7������ ���� ���ʷ� �ֱ�
        	que.addLast(i);
        }
        
        while(!que.isEmpty()) {		// ť�� ������� ������ �ݺ�
        	for(int i=0;i<k-1;i++) {	
        		que.addLast(que.removeFirst());	// k��°�� �����ϱ� ���� �տ� 2���� �ڷ� ������ 
        	}
        	list.add(que.removeFirst());	// k��° ���� ����Ʈ�� �ִ´�
        }
        
        System.out.print("<");
        for(int i=0;i<list.size();i++) {
        	System.out.print(list.get(i));	// �似Ǫ���� �� ���ĵ� ����Ʈ�� ���
        	if(i != list.size()-1) {
        		System.out.print(", ");
        	}
        }
        System.out.println(">");
        System.out.println("hello");
    }
}
