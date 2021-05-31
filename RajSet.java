import java.util.HashSet;
public class RajSet 
{
	String Name;
	int Age;
	public RajSet(String Name,int Age)
	{
	this.Name = Name;
	this.Age = Age;
	}
	public boolean equals(Object o)
	{
		RajSet et = (RajSet)o;
		//if(this.Age==et.Age)
		//return true;
		 //return false;
		int result =this.Name.compareTo(et.Name);
		if(result==0)
		{
			return true;
		}
			return false;
		
	}
	public int hashCode()
	{
		return 1;
	}

public String toString()
{
	return this.Name+" "+this.Age;
}
}
