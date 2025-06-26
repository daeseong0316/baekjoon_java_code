import java.io.*;
import java.util.*;

public class bj1541 {
	public static int sum(String str) {
        String[] plusSplit = str.split("\\+");
        int sum = 0;
        for (String num : plusSplit) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();	// �� �Է� �ޱ�
        
        String[] minusSplit = input.split("-");	// ���� -�� �������� �����Ѵ�
        int result = 0;	// ��� �� 0���� �ʱ�ȭ

        // ù ��° �׷��� ���ؼ� ����
        result += sum(minusSplit[0]);

        // ���� �׷��� ��� ����
        for (int i = 1; i < minusSplit.length; i++) {
            result -= sum(minusSplit[i]);
        }

        System.out.println(result);	// ��� ���
        
        bw.flush();
        bw.close();
    }
}
