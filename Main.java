import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {	// �л��� ���Ͽ� ���� �����ϴ� ��ü
	String name;	// �̸�
	int y, m, d;	// ����
	
	public Student(String name, int d, int m, int y) {	// ������: �̸��� ���� �ʱ�ȭ
		this.name = name;
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	public int compareTo(Student other) { 	// ������ ���� ������ ���� ����
		 // ������ �ٸ��� ���� ����
        if (this.y != other.y) {
        	return this.y - other.y;
        }
        // ������ ������ �� ����
        if (this.m != other.m) {
        	return this.m - other.m;
        }
        // ������ ���� ������ �� ����
        return this.d - other.d;
	}
}
public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// �л� ��
        List<Student> list = new ArrayList<>();		// �л� ��ü�� ���� list
        
        for(int i=0;i<n;i++) {
        	String[] input = br.readLine().split(" ");
            String name = input[0];					// �̸�
            int dd = Integer.parseInt(input[1]);	// ��
            int mm = Integer.parseInt(input[2]);	// ��
            int yy = Integer.parseInt(input[3]);	// ��
        	list.add(new Student(name,dd,mm,yy));	// list�� ��ü ����
        }
        
        Collections.sort(list);	// ������ �������� list ���� (compareTo ����)
        
        bw.write(list.get(n-1).name + "\n");	// ���� ���̰� ���� ��� (������ ���� ����)
        bw.write(list.get(0).name);				// ���� ���̰� ���� ��� (������ ���� ����)
        
        bw.flush();
        bw.close();
    }
}
