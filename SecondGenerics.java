public class SecondGenerics
{
public static void main(String[] args) 
{
RajGenerics q = new RajGenerics();
RajGenericsClass<RajGenerics> r = new RajGenericsClass<RajGenerics>(q);
//RajGenericsClass<String> r = new RajGenericsClass<String>("P");
r.show();
}
}
