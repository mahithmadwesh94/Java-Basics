import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        numbers.get(2);
        numbers.remove(0);
        numbers.remove(Integer.valueOf(4));
       
        numbers.set(0,Integer.valueOf(6));

        System.out.println(numbers);


         numbers.clear();

         numbers.add(6);
         numbers.add(8);
         numbers.add(9);
         numbers.add(4);
         numbers.add(3);

         numbers.sort(Comparator.naturalOrder());
         System.out.println(numbers);

         numbers.sort(Comparator.reverseOrder());
         System.out.println(numbers);

         System.out.println(numbers.isEmpty());

         System.out.println(numbers.size());

         System.out.println(numbers.contains(4));


         numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number),number * 2);
           
         });


         System.out.println(numbers);



    }
}
