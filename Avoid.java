import java.util.ArrayList;
import java.util.List;

public class Avoid
{
public static void main(String[] args) 
{
ArrayList al = new ArrayList();
al.add(5);
al.add("Raja");
al.add(5.4f);
al.add(true);
//System.out.println(al);
//System.out.println(al.contains(5.4f));
//System.out.println(al.contains(5.3f));
//al.clear();
//System.out.println(al);
//System.out.println(al.indexOf(true));
//System.out.println(al.get(1));
//System.out.println(al.getClass());

//System.out.println(al.isEmpty());
//al.clear();
//System.out.println(al.isEmpty());

ArrayList al2 = new ArrayList();
al2.addAll(al);
System.out.println(al2);

ArrayList al3 = new ArrayList();
al3.add(100);
al3.add(200);
al3.add(300);

al2.addAll(al3);
System.out.println(al2);
//al2.addAll(2, al3);//method overloading
//System.out.println(al2);
al2.add(3,457);
System.out.println(al2);

//al2.remove(0);
//al2.remove(true);
//al2.removeAll(al);

al2.retainAll(al);

List al4 = al2.subList(1,2);
System.out.println(al4);

System.out.println(al);
//al.remove(0);
//System.out.println(al);
//al.remove("Raja");
//System.out.println(al);
}
}

/*OUTPUT:
[5, Raja, 5.4, true]
[5, Raja, 5.4, true, 100, 200, 300]
[5, Raja, 5.4, 457, true, 100, 200, 300]
[Raja]
[5, Raja, 5.4, true]
*/
