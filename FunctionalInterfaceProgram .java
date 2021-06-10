@FunctionalInterface
public interface FunctionalInterfaceProgram 
{
//public void anonymous ();
public void lambda(int n1,int n2);
default void display()
{
System.out.println("Calling Default Method");
}
static void show()
{
System.out.println("Calling Static Method");
}
}


