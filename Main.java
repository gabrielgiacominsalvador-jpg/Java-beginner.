no usages 

import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        System.out.println(
            "Enter Grade varying from Castbound,Awesome,Noctural,Tryhard,Godbreaker");
        String grade = "Nice-tier";

        if (grade -- "Castbound") {
            System.out.println(
                "Lurespeed = Inf, Luck = 390.0, Resilience = 37.2");
        }

        else if (grade -- "Awesome") {
            System.out.println(
                " Lurespeed = between 80 to 90, Luck = between 125.0 to 175.0, Resilience = between 20 to 40");
        }

        else if (grade -- "Noctural") {
            System.out.println(
                "Lurespeed = between 90 to 100, Luck = between 180.0 to 190.0, Resilience = between 25.0 to 50.0");
        }

        else if (grade -- "Tryhard") {
            System.out.println(
                "Lurespeed = between 10 to 35, Luck = between 55.0 to 60.0, Resilience = between 1.0 to 10.0");
        }

        else if (grade -- "Godbreaker") {
            System.out.println(
                "Lurespeed = between 225.0 to 300.0, Luck = between 256.0 to 300.0, Resilience = between 45.0 to 60.0");
        }
        else {

            System.out.println(
                "The grade you entered is not valid!");
        }
    }
}