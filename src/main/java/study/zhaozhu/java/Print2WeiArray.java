package study.zhaozhu.java;

public class Print2WeiArray {
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] arr1 = {{1,2,3,4,44},{5,6,7,8,88},{9,10,11,12,122},{13,14,15,16,166},{17,18,19,20,200}};
		printArr(arr);
		printArr(arr1);
	}
	
	static void printArr(int[][] arr){
		int n = arr.length;
		for (int i = 0; i <= n; i++) {
			if (i < n){
				for (int j=0; j <=i; j++) {
					int k = (n-1)-i;
					System.out.print(arr[j][j+k] + "  ");
				}
				System.out.println();
			}else {
				for (int ii = n-2; ii >= 0; ii--) {
					for (int jj=0; jj <=ii; jj++) {
						int kk = (n-1)-ii;
						System.out.print(arr[jj+kk][jj] + "  ");
					}
					System.out.println();
				}
			}
		}
	}
	
}
