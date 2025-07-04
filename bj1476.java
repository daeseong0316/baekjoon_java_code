import java.io.*;
import java.util.*;

public class bj1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int e = Integer.parseInt(st.nextToken());	// ���� 1<= e <=15
        int s = Integer.parseInt(st.nextToken());	// �¾� 1<= s <=28
        int m = Integer.parseInt(st.nextToken());	// ��  1<= m <=19
        
        // �ʱ� ��
        int count = 1;
        int[] arr = {1, 1, 1};	
        
        while(true) {	// ���ϴ� ������ ���� �� ������ ���� �ݺ� 
        	if(arr[0] == e && arr[1] == s && arr[2] == m) {	// ���ϴ� ���� �����ϸ� ����
        		break;
        	}
        	
        	// �� ���� �� ���� ����
        	arr[0]++;
        	arr[1]++;
        	arr[2]++;
        	// �⵵ ����
        	count++;

        	if(arr[0] > 15) {	// ������ �ִ� ����
        		arr[0] = 1;
        	}
        	if(arr[1] > 28) {	// �¾��� �ִ� ����
        		arr[1] = 1;
        	}
        	if(arr[2] > 19) {	// ���� �ִ� ����
        		arr[2] = 1;
        	}
        }
        
        bw.write(String.valueOf(count));	// �⵵ ���
        
        bw.flush();
        bw.close();
    }
}
