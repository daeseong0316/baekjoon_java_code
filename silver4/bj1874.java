import java.util.*;
import java.io.*;

public class bj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Stack<Integer> stack = new Stack<>(); 
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        int j = 1;
        for(int i=0;i<n;i++) {
        	int num = sc.nextInt();
        	
    		while(j <= num) {
    			stack.push(j++);
    			sb.append("+\n");
    		}	
			if(stack.peek() == num) {
				stack.pop();
				sb.append("-\n");
			}
			else {
				check = false;
				break;
			}		
        }
        if (check) {
        	System.out.print(sb.toString());
        } else {
        	System.out.println("NO");
        }
    }
}
