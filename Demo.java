import java.util.Arrays;

public class Demo {
 
    public static void main(String[] args) {
        
        int[] i1 = {2, 4, 6, 8, 10};
        int[] i2 = {2, 4, 6, 8, 10};
        int[] i3 = {2, 4, 12, 8, 10,15};
       
        System.out.println("i1: "+ Arrays.toString(i1));
        System.out.println("i2: "+ Arrays.toString(i2));
        System.out.println("i3: "+ Arrays.toString(i3));
        
        System.out.println("\nArrays.compare(i1, i2): " + Arrays.compare(i1, i2));
        System.out.println("Arrays.compare(i1, i3): " + Arrays.compare(i1, i3));
        System.out.println("Arrays.compare(i3, i1): " + Arrays.compare(i3, i1));
        
        System.out.println("\nArrays.compare(i1, 0, 3, i3, 0, 3): " +
                Arrays.compare(i1, 0, 3, i3, 0, 3));
        System.out.println("Arrays.compare(i1, 0, 3, i2, 0, 3): " +
                Arrays.compare(i1, 0, 3, i2, 0, 3));
        System.out.println("Arrays.compare(i3, 0, 3, i1, 0, 3): " +
                Arrays.compare(i3, 0, 3, i1, 0, 3));
        
    }
}
/* OUTPUT:
i1: [2, 4, 6, 8, 10]
i2: [2, 4, 6, 8, 10]
i3: [2, 4, 12, 8, 10, 15]

Arrays.compare(i1, i2): 0
Arrays.compare(i1, i3): -1
Arrays.compare(i3, i1): 1

Arrays.compare(i1, 0, 3, i3, 0, 3): -1
Arrays.compare(i1, 0, 3, i2, 0, 3): 0
Arrays.compare(i3, 0, 3, i1, 0, 3): 1
*/
