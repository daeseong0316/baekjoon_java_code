import java.io.*;
import java.util.*;

public class bj11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();	// �ܾ�
        
        String[] misa = new String[s.length()];	// ���̻縦 ������ ����
        
        for(int i=0;i<misa.length;i++) {
        	misa[i] = s.substring(i);	// s�� ���ϴ� ��ġ ��ŭ �߶� misa�� �����Ѵ�.
        }
        
        Arrays.sort(misa);	// ���̻縦 ���������� ����
        
        for(int i=0;i<misa.length;i++) {
        	bw.write(misa[i] + "\n");	// ���
        }
        
        bw.flush();
        bw.close();
    }
}
