import java.io.*;
import java.util.*;

public class bj10815 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
        	set.add(sc.nextInt());
        }
        
        int m = sc.nextInt();
        for(int i=0;i<m;i++) {
        	int value = sc.nextInt();
        	
        	if(set.contains(value)) {
        		System.out.print(1 + " ");
        	}
        	else {
        		System.out.print(0 + " ");
        	}
        }
    }
}
