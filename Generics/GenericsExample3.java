package Generics;

import java.util.List;

public class GenericsExample3 {
	public static void main(String[] args) {
		List<Integer> intList = List.of(new Integer[] { 1, 2, 3 });
		processElements(intList);

		List<Double> doubleList = List.of(new Double[] { 1.1, 2.2 });
		processElements(doubleList);
	}

	public static void processElements(List<? extends Number> list) {
		Number num = list.get(0);
		System.out.println(num);
	}
}
