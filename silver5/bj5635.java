import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {	// ?•™?ƒ?˜ ?ƒ?¼?— ?”°?¼ ? •? ¬?•˜?Š” ê°ì²´
	String name;	// ?´ë¦?
	int y, m, d;	// ?ƒ?¼
	
	public Student(String name, int d, int m, int y) {	// ?ƒ?„±?ž: ?´ë¦„ê³¼ ?ƒ?¼ ì´ˆê¸°?™”
		this.name = name;
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	public int compareTo(Student other) { 	// ?ƒ?¼?´ ë¹ ë¥¸ ?ˆœ?œ¼ë¡? ? •? ¬ ê¸°ì??
		 // ?—°?„ê°? ?‹¤ë¥´ë©´ ?—°?„ ê¸°ì??
        if (this.y != other.y) {
        	return this.y - other.y;
        }
        // ?—°?„ê°? ê°™ìœ¼ë©? ?›” ê¸°ì??
        if (this.m != other.m) {
        	return this.m - other.m;
        }
        // ?—°?„??? ?›”?´ ê°™ìœ¼ë©? ?¼ ê¸°ì??
        return this.d - other.d;
	}
}
public class bj5635 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ?•™?ƒ ?ˆ˜
        List<Student> list = new ArrayList<>();		// ?•™?ƒ ê°ì²´ë¥? ?‹´?„ list
        
        for(int i=0;i<n;i++) {
        	String[] input = br.readLine().split(" ");
            String name = input[0];					// ?´ë¦?
            int dd = Integer.parseInt(input[1]);	// ?¼
            int mm = Integer.parseInt(input[2]);	// ?›”
            int yy = Integer.parseInt(input[3]);	// ?…„
        	list.add(new Student(name,dd,mm,yy));	// list?— ê°ì²´ ì§??›
        }
        
        Collections.sort(list);	// ?ƒ?¼?„ ê¸°ì???œ¼ë¡? list ? •? ¬ (compareTo ê¸°ì??)
        
        bw.write(list.get(n-1).name + "\n");	// ê°??ž¥ ?‚˜?´ê°? ? ??? ?‚¬?žŒ (?ƒ?¼?´ ê°??ž¥ ?Š¦?Œ)
        bw.write(list.get(0).name);				// ê°??ž¥ ?‚˜?´ê°? ë§Žì?? ?‚¬?žŒ (?ƒ?¼?´ ê°??ž¥ ë¹ ë¦„)
        
        bw.flush();
        bw.close();
    }
}
