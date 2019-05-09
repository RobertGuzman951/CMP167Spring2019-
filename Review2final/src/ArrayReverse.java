
public class ArrayReverse {
//arr:1,2,3,4,5,6,7,8,9 change/return to 9,8,7,6,5,4,3,2,1
	public static void reverse(int[] arr) {
		int [] Newarr =  new int [arr.length];
		int index = 0;
		for ( int i = arr.length-1; i>= 0; i--) {
			Newarr[index++] = arr[i]; 
		}
			return;
	}
}
	
