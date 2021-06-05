import java.util.*;
import java.util.function.Consumer;

public class RArray
{
public static void main(String[] args)
{
ArrayList al = new ArrayList();
al.add("Raja");
al.add("Ajay");
al.add("Suresh");
al.add(1, "Senthilnathan");
al.add("Vimal");
System.out.println(al);
al.remove(0);
System.out.println(al);
al.add(0, "Singaram");
System.out.println(al);
al.remove("Vimal");
System.out.println(al);
//students.forEach((n) -> print(n));
//al.forEach(());
al.forEach((n) -> System.out.println(n));
}
}

/*
OUTPUT:

[Raja, Senthilnathan, Ajay, Suresh, Vimal]
[Senthilnathan, Ajay, Suresh, Vimal]

*/
