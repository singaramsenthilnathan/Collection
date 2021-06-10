public class LambdaImplementingClass 
{
public static void main(String[] args) 
{
//FunctionalInterfaceProgram f =()->System.out.println("Obeying Rules");
FunctionalInterfaceProgram f=(n1,n2)->System.out.println(n1+n2);	
//f.anonymous();
f.lambda(25,25);
f.display();
FunctionalInterfaceProgram.show();
}
}
