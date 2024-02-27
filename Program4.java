import java.util.*;
public class Program4 {

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

        //Displaying the elements in the LinkedList
        System.out.println(numbers);

        //Removing First element and Last element
        numbers.removeFirst();
        numbers.removeLast();

        //Displaying the elements in the LinkedList
        System.out.println(numbers);


    }



}
