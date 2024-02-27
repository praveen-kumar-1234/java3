import java.util.*;
public class Program3 {

    public static void main(String[] args)
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(21);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(23);
        numbers.add(87);
        numbers.add(99);
        numbers.add(7);

        //Displaying elements and their positions in a Linked List
        for(Integer num : numbers)
        {
            System.out.println(num+" positioned at "+numbers.indexOf(num));
        }

    }
}
