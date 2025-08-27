import java.io.*;
import java.util.*;

public class bj10825 {
	static class Student {	// 학생 정보를 담을 객체 
		String name;
		int kor, eng, math;
		Student(String name, int kor, int eng, int math) {
			this.name = name;	// 이름
			this.kor = kor;		// 국어 성적
			this.eng = eng;		// 영어 성적
			this.math = math;	// 수학 성적
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
        
        int n = Integer.parseInt(br.readLine());	// 학생 n명
        
        Student[] arr = new Student[n];
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");
        	String name = str[0];	// 학생 이름
        	int kor = Integer.parseInt(str[1]);		// 국어 점수
        	int eng = Integer.parseInt(str[2]);		// 영어 점수
        	int math = Integer.parseInt(str[3]);		// 수학 점수
        	arr[i] = new Student(name, kor, eng, math);
        }
        
        Arrays.sort(arr, (a, b) -> {	// 정렬 방법
            if (a.kor != b.kor) return Integer.compare(b.kor, a.kor);      // 국어 내림차순
            if (a.eng != b.eng) return Integer.compare(a.eng, b.eng);      // 영어 오름차순
            if (a.math != b.math) return Integer.compare(b.math, a.math);  // 수학 내림차순
            return a.name.compareTo(b.name);                               // 이름 사전순
        });
        
        StringBuilder sb = new StringBuilder();		// 출력을 담을 공간
        for(Student s: arr) {
        	sb.append(s.name).append('\n');	// 조건에 맞게 이름 넣기
        }
        bw.write(sb.toString());	// 출력
        
        bw.flush();
        bw.close();
    }
}	// 정렬 기준 국어: 감소, 영어: 증가, 수학: 감소, 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로
