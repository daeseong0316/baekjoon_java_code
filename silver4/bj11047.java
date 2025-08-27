import java.util.*;
import java.util.*;

public class bj11047 {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	int[] money = new int[n];
    	for(int i=0;i<n;i++) {
    		money[i] = sc.nextInt();
    	}
    	int count = 0;
    	while(m > 0) {
    		for(int i=money.length-1;i>=0;i--) {
    			if(m >= money[i]) {
    				int a = m / money[i];
    				m %= a * money[i];
    				count += a;
    			}
    		}
    	}
    	System.out.println(count);
    }
}
