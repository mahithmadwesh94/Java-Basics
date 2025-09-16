import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        char vowels[] = new char[5];

        vowels[0] = 'a';
        vowels[1] = 'o';
        vowels[2] = 'i';
        vowels[3] = 'e';
        vowels[4] = 'l';

        System.out.println(Arrays.toString(vowels));

        //sorting arrays
        int startingIndex = 1;
        int endingIndex = 4;

        Arrays.sort(vowels,startingIndex,endingIndex);
        System.out.println(Arrays.toString(vowels));

        int foundItemIndex = Arrays.binarySearch(vowels, 'i');
        System.out.println(foundItemIndex);

        Arrays.fill(vowels,0,1,'X');
        System.out.println(Arrays.toString(vowels));


        //Arrays are reference types Array.copyOf()
        char vowels2[] = Arrays.copyOf(vowels, vowels.length);
        Arrays.fill(vowels2, 'x');
        System.out.println(Arrays.toString(vowels2));

        System.out.println(Arrays.copyOfRange(vowels, 0, 10));

        System.out.println(Arrays.equals(vowels, vowels2));
    }
    
}
