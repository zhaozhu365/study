package study.zhaozhu.java.T;

public class GenericsDemo02 {

	public static void main(String[] args) {

		NotePad<String, Integer> np = new NotePad<String, Integer>();
		np.setKey("汤姆");
		np.setValue(20);
		System.out.println(np);
	}

}

class NotePad<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "NotePad [key=" + key + ", value=" + value + "]";
	}

}
