package git;
/*
 * int[] arr = new int[10];
 * System.out.println(arr);//地址值?
 * 
 * char[] arr1 = new char[10];
 * System.out.println(arr1);//地址值?
 */
public class ArrayPrint {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3};
		System.out.println(arr);//地址值
		
		char[] arr1 = new char[]{'a','b','c'};
		System.out.println(arr1);//abc
	}
}
