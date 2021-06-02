import java.util.LinkedHashMap;

public class LinkedHashMapClass 
{
public static void main(String[] args) 
{
//Insertion Order is Maintained
//keys can be hetrogenous.
LinkedHashMap l = new LinkedHashMap();
l.put(22, "Raja");
l.put(11, "Singaram");
l.put(33, "Sri");
l.put(44, "GalaxyStar");
System.out.println(l);
System.out.println(l.containsKey(33));
System.out.println(l.containsValue("Raja"));

}
}
