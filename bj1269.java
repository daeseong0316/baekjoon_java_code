import java.io.*;
import java.util.*;

public class bj1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);	// a����
        int b = Integer.parseInt(str[1]);	// b����
        
        Set<Integer> Aset = new HashSet<>();
        Set<Integer> Bset = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++) {
        	Aset.add(Integer.parseInt(st.nextToken()));	// A���տ� ���� �ֱ� 
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++) {
        	Bset.add(Integer.parseInt(st.nextToken()));	// B���տ� ���� �ֱ�
        }
        
        int result = AB(Aset, Bset) + BA(Aset, Bset);	// ���� �Է� �ޱ�
        
        bw.write(String.valueOf(result));	// ���
        
        bw.flush();
        bw.close();
    }
    public static int AB(Set<Integer> a, Set<Integer> b) {	// A-B ���
    	Set<Integer> diff = new HashSet<>(a);
    	diff.removeAll(b);
    	
    	return diff.size();
    }
    public static int BA(Set<Integer> a, Set<Integer> b) {	// B-A ���
    	Set<Integer> diff = new HashSet<>(b);
    	diff.removeAll(a);
    	
    	return diff.size();
    }
}
