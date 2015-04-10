package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
        System.out.println(declareAndReturnPersonNamedAda());
    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
      return true;
    }

    public static int returnPrimitiveInt1729() {
      return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
      return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        for(int i = 0; i <= 10; i++);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        for(int i = 0; i <= 10; i++);
    }

    public static boolean isOdd(int n) {
      return false;
    }

    public static boolean isMultipleOfThree(int n) {

        if(n %3 == 0){
            return true;
        }
        else
            return false;

    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        if(n % 2 == 1 && n % 3 ==0 )
      return true;
        else
            return false;
    }


    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",

        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        return "";
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".


        return "";
    }

    public static Person declareAndReturnPersonNamedAda() {

        Person ada = new Person();

        return ada;

    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
      return null;
    }

    public static boolean isFromLondon(Person person) {
      return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        return null;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
      return null;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
