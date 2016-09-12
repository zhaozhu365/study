package study.zhaozhu.written_examination.safe360;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Safe1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
			String[] s = scan.nextLine().split(" ");
			int t =Integer.parseInt(s[0]);
			int Maxmem = Integer.parseInt(s[1]);
			boolean[] flags = new boolean[t];
			init(flags);
			
			
			
			List<handle> handle_list = new ArrayList<>();
		}
	}
	static void init(boolean[] flags){
		for(int i = 0;i<flags.length;i++){
			flags[i] = false;
		}
	}
	
	public static int  newfac(int n,int k){
		
	}
	
	public static boolean del(List<handle> handle_list,int k){
		
		if(handle_list.get(k).flags){
			for(int i = ){
				
			}
		}
	}
	
	
	class handle{
		int k;
		int index_start;
		int index_end;
		boolean flags = false;
		
	}
	
}
