import java.util.TreeSet;

public class RajTreeSet 
{
public static void main(String[] args) 
{
RajComparator r = new RajComparator();
//overrides compare method to produce
// own sorted order
TreeSet t = new TreeSet(r);
//TreeSet t = new TreeSet();
//t.add(15);
//t.add(128);
//t.add(20);
//t.add(45);
// Sorted Order is Maintained (Ascending)
TreeSetObject s1 = new TreeSetObject("Raja","JAVA",16500);
TreeSetObject s2 = new TreeSetObject("Rahesh","JAVA",16500);
TreeSetObject s3 = new TreeSetObject("Raj","JAVA",16500);
t.add(s1);
t.add(s2);
t.add(s3);
System.out.println(t);
}

}
