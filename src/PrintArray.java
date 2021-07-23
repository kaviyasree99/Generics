
public class PrintArray {
	public static void toPrint(Integer[] intArray) {
		for (int element : intArray) {
			System.out.printf("%s", element);
			
		}
		System.out.println();
	}
	public static void toPrint(Double[] inputArray) {
		for (Double element : inputArray) {
			System.out.printf("%s", element);
			
		}
		System.out.println();
	}
	
	public static void toPrint(Character[] inputArray) {
		for (char element : inputArray) {
			System.out.printf("%s", element);
			
		}
		System.out.println();
	}
	public static void main(String[] srgs) {
		Integer[] intArray = {1,2,3,4,5,6 };
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'h','e','l','l','o'};
		
		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);
	}
}
	
