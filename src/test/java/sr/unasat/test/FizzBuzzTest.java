package sr.unasat.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sr.unasat.fizzbuzz.FizzMaster;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @BeforeEach
    public void setup(){
    }

    @Test
    @DisplayName("Given a non multiple of 3, 5 or both, print the number as is")
    public void nonMultiplePrintsAsIs() {
        //Given
        int input = 1;
        String expected = "1";

        //When
        FizzMaster fizzMaster = new FizzMaster();
        String result = fizzMaster.fizzIt(input);

        //Then
        assertEquals("1", fizzMaster.fizzIt(1));
        assertEquals("2", fizzMaster.fizzIt(2));
        assertEquals("52", fizzMaster.fizzIt(52));
        assertEquals("26", fizzMaster.fizzIt(26));
    }

    @DisplayName("Given a multiple of three print Fizz")
    @Test
    public void forMultipleOfThreePrintFizz() {
        //Given
        int input = 3;
        String expected = "Fizz";

        //When
        FizzMaster fizzMaster = new FizzMaster();
        String result = fizzMaster.fizzIt(input);

        //Then
        assertEquals(expected, result);
    }

    @DisplayName("Given a multiple of five print Buzz")
    @Test
    public void forMultipleOfFivePrintBuzz() {
        //Given
        int input = 5;
        String expected = "Buzz";

        //When
        FizzMaster fizzMaster = new FizzMaster();
        String result = fizzMaster.fizzIt(input);

        //Then
        assertEquals(expected, result);
    }

    @DisplayName("Given a multiple of both three and five print FizzBuzz")
    @Test
    public void forMultipleOfBothThreeAndFivePrintBuzz() {
        //Given
        int input = 15;
        String expected = "FizzBuzz";

        //When
        FizzMaster fizzMaster = new FizzMaster();
        String result = fizzMaster.fizzIt(input);

        //Then
        assertEquals(expected, result);
    }

    @DisplayName("The first in the list is one and prints one")
    @Test
    public void countFrom1To100() {
        //Given
        FizzMaster fizzMaster = new FizzMaster();

        //When
        List<String> result = fizzMaster.countFromOneToOneHundred();

        //Then
        assertEquals("1", result.get(0));
        assertEquals("2", result.get(1));
        assertEquals("Fizz", result.get(2));
        assertEquals("Buzz", result.get(4));
        assertEquals("FizzBuzz", result.get(14));
        assertEquals("52", result.get(51));
        assertEquals("91", result.get(90));
        assertEquals("Buzz", result.get(99));
    }




}
