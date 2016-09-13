/**   
* @Title: UnsortedBinarySearch.java 
* @author zhaozhu
* @date 2016年9月13日 下午5:26:34 
* @version V1.0   
*/
package study.zhaozhu.algorithm.search;

/** 
* @ClassName: UnsortedBinarySearch 
* @Description: TODO
* @author zhaozhu
* @date 2016年9月13日 下午5:26:34 
*  
*/
public class UnsortedBinarySearch2 {

	public static int quickSortOneTime(int[] a, int i, int j)//一趟快速排序  
    {  
        int high,low,key;  
        high = j;  
        low = i;  
        key = a[low];  
        while(low < high)  
        {  
            while(key <= a[high] && low < high)  
            {  
                high--;  
            }  
          
        if( low < high)  
        {  
            a[low] = a[high];  
            low++;  
        }  
        while(key >= a[low] && low < high)  
        {                 
             low++;  
        }  
         if( low < high)  
         {  
             a[high] = a[low];  
             high--;   
         }    
    }  
    a[high] = key;  
    return high;  
      
    }  
  
   
   public static void twoDepart(int[] a,int i,int j, int values)  
    {  
        int mid = quickSortOneTime(a,i,j);  
        System.out.println("mid = " + mid + " i = "+i+" j = " + j);  
        System.out.println(i < j);  
        if(i < j)  
        {  
            if(a[mid] == values)  
            {   System.out.println("ok, keyword is at " +mid );  
  
            }  
            else if(a[mid] < values )  
            {  
                i = mid +1;  
                twoDepart(a,i,j,values);  
            }  
            else if(a[mid] > values)  
            {  
                j = mid -1;  
                twoDepart(a,i,j,values);  
            }  
        }  
        else if(i==j && a[mid] != values )  
        {  
            System.out.println("It doesn't exists");  
        }  
        else System.out.println("Finalily we find the keyword is at   " + mid );  
  
    }  
  
    public  static void main(String[] args)  
    {  
        int[] a = new int[] {1,4,9,3,24,21,6,9,9,7,6,5,3};  
        int values = 4;  
        twoDepart(a,0,a.length-1,values);  
    }  

}
