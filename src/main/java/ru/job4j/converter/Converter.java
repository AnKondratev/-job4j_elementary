package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        float inDollar = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(180);
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("140 rubles are 2. Test result : " + passedDollar);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
