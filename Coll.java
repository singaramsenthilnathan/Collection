import java.util.Arrays;
public class Coll
{
public static void main(String[] args) 
{
int[] br = {5,16,10,15,11};
//Arrays.sort(br);//natural ordering
//Arrays.sort(br, 0, 5);
//for(int i=0;i<br.length;i++)
//{
//System.out.print(br[i]+" ");
//}
//System.out.println();
String []names ={"Raja","Singaram","Senthilnathan","Ashwin"};
//Arrays.sort(names);
ComparatorDd d = new ComparatorDd();
Arrays.sort(names, d);
for(int i=0;i<names.length;i++)
{
System.out.print(names[i]+" ");
}

}
}
