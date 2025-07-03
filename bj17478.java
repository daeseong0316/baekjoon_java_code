import java.io.*;
import java.util.*;

public class bj17478 {
	public static void recursive(int depth, int n) {
		String indent = "____".repeat(depth);
		
		System.out.println(indent + "\"����Լ��� ������?\"");
		
		if(depth == n) {
			System.out.println(indent + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
		}
		else {
			System.out.println(indent + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			System.out.println(indent + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			System.out.println(indent + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			recursive(depth + 1, n);
		}
		
		System.out.println(indent + "��� �亯�Ͽ���.");
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ��� Ƚ��
        
        System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
        
        recursive(0, n);
        
        bw.flush();
        bw.close();
    }
}
