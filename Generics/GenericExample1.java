package Generics;

public class GenericExample1 {
	public static void main(String[] args) {
		String[] strings = {"hello", "everyone", "this", "is", "muthuramakrishnan"};
		printArray(strings);
		
		Integer[] integers = {1, 2, 3, 4};
		printArray(integers);
	}
	
	public static <E> void printArray(E[] arr) {
		for(E arrItem : arr) {
			System.out.println(arrItem);
		}
	}
}
