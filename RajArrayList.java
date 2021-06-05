import java.util.ArrayList;

public class RajArrayList
{
public static void main(String[]args)
{
	ArrayList al =new ArrayList();
	al.add("Raja");
	al.add("Manoj");
	al.add("Prasanth");
	al.add("Vimal");
	
	//Displaying Elements
	System.out.println(al);
	
	//Adding Singaram @ 2nd Position
	al.add(1, "Singaram");
	System.out.println(al);
	//Note: Since the index starts with 0, index 1 would represent Second position not 1.
}
}
