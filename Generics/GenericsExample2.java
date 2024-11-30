package Generics;

public class GenericsExample2 {
	public static void main(String[] args) {
		System.out.println(maxValue("Muthu","Rama","Krishnan"));
	}
	
	public static <T extends Comparable<T>> T maxValue(T x, T y, T z) {
		T max = x;
		
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}
