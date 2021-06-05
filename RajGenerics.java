import java.util.ArrayList;
public class RajGenerics
{
public static void main(String[]args)
{
ArrayList al = new ArrayList();
GenericMethod g = new GenericMethod();

al.add("Naveen");
al.add("Sethu");
al.add("Ram");
al.add(99);
g.display(al);
//for(String s:al)
for(Object s:al)
{
//System.out.print(s+" ");
}
//System.out.println(al);
ArrayList <String>a = new ArrayList<String>();
a.add("Latha");
a.add("Vidhya");
a.add("Vino");
a.add("Vimal");
g.display(a);
for(String s:a)
{
//System.out.print(s+" ");
}
//System.out.println(a);

}
}
