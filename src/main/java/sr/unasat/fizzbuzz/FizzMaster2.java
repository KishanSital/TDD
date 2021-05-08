package sr.unasat.fizzbuzz;
import java.util.List;
import java.util.ArrayList;

public class FizzMaster2 {

    public static List<String> count(int number) {
        List<String> numbers = new ArrayList<String>();

        for(int i=1; i <= number; i++){

            numbers.add(fizzIt(i));
        }

        return numbers;
    }

    public static String fizzIt(int number) {
        if(isMultipleOf(number, 3) && isMultipleOf(number, 5)){
            return "FizzBuzz";
        }
        else if(isMultipleOf(number, 3)){
            return "Fizz";
        } else if (isMultipleOf(number, 5)){
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static boolean isMultipleOf(int number, int multiple){
        return number % multiple == 0;
    }
}