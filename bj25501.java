import java.io.*;
import java.util.*;

public class bj25501 {
	static int Rcount;
	
	public static int recursion(String s, int l, int r){
        if(l >= r) {
        	return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
        	return 0;
        }
        else {
        	Rcount++;
        	return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s) {	//  � ���ڿ��� �Ӹ�������� ���θ� �Ǵ��ϴ� �Լ�
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());	// �׽�Ʈ ����
        
        for(int i=0;i<t;i++) {
        	String str = br.readLine();	// ���ڿ� �Է�
        	
        	Rcount = 1;	// ������ �ʱⰪ
        	
        	System.out.print(isPalindrome(str) + " ");	// isPalindrome�� ��ȯ��
        	System.out.println(Rcount);	// recursion ȣ�� Ƚ��
        }
        
        bw.flush();
        bw.close();
    }
}
