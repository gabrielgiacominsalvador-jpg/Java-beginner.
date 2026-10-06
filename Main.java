no usages 

import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        System.out.println(
            "Enter Grade varying from Castbound,Requiem,Noctural,Tryhard,Godbreaker");
        String grade = "Castbound";

        Random random = new Random();

        if (grade.equals("Castbound")) {
            double Luck = 390.0;
            double Resilience = 37.2;
           System.out.printf("Lurespeed = Inf, Luck = %.1f, Resilience = %.1f%n", luck, resilience);
        }
        else if (grade.equals("Requiem")) {
            double Lurespeed = 80.0 + (90.0 - 80.0) * random.nextDouble();
            double Luck = 125.0 + (175.0 - 125.0) * random.nextDouble();
            double Resilience = 20.0 + (40.0 - 20.0) * random.nextDouble();

           System.out.printf("Lurespeed = %.1f, Luck = %.1f, Resilience = %.1f%n", lurespeed, luck, resilience);
        }
        else if (grade.equals("Noctural")) {
            double Lurespeed = 90.0 + (120.0 - 90.0) * random.nextDouble();
            double Luck = 180.0 + (190.0 - 180.0) * random.nextDouble();
            double Resilience =  25.0 + (50.0 - 25.0) * random.nextDouble();

           System.out.printf("Lurespeed = %.1f, Luck = %.1f, Resilience = %.1f%n", lurespeed, luck, resilience);
        }

        else if (grade.equals("Tryhard")) {
            double lurespeed = 10.0 + (35.0 - 10.0) * random.nextDouble();
            double luck = 55.0 + (60.0 - 55.0) * random.nextDouble();
            double resilience = 1.0 + (10.0 - 1.0) * random.nextDouble();

            System.out.printf("Lurespeed = %.1f, Luck = %.1f, Resilience = %.1f%n", lurespeed, luck, resilience);
        }

        else if (grade.equals("Godbreaker")) {
            double Lurespeed = 225.0 + (300.0 - 225.0) * random.nextDouble();
            double Luck = 256.0 + (300.0 - 256.0) * random.nextDouble();
            double Resilience = 45.0 + (60.0 - 45.0) * random.nextDouble();

            System.out.printf("Lurespeed = %.1f, Luck = %.1f, Resilience = %.1f%n", lurespeed, luck, resilience);
        }
        else {
            System.out.println("The grade you entered is not valid!");
        }
    }
}
