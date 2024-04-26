import java.util.*;
public class no {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        int[] arr = new int [al.size()];


        for (Integer x : arr)
            System.out.print(x + " ");

    }

}
