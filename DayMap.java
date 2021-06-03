import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class DayMap 
{
String Name;
int Id;
int Salary;
public DayMap(String Name,int Id,int Salary)
{
this.Name= Name;
this.Id=  Id;
this.Salary= Salary;
}
public String toString()
{
return this.Name+" "+this.Id+" "+this.Salary;
}
public static void main(String[] args) 
{
DayMap d1 = new DayMap("Raja",201,25000);
DayMap d2 = new DayMap("Latha",202,25000);
DayMap d3 = new DayMap("Vidhu",203,25000);
DayMap d4 = new DayMap("Vimal",204,25000);
HashMap h = new HashMap();
h.put(1, d1);
h.put(2, d2);
h.put(3, d3);
h.put(4, d4);
System.out.println(h);
System.out.println(h.entrySet());

//viewed as entries-key and values objects
Set s = h.entrySet();
Iterator i = s.iterator();
//used to print all the elements in the collection class.
//Also,can do manipulation/changes in the class. 
/*while(i.hasNext())
{
Map.Entry m =(Map.Entry)i.next();
System.out.println(m.getKey());
System.out.println(m.getValue());
}*/
while(i.hasNext())
{
Map.Entry m =(Map.Entry)i.next();
if(m.getKey().equals(3))
{
DayMap d = new DayMap("SriVidhya",203,25000);
m.setValue(d);
}
}
System.out.println(h);
}
}
