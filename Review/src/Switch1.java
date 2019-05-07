
public class Switch1 {
public static void main(String[] args) {
for (int i = 10; i >= 0; i -= 2) {
switch (i) {
case 0:
System.out.println(i + ":" + i);
break;
case 2:
System.out.println(i + ":" + (i * 5) % 3);
case 4:
System.out.println(i + ":" + (i * 3) % 5);
break;
case 6:
System.out.println(i + ":" + (i * 4) % 9);
case 8:
System.out.println(i + ":" + (i * 5) % 6);
default:
System.out.println(i + ":" + (i * 2) % 8);
break;
}
}
}
}