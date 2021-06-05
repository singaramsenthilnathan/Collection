import java.util.ArrayList;
public class GenericMethod 
{
public static void main(String[] args) 
{
//ArrayList<Integer>al = new ArrayList<Integer>();
//display(al);
//ArrayList<String>al2 = new ArrayList<String>();
//display(al2);
}
// <?> denotes any class objects
public void display(ArrayList<?> la) //? extends parents org rules.
{
System.out.println(la);	
}
}
