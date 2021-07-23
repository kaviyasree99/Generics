
public class PrintArraySampleCode <T>{
	private T[] inputArray;
	
	public PrintArraySampleCode(T[] inputArray) {
		this.inputArray = inputArray;
	}
	public void toPrint() {
		PrintArraySampleCode.toPrint(this.inputArray);
}
	public static < E >void toPrint(E[] inputArray) {
		for (E element : inputArray ) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5,6 };
		Double[] doubleArray = {1.9,2.2,3.3,4.4};
		Character[] charArray = {'h','e','l','l','o'};
		
	    PrintArraySampleCode.toPrint(intArray);
		PrintArraySampleCode.toPrint(doubleArray);
		PrintArraySampleCode.toPrint(charArray);
	}
	

}
