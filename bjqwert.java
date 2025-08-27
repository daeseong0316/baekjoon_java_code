import java.io.*;
import java.util.*;

public class bjqwert {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ?…Œ?Š¤?Š¸ ê°œìˆ˜
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(",");	// ,ë¡? êµ¬ë¶„ ?œ ?ˆ«?ž 2ê°? ?ž…? ¥
        	int a = Integer.parseInt(str[0]);	// ?ˆ«?ž 1ë²?
        	int b = Integer.parseInt(str[1]);	// ?ˆ«?ž 2ë²?
        	
        	bw.write(a+b + "\n");	// ?ˆ«?ž 1ë²?+2ë²? ì¶œë ¥	
        }
        
        bw.flush();
        bw.close();
    }
}
