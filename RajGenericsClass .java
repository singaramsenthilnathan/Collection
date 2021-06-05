public class RajGenericsClass <T> 
{
T t;

public RajGenericsClass(T o)
{
this.t = o;	
}
void show()
{
	System.out.println("Class of the Object");
	System.out.println(t.getClass().getTypeName());
	
}
public static void main(String[] args)
{

}

}
