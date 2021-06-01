import java.util.LinkedHashSet;

public class RajLink 
{
public static void main(String[] args) 
{
LinkedHashSet lhs = new LinkedHashSet();
lhs.add(10);
lhs.add(5);
lhs.add(30);
lhs.add(31);
lhs.add(1);
System.out.println(lhs);
// Insertion order is maintained
System.out.println(lhs.contains(5));
LinkedHashSet lhs1 = new LinkedHashSet();
lhs1.add(10);
lhs1.add(5);
lhs1.addAll(lhs);
System.out.println(lhs.containsAll(lhs1));
System.out.println(lhs1);
}

}
