import java.util.*;
import java.util.*;

public class bj11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
        	list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        int sum = 0, t = list.get(0);
        for(int i=0;i<n-1;i++) {
        	sum += t;
        	t += list.get(i+1);
        }
        int sum2 = 0;
        for(int i=0;i<n;i++) {
        	sum2 += list.get(i);
        }
        System.out.println(sum + sum2);
    }
}
