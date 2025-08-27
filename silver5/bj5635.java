import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {	// ?��?��?�� ?��?��?�� ?��?�� ?��?��?��?�� 객체
	String name;	// ?���?
	int y, m, d;	// ?��?��
	
	public Student(String name, int d, int m, int y) {	// ?��?��?��: ?��름과 ?��?�� 초기?��
		this.name = name;
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	public int compareTo(Student other) { 	// ?��?��?�� 빠른 ?��?���? ?��?�� 기�??
		 // ?��?���? ?��르면 ?��?�� 기�??
        if (this.y != other.y) {
        	return this.y - other.y;
        }
        // ?��?���? 같으�? ?�� 기�??
        if (this.m != other.m) {
        	return this.m - other.m;
        }
        // ?��?��??? ?��?�� 같으�? ?�� 기�??
        return this.d - other.d;
	}
}
public class bj5635 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ?��?�� ?��
        List<Student> list = new ArrayList<>();		// ?��?�� 객체�? ?��?�� list
        
        for(int i=0;i<n;i++) {
        	String[] input = br.readLine().split(" ");
            String name = input[0];					// ?���?
            int dd = Integer.parseInt(input[1]);	// ?��
            int mm = Integer.parseInt(input[2]);	// ?��
            int yy = Integer.parseInt(input[3]);	// ?��
        	list.add(new Student(name,dd,mm,yy));	// list?�� 객체 �??��
        }
        
        Collections.sort(list);	// ?��?��?�� 기�???���? list ?��?�� (compareTo 기�??)
        
        bw.write(list.get(n-1).name + "\n");	// �??�� ?��?���? ?��??? ?��?�� (?��?��?�� �??�� ?��?��)
        bw.write(list.get(0).name);				// �??�� ?��?���? 많�?? ?��?�� (?��?��?�� �??�� 빠름)
        
        bw.flush();
        bw.close();
    }
}
