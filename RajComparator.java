import java.util.Comparator;
public class RajComparator implements Comparator 
{
public static void main(String[] args) 
{	
}
@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	TreeSetObject s1 = (TreeSetObject)o1;
	TreeSetObject s2 = (TreeSetObject)o2;
	int Result = s1.Trainee.compareTo(s2.Trainee);
	if(Result>0)
		return 1;
	else if(Result<0)
		return -1;
	else
	return 0;
}
//@Override
/*public int compare(Object o1, Object o2)
{
Integer t1 = (Integer)o1;
Integer t2 = (Integer)o2;
//Autoboxing -automatic conversion in
//Collection
if(t2>t1)
	return 1;
else if (t1>t2)
	return -1;
else	
return 0;
}*/
}
