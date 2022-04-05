package com.company;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {

    private static final String[] words = {"perfect", "country", "pumpkin", "special", "freedom", "picture", "husband",
            "monster", "seventy", "nothing", "sixteen", "morning", "journey", "history", "amazing", "dolphin", "teacher",
            "forever", "kitchen", "holiday", "welcome", "diamond", "courage", "silence", "someone", "science", "revenge",
            "harmony", "problem","awesome", "penguin", "youtube", "blanket", "musical", "thirteen", "princess", "assonant",
            "thousand", "language", "chipotle", "business", "favorite", "elephant", "children", "birthday", "mountain",
            "football", "kindness", "abdicate", "treasure", "strength", "together", "memories", "darkness", "sandwich",
            "calendar", "marriage", "building", "function", "squirrel", "tomorrow", "champion", "sentence", "daughter",
            "hospital", "identical", "chocolate", "beautiful", "happiness", "challenge", "celebrate", "adventure",
            "important", "consonant", "dangerous", "irregular", "something", "knowledge", "pollution", "wrestling",
            "pineapple", "adjective", "secretary", "ambulance", "alligator", "congruent", "community", "different",
            "vegetable", "influence", "structure", "invisible", "wonderful", "nutrition", "crocodile", "education",
            "beginning", "everything", "basketball", "weathering", "characters", "literature", "perfection", "volleyball",
            "homecoming", "technology", "maleficent", "watermelon", "appreciate", "relaxation", "abominable", "government",
            "strawberry", "retirement", "television", "silhouette", "friendship", "loneliness", "punishment", "university",
            "confidence", "restaurant", "abstinence", "blackboard", "discipline", "helicopter", "generation", "skateboard",
            "understand", "leadership", "revolution"};

    // this method takes an integer as input and returns a radom String from the array above. 
    // you can use it, but do NOT modified neither the method NOR the above array. 
    public static String getRandomWord(int seed) {
        Random gen = new Random(seed);
        int randomIndex = gen.nextInt(words.length);
        return words[randomIndex];
    }

    //========================
    // Enter your code below

    public static boolean isValidGuess(char ch) {

        //If the ch ASCII value is not in between a and z, it is not a lower case letter of the English alphabet

        return false;
    }

    public static int[] generateArrayOfGuesses(String s) {

        //Creates an array based on the length of the string and sets each element to 0

        return new int[1];
    }

    public static boolean checkAndUpdate(String secretWord, int[] array, char ch) {

        //Changes the value 0 of elements if the guess is correct
        //The 0 of the elements are changed to 1, and the 1 into 2, to be used for the getWordtoDisplay method


        return false;
    }

    public static String getWordToDisplay(String secretWord, int[] array, char ch) {
        String progress = "";

        //If the letter has just been guessed, it has value 1 and it is upper case
        //It is changed into 2 for the next guess, and it becomes lower case
        //Otherwise it only adds a hyphen

        for(int i=0; i <array.length; i++) {
            if(array[i] == 1) {
                progress += Character.toUpperCase(secretWord.charAt(i));
            }
            else if(array[i] == 2){
                progress += Character.toLowerCase(secretWord.charAt(i));
            }
            else{
                progress += "-";
            }
        }
        return progress;
    }

    public static boolean isWordGuessed(int[] array) {

        //If all the values in the array are no longer 0, the word has been guessed

        for(int i = 0; i < array.length;i++) {
            if (array[i] != 0) continue;
            else return false;
        }
        return true;
    }

    public static void play(int seed) {

        //Assembly of all the previous methods

        int lives = 10;
        String secretWord = getRandomWord(seed);
        int[] wordArr = generateArrayOfGuesses(secretWord);


        System.out.println("Welcome to \"Guess the Word!\"");
        System.out.print("Your secret word has been generated. ");
        System.out.println("It has 9 characters. You have 10 lives. Goodluck!");
        Scanner read = new Scanner(System.in);

    }

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please input a seed");
            System.exit(0);
        }
        else{
            int seed = Integer.parseInt(args[0]);
            play(seed);
        }
    }

}