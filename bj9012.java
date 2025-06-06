import java.io.*;
import java.util.*;

public class bj9012 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=0;i<n;i++) {
        	Stack<String> stack = new Stack<>();
        	String str = sc.next();
        	
        	boolean isValid = true;

            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '(') {
                    stack.push(String.valueOf(c));
                } else if(c == ')') {
                    if(stack.isEmpty()) {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(!stack.isEmpty()) {
            	isValid = false;
            }

            System.out.println(isValid ? "YES" : "NO");
        }
    }
}
