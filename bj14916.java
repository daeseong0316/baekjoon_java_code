import java.io.*;
import java.util.*;

public class bj14916 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        int count = 0;	// �Ž��� �� ����
        while (num >= 0) {
            if(num % 5 == 0) {	// num�� 5�� ����̸� 5�� ������ ���� ���� ����
                count += num / 5;
                bw.write(String.valueOf(count));	// ���� ����ϰ� ��	
                break;
            }
            num -= 2;	// num�� 5�� ����� �ƴ϶�� 2�� ���� �ٽ� �ݺ����� �����Ѵ�
            count++;
        }
        
        if(num < 0) {	// num�� ������ �� (��: 1, 3 �� ��)
            bw.write("-1");
        }
        
        bw.flush();
        bw.close();
    }
}
