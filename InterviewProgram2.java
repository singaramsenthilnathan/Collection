import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class InterviewProgram2 
{
public static void main(String[] args) 
{
String Name ="Singaram,Senthilnathan,Akash,Ajay,Singaram";
String []n = Name.split(",");
HashMap <String,Integer>h = new HashMap<String,Integer>();
for(int i=0;i<n.length;i++)
{
//System.out.print(n[i]);
if(h.containsKey(n[i])==false)
h.put(n[i], 1);
else
{
int value = h.get(n[i]);
h.put(n[i], value+1);
}
}
//System.out.println(h);
Set<Map.Entry<String, Integer>> s=h.entrySet();
for(Map.Entry<String,Integer> e:s)
{
if(e.getValue()>=1)
{
System.out.println(e);
}	
}
}
}
