package study.zhaozhu.written_examination.netease;

import java.util.Scanner;

public class wangyi1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			System.out.println(getNums(n));
			
		}
	}
	
	public static int getNums(int n){
		int sum = -1;
		int x=0;
		int y=0;
		int m = n/6;
		for (int i = 0; i <=m; i++) { 
			if((n-6*i)%8==0){
				y = (n-6*i)/8;
				x = i;
				sum =x+y;
				break;
			}		
		}	
		
		return sum;
	}
}
