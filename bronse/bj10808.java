import java.io.*;
import java.util.*;

public class bj10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        int[] arr = new int[26];
        
        for(int i=0;i<str.length();i++) {
        	char c = str.charAt(i);
        	if(c >= 'a' && c <= 'z') {
        		arr[c-'a']++;
        	}
        }
        
        for(int i=0;i<arr.length;i++) {
        	bw.write(arr[i] + " ");
        }
        
        bw.flush();
        bw.close();
    }
}
