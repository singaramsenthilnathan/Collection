import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class InterviewProgram 
{
public static void main(String[] args) 
{
String Name ="SingaramSenthilnathan";
char []c = Name.toCharArray();
HashMap <Character,Integer>h = new HashMap<Character,Integer>();
for(int i=0;i<c.length;i++)
{
//System.out.print(c[i]);
if(h.containsKey(c[i])==false)
h.put(c[i], 1);
else
{
int value = h.get(c[i]);
h.put(c[i], value+1);
}
}
//System.out.println(h);
Set<Map.Entry<Character, Integer>> s=h.entrySet();
for(Map.Entry<Character,Integer> e:s)
{
if(e.getValue()==4)
e.setValue(99);
System.out.println(e);
}	
}
}
