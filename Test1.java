import java.util.Arrays;

public class Test1 
{
public static void main(String[] args) 
{
String [] names = {"Vimal Kumar","Raja","Singaram Senthilnathan","Manoj","Prasanth"};
//Arrays.sort(names);
MyComparator mc = new MyComparator();
Arrays.sort(names, mc);
for(int i=0;i<names.length;i++)
{
	System.out.println(names[i]);
}
}
}
