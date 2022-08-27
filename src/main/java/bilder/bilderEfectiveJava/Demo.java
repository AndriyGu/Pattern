package bilder.bilderEfectiveJava;

import bridge.refactoringGuru.*;

public class Demo {
    public static void main(String[] args) {
        NutritionFacts nzt48 = new NutritionFacts.Builder(4, 8).carbohydrate(34).build();


        System.out.println(nzt48.getCalories());
    }
}