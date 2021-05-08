package sr.unasat.fizzbuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzMaster {

    public String fizzIt(int number) {

        if (isMultipleOf(number, 3) && isMultipleOf(number, 5)) {
            return "FizzBuzz";
        }
        if (isMultipleOf(number, 5)) {
            return "Buzz";
        }
        if (isMultipleOf(number, 3)) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOf(int number, int multiple) {
        return number % multiple == 0;
    }

    public List<String> countFromOneToOneHundred() {
        List<String> listOfFizzBuzz = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            listOfFizzBuzz.add(fizzIt(i));
        }
        return listOfFizzBuzz;
    }
}
