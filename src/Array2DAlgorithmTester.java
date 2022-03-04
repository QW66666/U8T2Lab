import java.util.ArrayList;

public class Array2DAlgorithmTester {
    public static void main(String[] args) {
        String[][] words = {{"hi", "bye", "howl", "goo"}, {"time", "owl", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "o"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "ow"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "goo"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "map"));
        System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "gone"));



    }
    }

