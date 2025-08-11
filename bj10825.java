import java.io.*;
import java.util.*;

public class bj10825 {
	static class Student {	// �л� ������ ���� ��ü 
		String name;
		int kor, eng, math;
		Student(String name, int kor, int eng, int math) {
			this.name = name;	// �̸�
			this.kor = kor;		// ���� ����
			this.eng = eng;		// ���� ����
			this.math = math;	// ���� ����
		}
		String getName() {
			return name;
		}
		int getKor() {
			return kor;
		}
		int getEng() {
			return eng;
		}
		int getMath() {
			return math;
		}
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// �л� n��
        
        Student[] arr = new Student[n];
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");
        	String name = str[0];	// �л� �̸�
        	int kor = Integer.parseInt(str[1]);		// ���� ����
        	int eng = Integer.parseInt(str[2]);		// ���� ����
        	int math = Integer.parseInt(str[3]);		// ���� ����
        	arr[i] = new Student(name, kor, eng, math);
        }
        
        Arrays.sort(arr, (a, b) -> {	// ���� ���
            if (a.kor != b.kor) return Integer.compare(b.kor, a.kor);      // ���� ��������
            if (a.eng != b.eng) return Integer.compare(a.eng, b.eng);      // ���� ��������
            if (a.math != b.math) return Integer.compare(b.math, a.math);  // ���� ��������
            return a.name.compareTo(b.name);                               // �̸� ������
        });
        
        StringBuilder sb = new StringBuilder();		// ����� ���� ����
        for(Student s: arr) {
        	sb.append(s.name).append('\n');	// ���ǿ� �°� �̸� �ֱ�
        }
        bw.write(sb.toString());	// ���
        
        bw.flush();
        bw.close();
    }
}	// ���� ���� ����: ����, ����: ����, ����: ����, ��� ������ ������ �̸��� ���� ������ �����ϴ� ������
