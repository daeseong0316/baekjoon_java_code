import java.io.*;
import java.util.*;

public class bj1475 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String num = br.readLine();	// 방 번호

        int[] arr = new int[10];	// 0부터 9까지 각 숫자의 개수를 저장하는 배열
        for(int i=0;i<num.length();i++) {
            char c = num.charAt(i);	// 방 번호의 각 문자 확인
            arr[c - '0']++;	// 해당 숫자의 개수 증가
        }

        int count = arr[6] + arr[9];	// 숫자 6과 9의 총 개수
        arr[6] = arr[9] = 0;	// 중복 계산 방지

        int max = (count + 1) / 2;	// 6과 9를 합산해 필요한 세트 수 (올림 처리)
        for(int i=0;i<arr.length;i++) {
            if(i == 6 || i == 9) {	// 이미 계산했으니 건너뜀
                continue;
            }
            if(arr[i] > max) {	// 나머지 숫자 중 더 많은 개수가 있으면 갱신
                max = arr[i];
            }
        }

        bw.write(String.valueOf(max));	// 필요한 세트의 최솟값 출력

        
        bw.flush();
        bw.close();
    }
}
