import java.io.*;
import java.util.*;

public class bj2161 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n���� ī�� ��
        
        Queue<Integer> card = new ArrayDeque<>();	// ī�带 ������ que ��ü ����
        for(int i=0;i<n;i++) {
        	card.offer(i+1);	// 1������ n�������� ���ڸ� que�� ����
        }
        
        List<Integer> list = new ArrayList<>();	// ���� ī�带 ��¿� ����� list ��ü ����
        while(card.size() != 1) {	// ī�尡 1�常 ���� ������ ��� �ݺ�
        	list.add(card.poll());	// que���� ���� ���� �ִ� ī�带 ������ ���� ī�带 list�� ����
        	card.add(card.poll());	// �״��� que���� ���� ���� �ִ� ī�带 ������ ���� ī�带 que�� ���� �ڿ� ����
        }
        
        for(int i: list) {
        	bw.write(i + " ");	// list(���� ī�尡 ���� ��)�� ���ʷ� ���
        }
        bw.write(String.valueOf(card.peek()));	// ������ ī�� 1�� ���
        
        bw.flush();
        bw.close();
    }
}
