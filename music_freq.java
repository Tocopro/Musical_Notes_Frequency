package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Hash table for the frequencies key = note, value = frequency at that note
        HashMap<String, Double> frequency_notes = new HashMap<String, Double>();
        frequency_notes.put("C4", 261.63);
        frequency_notes.put("D4", 293.66);
        frequency_notes.put("E4", 329.63);
        frequency_notes.put("F4", 349.23);
        frequency_notes.put("G4", 392.00);
        frequency_notes.put("A4", 440.00);
        frequency_notes.put("B4", 493.88);
        // User will input the note
        Scanner user_frequency = new Scanner(System.in);
        System.out.println("Enter the Note: ");
        String note = user_frequency.nextLine();
        // note is converted to uppercase if not
        note = note.toUpperCase();
        // initializing variables used in the if statements
        Character letter_note = 0;
        char octave = 'a';
        double frequency = 0;
        // iterating the user input into the first character and the last character
        for(int i = 0; i < note.length(); i++)
        {
            letter_note = note.charAt(0);
            octave = note.charAt(1);
        }
        String letter_note_1 = String.valueOf(letter_note);
        // switch statements for all the frequency notes in the frequency chart
        switch (letter_note_1)
        {
            case "C" -> {
                // get the value of the median frequency
                frequency = frequency_notes.get("C4");
                // convert the octave into an integer
                int a = Character.getNumericValue(octave);
                // calculate the actual frequency of the users input note
                frequency = frequency / (Math.pow(2, (4 - a)));
                // display the frequency
                System.out.println("The Frequency of " + note + " is " + frequency + "Hz");
            }
            case "D" -> {
                frequency = frequency_notes.get("D4");
                int b = Character.getNumericValue(octave);
                frequency = frequency / (Math.pow(2, (4 - b)));
                System.out.println("The Frequency of " + note + " is " + frequency + "Hz");
            }
            case "E" -> {
                frequency = frequency_notes.get("E4");
                int c = Character.getNumericValue(octave);
                frequency = frequency / (Math.pow(2, (4 - c)));
                System.out.println("The Frequency of " + note + " is " + frequency + "Hz");
            }
            case "F" -> {
                frequency = frequency_notes.get("F4");
                int d = Character.getNumericValue(octave);
                frequency = frequency / (Math.pow(2, (4 - d)));
                System.out.println("The Frequency of " + note + " is " + frequency + "Hz");
            }
            case "G" -> {
                frequency = frequency_notes.get("G4");
                int e = Character.getNumericValue(octave);
                frequency = frequency / (Math.pow(2, (4 - e)));
                System.out.println("The Frequency of " + note + " is " + frequency + "Hz");
            }
            case "A" -> {
                frequency = frequency_notes.get("A4");
                int f = Character.getNumericValue(octave);
                frequency = frequency / (Math.pow(2, (4 - f)));
                System.out.println("The Frequency of " + note + " is " + frequency + "Hz");
            }
            case "B" -> {
                frequency = frequency_notes.get("B4");
                int g = Character.getNumericValue(octave);
                frequency = frequency / (Math.pow(2, (4 - g)));
                System.out.println("The Frequency of " + note + " is " + frequency + "Hz");

            }
            // invalid entry catcher
            default -> System.out.println("Invalid Musical Note");

        }

    }
}
