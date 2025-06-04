import java.io.*;
import java.util.*;

public class bj7568 { 
	public static class Person {
		int weight;
	    int height;
	    
	    public Person(int a, int b) {
	    	 weight = a;
	    	 height = b;
	    }
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        System.out.println();
        List<Person> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
        	int kg = sc.nextInt();
        	int cm = sc.nextInt();
        	
        	list.add(new Person(kg, cm));
        }
        int[] ranks = new int[n];
        Arrays.fill(ranks, 1); 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (list.get(j).weight > list.get(i).weight &&
                    list.get(j).height > list.get(i).height) {
                    ranks[i]++;
                }
            }
        }

        for (int r : ranks) {
            System.out.print(r + " ");
        }
    }
}