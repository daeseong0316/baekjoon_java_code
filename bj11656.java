import java.io.*;
import java.util.*;

public class bj11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();	// 단어
        
        String[] misa = new String[s.length()];	// 접미사를 저장할 공간
        
        for(int i=0;i<misa.length;i++) {
        	misa[i] = s.substring(i);	// s를 원하는 위치 만큼 잘라서 misa에 저장한다.
        }
        
        Arrays.sort(misa);	// 접미사를 사전순으로 정렬
        
        for(int i=0;i<misa.length;i++) {
        	bw.write(misa[i] + "\n");	// 출력
        }
        
        bw.flush();
        bw.close();
    }
}
