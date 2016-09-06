package study.zhaozhu.written_examination.didi;

import java.util.ArrayList;
import java.util.List;

/**
 * 滴滴2016秋招笔试:题目见assets/didi/
 * <p>
 * 方案，先将所有大于最大桌子数的消费者去除，然后将两个数组排序，依次取值求和，然后递归
 * @author Administrator
 *
 */
public class SumMoney {
	public static void main(String[] args) {

		int n = 3, m = 5;
		int[] arrayN = { 2, 4, 2 };
		List<Consumer> list = new ArrayList<>();
		list.add(new Consumer(1, 3));
		list.add(new Consumer(3, 5));
		list.add(new Consumer(3, 7));
		list.add(new Consumer(5, 9));
		list.add(new Consumer(1, 10));
		
		
		
	}

}

class Consumer {
	int people;
	int value;

	public Consumer() {
	}

	public Consumer(int people, int value) {
		this.people = people;
		this.value = value;
	}
}