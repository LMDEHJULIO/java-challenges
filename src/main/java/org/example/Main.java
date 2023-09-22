package org.example;


import java.util.Arrays;

public class Main {
    public static int vowelsCounter(String str){
        // Trying functional approach. Honestly prob too complicated compared to regex
        // return (int) vowelString.chars().filter(singleChar -> "aeiouy".0).count();

        // Ironically found this article for *removing* vowels and reversed the regex from here to get solution
        // https://prepinsta.com/java-program/remove-vowels-from-a-string/

        return str.replaceAll("[^aeiouy]", "").length();
    }

    public static String[] swap(String[] stringArr){
        int lastEl = stringArr.length - 1;
        String firstEl = stringArr[0];

        stringArr[0] = stringArr[lastEl];
        stringArr[lastEl] = firstEl;

        return stringArr;

    }



    public static String replaceCharacters(String str){
        // str == 'f' : str.replace('f', '7'): // cannot equate string to char, was gonna loop and do this. Failed

        // replace() returns a string. u can chain a bunch of replaces to avoid looping! Kind of ghetto looking, but it works

        return str.replace('f', '7').replace('s', '$').replace('1', '!').replace('a', '@');

    }

    //    Question 19
    //
    //    " The small brown dog hopped the fence " becomes
                //2   /3    /2*2       2*3

    //    " The Wu Tang Wu Hopped Wu Fence "
            // If I'm understanding correctly, chars at points within string divisible by 2/3 are replaced by Wu or Tang



    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        //
        return null;

    }

    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        // given maxNumber, I could probably while loop while less than maxNumber
        int i  = 0;

        // starts fib sequence at 0

        String fibSequnce = "0";

        // current/starting num in sequnce is 1, previous 0 - aka initial point in sequence
        // fib is basically recurring pattern of current + current - 1;

        int current = 1, previous = 0;

        while (i < maxnumber){
            // append

            fibSequnce += current;

            current += previous;

            previous = current - previous;

            // number + number - 1
        }
        return fibSequnce;

    }

    public static void main(String[] args) {
        System.out.println(vowelsCounter("This is a string"));

        String[] testArr = {"First", "Second", "Third", "Fourth"};

        System.out.println(Arrays.toString(swap(testArr)));

        System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));

        System.out.println(createStringOfFibonnaciUpToMax(4));
    }


}