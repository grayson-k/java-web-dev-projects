package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        MultipleChoice q1 = new MultipleChoice("Did we go to the moon?", new ArrayList<String>(Arrays.asList("Yes", "No", "Maybe")), "Yes");
        Checkbox q2 = new Checkbox("Who is your favorite IA?", new ArrayList<String>(Arrays.asList("Kevin", "Jay", "Ariel", "Shawn")), new ArrayList<String>(Arrays.asList("Kevin", "Jay", "Ariel", "Shawn")));
        TrueFalse q3 = new TrueFalse("Do humans need air to live?", true);

        Scanner userInput = new Scanner(System.in);

        System.out.println(q1);
        String q1Answer = userInput.nextLine();

        System.out.println(q2);
        String q2Answer = userInput.nextLine();

        System.out.println(q3);
        String q3Answer = userInput.nextLine();
    }

}
