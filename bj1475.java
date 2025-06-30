import java.io.*;
import java.util.*;

public class bj1475 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String num = br.readLine();	// �� ��ȣ

        int[] arr = new int[10];	// 0���� 9���� �� ������ ������ �����ϴ� �迭
        for(int i=0;i<num.length();i++) {
            char c = num.charAt(i);	// �� ��ȣ�� �� ���� Ȯ��
            arr[c - '0']++;	// �ش� ������ ���� ����
        }

        int count = arr[6] + arr[9];	// ���� 6�� 9�� �� ����
        arr[6] = arr[9] = 0;	// �ߺ� ��� ����

        int max = (count + 1) / 2;	// 6�� 9�� �ջ��� �ʿ��� ��Ʈ �� (�ø� ó��)
        for(int i=0;i<arr.length;i++) {
            if(i == 6 || i == 9) {	// �̹� ��������� �ǳʶ�
                continue;
            }
            if(arr[i] > max) {	// ������ ���� �� �� ���� ������ ������ ����
                max = arr[i];
            }
        }

        bw.write(String.valueOf(max));	// �ʿ��� ��Ʈ�� �ּڰ� ���

        
        bw.flush();
        bw.close();
    }
}
