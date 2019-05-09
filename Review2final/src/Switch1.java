public class Switch1 {
 public static void main(String[] args) {
 int[] arr = { 1, 3, 5, 7, 9, 8, 6, 4, 2 };
 for (int i = 0; i < arr.length; i++) {
 switch (i) {
 case 0:
 System.out.println("i = " + i + " : " + (arr[i + 1] * arr[i + 2])); break;
 case 1:
 System.out.println("i = " + i + " : " + (arr[i + 3] + arr[i + 3]));
 case 2:
 System.out.println("i = " + i + " : " + (arr[i + 4] / arr[i + 6])); break;
 case 3:
 System.out.println("i = " + i + " : " + (arr[i - 1] - arr[i - 3]));
 case 4:
 System.out.println("i = " + i + " : " + (arr[i - 2] * arr[i - 2])); break;
 case 5:
 System.out.println("i = " + i + " : " + (arr[i + 3] + arr[i + 3]));
 case 6:
 System.out.println("i = " + i + " : " + (arr[i - 1] / arr[i + 2])); break;
 case 7:
 System.out.println("i = " + i + " : " + (arr[i - 5] - arr[i + 1]));
 default:
 System.out.println("i = " + i + " : " + (arr[i - 7] * arr[i - 4]));
 }
 }
 }
}
