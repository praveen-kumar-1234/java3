import java.util.*;
public class Program2 {

    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(9);
        numbers.add(3);
        numbers.add(4);
        numbers.add(23);
        numbers.add(87);
        numbers.add(99);
        numbers.add(7);
        System.out.println("Original arraylist elements :"+numbers);
        Scanner s = new Scanner(System.in);

         // We can update an arraylist element like this also based on object

            System.out.println("Enter the element to update ");
            int givenElement = s.nextInt();
            if(numbers.contains(givenElement))
            {
             System.out.println("Enter the new value to that element ");
             int updatedElement = s.nextInt();
             numbers.set(numbers.indexOf(givenElement),updatedElement );
            }
            else
            {
                System.out.println("The element is not present in the ArrayList");
            }


        System.out.println("After update arraylist elements :"+numbers);

    }
}
