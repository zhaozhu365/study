/**   
* @Title: Main1.java 
* @author zhaozhu
* @date 2016年9月18日 下午4:17:41 
* @version V1.0   
*/
package study.zhaozhu.written_examination.aiqiyi;

import java.util.Arrays;

/** 
* @ClassName: Main1 
* @Description: TODO
* @author zhaozhu
* @date 2016年9月18日 下午4:17:41 
*  
*/
public class Main2 {
	
	public static void main(String[] args) {
		
//		int n = 60;
//		int[] a = new int[] { 5, 37, 40, 16, 30, 18 };
		int n = 100;
		int[] a = new int[] { 10, 57, 46, 32, 23, 44, 38, 78, 32, 57, 25 };
		Arrays.sort(a);
		for (int i = n; i > 0; i--) {
			if (find(i, a) > 0) {
				System.out.println(i);
				break;
			}
		}
	}
	
    public static int find(int total,int []a) {  
        if(a == null || a.length == 0) return 0;  
        //排序是为了在深搜时可以进行剪枝  
        java.util.Arrays.sort(a);  
        final int length = a.length;  
        int []resultArray = new int[length];  
        for(int i=0;i<length;i++) {  
            resultArray[i] = 0;  
        }  
        resultArray[0] = 1;  
        int count = 0;  
//      int t_count = 0;  
        int arrayLocationIndex = 1;//标识resultArray中有多少个位置不为0  
        int tempNumber = 1;//标志当前已经到了resultArray的哪个下标  
        while(true) {  
//          t_count++;if(t_count == 100) break;  
            if(resultArray[0] == length+1) break;//循环跳出条件  
            int temp = 0;  
            //for循环计算当前结果  
//          System.out.println(java.util.Arrays.toString(resultArray));  
            for(int i=0;i<resultArray.length;i++) {  
                if(resultArray[i] != 0) {  
                    temp += a[resultArray[i]-1];  
                }  
            }  
            if(temp == total) {//得到了一个符合条件的结果  
                count++;  
                //打印这个结果的内容  
                //System.out.println(java.util.Arrays.toString(resultArray));  
                for(int i=0;i<resultArray.length;i++) {  
                    if(resultArray[i] != 0) {  
                        //System.out.print(a[resultArray[i]-1]+" ");  
                    }  
                }  
                //System.out.println();  
                if(arrayLocationIndex == 1) {  
                    //这种情况下数组中只有一个元素，那么把它加1(a中的下标)  
                    resultArray[0]++;  
                }else {  
                    //把resultArray中最后一个不为0的置为0，同时把倒数第二个元素＋1  
                    resultArray[tempNumber] = 0;  
                    resultArray[arrayLocationIndex++]++;  
                    tempNumber = arrayLocationIndex;  
                }  
            }  
            if(temp < total) {  
//              System.out.println("temp < total arrayLocationIndex ["+arrayLocationIndex+"]tempNumber["+tempNumber+"]");  
//              System.out.println(java.util.Arrays.toString(resultArray));  
                if(tempNumber < length) {  
                    //继续添加下一个  
                    tempNumber++;  
                    resultArray[arrayLocationIndex] = tempNumber;  
                    arrayLocationIndex++;  
                }else {  
                    //已经到a的最后了，回退  
                    if(resultArray[arrayLocationIndex-1] == length) break;  
                    resultArray[arrayLocationIndex-1] = 0;  
                    resultArray[arrayLocationIndex-2]++;  
                    tempNumber = arrayLocationIndex;  
                }  
//              System.out.println(java.util.Arrays.toString(resultArray));  
            }  
            if(temp > total) {  
//              System.out.println("temp > total arrayLocationIndex ["+arrayLocationIndex+"]tempNumber["+tempNumber+"]");  
//              System.out.println(java.util.Arrays.toString(resultArray));  
                if(tempNumber == 1){  
//                  System.out.println("tempNumber == 1");  
                    break;  
                }  
                if(tempNumber == length) {  
                    //到a数组的最后了，回退  
                    resultArray[arrayLocationIndex-2]++;  
                    tempNumber = resultArray[arrayLocationIndex-2];  
                    resultArray[arrayLocationIndex-1]=0;  
                    arrayLocationIndex--;  
                }else {  
                    //类似于temp < total分支  
                    resultArray[arrayLocationIndex-1] = 0;  
                    resultArray[arrayLocationIndex-2]++;  
                    tempNumber = resultArray[arrayLocationIndex-2];  
                    arrayLocationIndex--;  
                }  
//              tempNumber = resultArray[arrayLocationIndex-1]+1;  
//              System.out.println(java.util.Arrays.toString(resultArray));  
            }  
        }  
        return count;
    }  
	
}
