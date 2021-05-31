import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet h = new HashSet();
RajSet rs = new RajSet("Raja",23);
RajSet rs1 = new RajSet("Raj",23);
RajSet rs2= new RajSet("Raju",23);
RajSet rs3 = new RajSet("Raja",23);

h.add(rs3);
h.add(rs2);
h.add(rs1);
h.add(rs);

System.out.println(rs3.hashCode());
System.out.println(rs2.hashCode());
System.out.println(rs1.hashCode());
System.out.println(rs.hashCode());

System.out.println(h);
	}

}
