import java.io.*;
import java.util.*;

public class bj1541 { 
	public static int sum(String str) {
        String[] plusSplit = str.split("\\+");
        int sum = 0;
        for (String num : plusSplit) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();	// 식 입력 받기
        
        String[] minusSplit = input.split("-");	// 식을 -를 기준으로 구별한다
        int result = 0;	// 결과 값 0으로 초기화

        // 첫 번째 그룹은 더해서 시작
        result += sum(minusSplit[0]);

        // 이후 그룹은 모두 빼기
        for (int i = 1; i < minusSplit.length; i++) {
            result -= sum(minusSplit[i]);
        }

        System.out.println(result);	// 결과 출력
        
        bw.flush();
        bw.close();
    }
}
