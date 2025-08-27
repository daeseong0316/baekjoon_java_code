import java.io.*;
import java.util.*;

public class bj14916 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        int count = 0;	// 거스름 돈 개수
        while (num >= 0) {
            if(num % 5 == 0) {	// num이 5의 배수이면 5로 나누는 것이 제일 적다
                count += num / 5;
                bw.write(String.valueOf(count));	// 개수 출력하고 끝	
                break;
            }
            num -= 2;	// num이 5의 배수가 아니라면 2를 빼고 다시 반복문을 실행한다
            count++;
        }
        
        if(num < 0) {	// num이 음수일 때 (예: 1, 3 일 때)
            bw.write("-1");
        }
        
        bw.flush();
        bw.close();
    }
}
