import java.util.Arrays;

public class ComparingArraysEqualsDemo {
 
    public static void main(String[] args) {
        
        String[] s1 = {"Raja", "Kumar", "Vimal", "Manoj", "Rahesh"};
        String[] s2 = {"Raja", "Kumar", "Vimal", "Manoj", "Rahesh"};
        String[] s3 = {"Kumar", "Manoj", "Raja", "Rahesh", "Vimal"};
        
        System.out.println("s1: "+ Arrays.toString(s1));
        System.out.println("s2: "+ Arrays.toString(s2));
        System.out.println("s3: "+ Arrays.toString(s3));
        
       System.out.println("\n Arrays.equals(s1, s2):" + Arrays.equals(s1, s2));
       System.out.println("Arrays.equals(s1, s3): " + Arrays.equals(s1, s3));
        
       System.out.println("\n" + Arrays.equals(s1, 0, 4, s3, 0, 4));
       System.out.println(Arrays.equals(s1, 0, 4, s2, 0, 4));
        
    }
}

/*OUTPUT:
	        s1: [Raja, Kumar, Vimal, Manoj, Rahesh]
			s2: [Raja, Kumar, Vimal, Manoj, Rahesh]
			s3: [Kumar, Manoj, Raja, Rahesh, Vimal]

			Arrays.equals(s1, s2):true
			Arrays.equals(s1, s3): false

			false
			true
*/
