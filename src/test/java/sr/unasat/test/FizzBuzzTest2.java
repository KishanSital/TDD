package sr.unasat.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sr.unasat.fizzbuzz.FizzMaster2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest2 {

    @BeforeEach
    public void setup(){

    }

    @Test
    void shouldStartAtOne() {
        String expected = "1";
        String actual = FizzMaster2.count(1).get(0);
        assertEquals(expected, actual);
    }

    @Test
    void shouldEndAtTwo() {
        String expected = "2";
        String actual = FizzMaster2.count(2).get(1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldEndAtHundred() {
        String expected = "Buzz";
        String actual = FizzMaster2.count(100).get(99);

        for(String number: FizzMaster2.count(100)){
            System.out.println(number);
        }

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should print the number as is when not multiple of three, five or both")
    void shouldPrintTheNumberAsIsWhenNotMultipleOfThreeFiveOrBoth() {
        String expected = "1";
        String actual = FizzMaster2.fizzIt(1);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("should print 2 as is")
    void shouldPrintTwoAsIs() {
        String expected = "2";
        String actual = FizzMaster2.fizzIt(2);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("should print Fizz for multiples of 3")
    void shouldPrintFizzForMultiplesOf3() {
        String expected = "Fizz";
        String actual = FizzMaster2.fizzIt(3);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("should print Buzz for multiples of 5")
    void shouldPrintBuzzForMultiplesOf5() {
        String expected = "Buzz";
        String actual = FizzMaster2.fizzIt(5);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("should print FizzBuzz for multiples of both 3 and 5")
    void shouldPrintFizzBuzzForMultiplesOfBoth3And5() {
        String expected = "FizzBuzz";
        String actual = FizzMaster2.fizzIt(15);
        assertEquals(expected, actual);
    }

}