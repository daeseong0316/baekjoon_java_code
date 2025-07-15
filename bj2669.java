import java.io.*;
import java.util.*;

public class bj2669 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int n = 4;	// n���� ���簢��
        
        int count = 0;	// �ߺ� ���� �����ϴ� ����
        boolean[][] arr = new boolean[101][101];	// ����� ũ��(x,y ��ǥ�� �ִ� ũ��� 100�̴�)
        for(int i=0;i<n;i++) {
        	String[] xy = br.readLine().split(" ");
        	// (x1,y1)(x2,y2) ũ���� ���簢��
        	int x1 = Integer.parseInt(xy[0]);	
        	int y1 = Integer.parseInt(xy[1]);
        	int x2 = Integer.parseInt(xy[2]);
        	int y2 = Integer.parseInt(xy[3]);
        	
        	for(int j=x1;j<x2;j++) {	// x1���� x2������ �ظ�
        		for(int k=y1;k<y2;k++) {	// y1���� y2������ ����
        			if(!arr[j][k]) {	// j,k�� Ȯ������ �ʾ�����
        				arr[j][k] = true;	// Ȯ�� �ߴٰ� ǥ��
        				count++;	// �����ϴ� ���� 1����
        			}
        		}
        	}
        }
        
        bw.write(String.valueOf(count));	// �����ϴ� ���� ���� ���
        
        bw.flush();
        bw.close();
    }
}
