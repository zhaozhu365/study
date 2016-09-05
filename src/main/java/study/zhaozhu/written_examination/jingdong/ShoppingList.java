package study.zhaozhu.written_examination.jingdong;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 京东2016秋招笔试题目1:题目见assets文件夹下的ShoppingList_1.png, ShoppingList_2.png
 * <p>
 * 考察排序算法 
 * <p>
 * 时间限制：3000ms
 * <p>
 * 内存限制：589824KB
 * <p>
 * 小B去购物，讲要买的东西列在一个购买清单上，每个物品单独列一行（即使要买多个某种物品）。
 * <p>
 * 小B到达商店后，由于来的太早，价签还没有贴到商品上。请根据这些价签，帮小B算出最好和最坏情况下所需的费用。
 * <p>
 * 
 * @author Administrator
 * 
 */
public class ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			Map<String, Integer> map = new TreeMap<String, Integer>();
			int[] price = new int[n];
			
			for (int i = 0; i < n; i++) {
				price[i] = scan.nextInt();
			}
			for (int i = 0; i < m; i++) {
				String name = scan.next();
				if (map.get(name) == null) {
					map.put(name, 1);
				} else {
					int count = map.get(name) + 1;
					map.put(name, count);
				}
			}

			int min = 0, max = 0;
			int nums = map.size();
			bubbleSort(price, price.length);

			int[] names = new int[nums];
			int index = 0;
			for (Entry<String, Integer> entry : map.entrySet()) {
				names[index] = entry.getValue();
				index++;
			}

			bubbleSort(names, nums);

			for (int i = 0; i < nums; i++) {
				max = max + names[nums - i - 1] * price[n - i - 1];
				min = min + names[nums - i - 1] * price[i];
			}

			System.out.println(min + " " + max);
		}

	}

	public static void bubbleSort(int a[], int n) {
		int j, k;
		int flag;

		flag = n;
		while (flag > 0) {
			k = flag;
			flag = 0;
			for (j = 1; j < k; j++) {
				if (a[j - 1] > a[j]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
					flag = j;
				}
			}
		}
	}

}
