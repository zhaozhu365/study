package study.zhaozhu.written_examination.didi;

import java.util.Scanner;

/**
 * 滴滴2016秋招笔试:题目见assets/didi/
 * <p>
 * 求数组的连续子数组之和的最大值
 * <p>
 * http://blog.csdn.net/witsmakemen/article/details/8847211
 * <p>
 * http://www.cnblogs.com/en-heng/p/3970231.html
 * 
 * <p>
 * 注意数组的越界问题
 * 
 * @author Administrator
 * 
 */
public class SumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 7,-1, 2, 1, 3, -2};
		 System.out.println(sumN(arr));
		 System.out.println(sumN2(arr));

//		Scanner scan = new Scanner(System.in);
//		while (scan.hasNext()) {
//			int n = scan.nextInt();
//			// 注意要对n做特殊处理,否则在new
//			// int[n]的时候会报错，java.lang.ArrayIndexOutOfBoundsException: -1
//			// 数组初始化的大小必须是n>=1，所以当n<1的时候，都要跳过
//			if (n <= 0) {
//				continue;
//			}
//
//			int[] array = new int[n];
//			for (int i = 0; i < n; i++) {
//				array[i] = scan.nextInt();
//			}
//			System.out.println(sumN(array));
//
//		}

	}
	
	/**
	 * 3层循环的暴力方法
	 * @param array
	 * @return
	 */
	public static int sumN3(int [] array){
		return 0;
    }  
	
	/**
	 * 2层循环的暴力破解法
	 * @param array
	 * @return
	 */
	public static int sumN2(int [] array){  
        int sum=0,maxSum=Integer.MIN_VALUE;  
        int n=array.length;  
        int count=0;  
        for(int i=0;i<n;i++){  
            sum=0;  
            for(int j=i;j<n;j++){  
                sum+=array[j];  
                if(sum>maxSum){  
                    maxSum=sum;  
                }  
                count++;  
            }  
        }  
        System.out.println("length="+n+"||count="+count);  
        return maxSum;  
    }  
	
	/**
	 * 线性时间复杂度的方法
	 * 注意要对n=1做特殊处理
	 * 
	 * @param array
	 * @return
	 */
	public static int sumN(int[] array) {
		if (array.length == 1) {
			return array[0];
		}
		int n = array.length;
		int all = array[n - 1], start = array[n - 1];
		// int count = 0;
		for (int i = n - 2; i >= 0; i--) {
			if ((start + array[i]) > array[i]) {
				start = start + array[i];
			} else {
				start = array[i];
			}
			if (all < start) {
				all = start;
			}
			// count++;
		}
		// System.out.println("数组长度="+array.length+"||时间复杂度="+count);
		return all;
	}

}
