import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {	// 학생의 생일에 따라 정렬하는 객체
	String name;	// 이름
	int y, m, d;	// 생일
	
	public Student(String name, int d, int m, int y) {	// 생성자: 이름과 생일 초기화
		this.name = name;
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	public int compareTo(Student other) { 	// 생일이 빠른 순으로 정렬 기준
		 // 연도가 다르면 연도 기준
        if (this.y != other.y) {
        	return this.y - other.y;
        }
        // 연도가 같으면 월 기준
        if (this.m != other.m) {
        	return this.m - other.m;
        }
        // 연도와 월이 같으면 일 기준
        return this.d - other.d;
	}
}
public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 학생 수
        List<Student> list = new ArrayList<>();		// 학생 객체를 담을 list
        
        for(int i=0;i<n;i++) {
        	String[] input = br.readLine().split(" ");
            String name = input[0];					// 이름
            int dd = Integer.parseInt(input[1]);	// 일
            int mm = Integer.parseInt(input[2]);	// 월
            int yy = Integer.parseInt(input[3]);	// 년
        	list.add(new Student(name,dd,mm,yy));	// list에 객체 지원
        }
        
        Collections.sort(list);	// 생일을 기준으로 list 정렬 (compareTo 기준)
        
        bw.write(list.get(n-1).name + "\n");	// 가장 나이가 적은 사람 (생일이 가장 늦음)
        bw.write(list.get(0).name);				// 가장 나이가 많은 사람 (생일이 가장 빠름)
        
        bw.flush();
        bw.close();
    }
}
