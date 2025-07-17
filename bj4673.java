import java.io.*;
import java.util.*;

public class bj4673 {
	public static int d(int n) {	// 생성자를 구하는 함수
		int sum = n;	// 먼저 자신의 수를 더한다
		while(n > 0) { 
			sum += n % 10;	// 각 자리의 수를 더한다
			n /= 10;
		}
		return sum;	// 생성자를 반환한다
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean[] check = new boolean[10001];	// 생성자인 것과 셀프 넘버인 것을 확인하는 boolean 객체 
        
        for(int i=1;i<=10000;i++) {
        	int n = d(i);
        	if(n <= 10000) {
        		check[n] = true;	// 생성자는 true로 바꾼다
        	}
        }
        
        for(int i=1;i<=10000;i++) {
        	if(!check[i]) {	// true가 아닌 수를 출력한다.(셀프 넘버인 수만 출력한다)
        		bw.write(i + "\n");
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
