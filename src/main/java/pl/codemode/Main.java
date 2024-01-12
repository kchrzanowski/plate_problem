package pl.codemode;

public class Main {
    public static void main(String[] args) {
        var plate = PlateUtils.generate(6, 36);
        System.out.println(plate);
    }
}