import java.util.Arrays;

public class Test 
{
public static void main(String[] args) 
{
int []ar = {6,7,9,11,14,15,17,18};
//int []br = {6,7,9,11,14,15,16};
int []br = {6,71,96,11,141,15,16};
int result=Arrays.binarySearch(ar,14);
//System.out.println(result);
int result2=Arrays.compare(ar, br);
//System.out.println(result2);
int []cr=Arrays.copyOf(ar, 4);
for(int i=0;i<cr.length;i++)
{
	//System.out.println(cr[i]);
}
Arrays.sort(br, 0, 7);
for(int i=0;i<br.length;i++)
{
	System.out.println(br[i]);
}
}

}
