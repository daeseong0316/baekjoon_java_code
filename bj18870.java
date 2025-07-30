import java.io.*;
import java.util.*;

public class bj18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n���� ��ǥ
        
        int[] arr = new int[n];	// ���� �� ����� ���� ��ġ�� ������ �迭
        Set<Integer> set = new HashSet<>();	// �ߺ��� ������ set ��ü
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	int x = Integer.parseInt(st.nextToken());	// ��ǥ
        	arr[i] = x;	
        	set.add(x);
        }
        
        List<Integer> list = new ArrayList<>(set);	// ������ ���� set ������ list�� ����
        Collections.sort(list);	// ����
        
        Map<Integer, Integer> rank = new HashMap<>();	// ���� �ű�� ���� map ��ü
        for(int i=0;i<list.size();i++) {
        	rank.put(list.get(i), i);	// ���� �ű��
        }
        
        int[] result = new int[n];	// ������ ������ result �迭
        for(int i=0;i<arr.length;i++) {
        	if(rank.containsKey(arr[i])) {	// ������ ������ �°� ����
        		result[i] = rank.get(arr[i]);
        	}
        }
        
        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");	// ���
        }
        
        bw.flush();
        bw.close();
    }
}
