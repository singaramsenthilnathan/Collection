import java.util.HashMap;
public class MapClass 
{
public static void main(String[] args) 
{
HashMap h = new HashMap();
h.put(125, 20);
h.put(124, 78);
h.put(123, 20);
h.put(126, 45);
System.out.println(h);
System.out.println("For Key Value 124 -"+h.get(124));
//HashMap h2 = new HashMap();
//h2 = (HashMap)h.clone();
//HashMap h2 = (HashMap)h.clone();
Object h2 = new HashMap();
h2 = h.clone();
System.out.println("H2 becomes -"+h2);
h.remove(123);
System.out.println("After removing Key 2-"+h);
System.out.println(h.remove(124, 78));
System.out.println(h);
System.out.println("Enteries in Set:"+h.entrySet());
System.out.println("Keys:"+h.keySet());
System.out.println("Values:"+h.values());
}
}
