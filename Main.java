no usages 

import java.util.*;

public class Main {

    static class Gradeinfo {
        int id;
        String name;
        double minLure, maxLure;
        double minLuck, maxLuck;
        double minRes, maxRes;

        public Gradeinfo(int id, String name, double minLure, double maxLure, double minLuck, double maxLuck, double minRes, double maxRes) {
            this.id = id;
            this.name = name;
            this.minLure = minLure;
            this.maxLure = maxLure;
            this.minLuck = minLuck;
            this.maxLuck = maxLuck;
            this.minRes = minRes;
            this.maxRes = maxRes;
        }
        public void generateStats(Random random) {
            String lureStr;
            
            // Se min e max de Lure forem iguais a -1, consideramos 'Infinito' (Caso do Castbound)
            if (minLure == -1) {
                lureStr = "Inf";
            } else {
                double lurespeed = minLure + (maxLure - minLure) * random.nextDouble();
                lureStr = String.format("%.1f", lurespeed);
            }

            double luck = minLuck + (maxLuck - minLuck) * random.nextDouble();
            double resilience = minRes + (maxRes - minRes) * random.nextDouble();

            System.out.printf("[%d] Grade: %s | Lurespeed = %s, Luck = %.1f, Resilience = %.1f%n",
                    id, name, lureStr, luck, resilience);
        }
    }

    public static void main(String[] args) {

        // Tabela de Configuração usando as Chaves Primitivas (IDs)
        Map<Integer, GradeInfo> grades = new HashMap<>();
        grades.put(1, new GradeInfo(1, "Castbound",  -1,    -1,   390.0, 390.0, 37.2, 37.2));
        grades.put(2, new GradeInfo(2, "Requiem",    80.0,  90.0, 125.0, 175.0, 20.0, 40.0));
        grades.put(3, new GradeInfo(3, "Noctural",   90.0, 120.0, 180.0, 190.0, 25.0, 50.0));
        grades.put(4, new GradeInfo(4, "Tryhard",    10.0,  35.0,  55.0,  60.0,  1.0, 10.0));
        grades.put(5, new GradeInfo(5, "Godbreaker", 225.0, 300.0, 256.0, 300.0, 45.0, 60.0));

        Random random = new Random();

        // Escolha a Chave Primitiva (ID) do Grade desejado (ex: 1 para Castbound, 2 para Requiem, etc.)
        int selectedKey = 2; 

        System.out.println("--- Gerador de Status Por Chave ---");

        if (grades.containsKey(selectedKey)) {
            GradeInfo selectedGrade = grades.get(selectedKey);
            selectedGrade.generateStats(random);
        } else {
            System.out.println("Erro: Chave de Grade (" + selectedKey + ") não é válida!");
        }
    }
}    
    /* Esse código abaixo é uma versão anterior que não utiliza a tabela de configuração e gera os status diretamente com base na entrada do usuário. Mantido para referência. Ok?
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
} */
