import java.io.*;
import java.util.*;

public class bj2669 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int n = 4;	// n개의 직사각형
        
        int count = 0;	// 중복 없이 차지하는 면적
        boolean[][] arr = new boolean[101][101];	// 평면의 크기(x,y 좌표의 최대 크기는 100이다)
        for(int i=0;i<n;i++) {
        	String[] xy = br.readLine().split(" ");
        	// (x1,y1)(x2,y2) 크기의 직사각형
        	int x1 = Integer.parseInt(xy[0]);	
        	int y1 = Integer.parseInt(xy[1]);
        	int x2 = Integer.parseInt(xy[2]);
        	int y2 = Integer.parseInt(xy[3]);
        	
        	for(int j=x1;j<x2;j++) {	// x1에서 x2까지의 밑면
        		for(int k=y1;k<y2;k++) {	// y1에서 y2까지의 높이
        			if(!arr[j][k]) {	// j,k를 확인하지 않았으면
        				arr[j][k] = true;	// 확인 했다고 표시
        				count++;	// 차지하는 면적 1증가
        			}
        		}
        	}
        }
        
        bw.write(String.valueOf(count));	// 차지하는 면적 개수 출력
        
        bw.flush();
        bw.close();
    }
}
