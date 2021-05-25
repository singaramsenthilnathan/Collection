import java.util.Arrays;

public class Test2
{
public static void main(String[] args)
{
	byte byteArr[]= {10,12,14,16,79,43};
Arrays.sort(byteArr);
byte bytekey = 79;
System.out.println(Arrays.binarySearch(byteArr, bytekey));
char charArr[] = {'S','I','N','G','A','R','A','M'};
Arrays.sort(charArr);
char charkey = 'I';
System.out.println(Arrays.binarySearch(charArr, charkey));
int intArr[] = {10,20,15,22,35};
Arrays.sort(intArr);
int intkey = 15;
System.out.println(Arrays.binarySearch(intArr, intkey));
double doubleArr[] = {10.2,15.1,2.2,3.5};
Arrays.sort(doubleArr);
double doublekey = 1.2;
//double doublekey =15.1;
System.out.println(Arrays.binarySearch(doubleArr, doublekey));
}
}
/* OUTPUT:
5
3
1
-1
*/
