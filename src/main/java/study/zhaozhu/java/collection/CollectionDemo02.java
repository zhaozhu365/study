package study.zhaozhu.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo02 {

	public static void main(String[] args) {

		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

		// 编译不通过
		// 因为Arrays.asList里只有powder类型,
		// List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

		List<Snow> snow3 = new ArrayList<>();
		Collections.addAll(snow3, new Light(), new Heavy());

		List<Snow> snow4 = Arrays.<Snow> asList(new Light(), new Heavy());
		
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));

	}

}

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}
