import java.util.Scanner;

public class CheckValues {
    static final Scanner sc = new Scanner(System.in);

    public static int enteroCorrecto(String dato, int minInclusive, int maxInclusive) {
        int num = 0;
        boolean datoOk = false;

        while (!datoOk) {
            System.out.println(dato);
            String input = sc.nextLine();
            try {
                num = Integer.parseInt(input);
                if (num >= minInclusive && num <= maxInclusive) {
                    datoOk = true;
                } else {
                    System.out.println("El valor debe estar entre " + minInclusive + " y " + maxInclusive);
                }
            } catch (NumberFormatException exception) {
                System.out.println("Debe introducir un número válido.");
            }
        }
        return num;
    }

    public static double doubleCorrecto(String dato, double minInclusive, double maxInclusive) {
        double num = 0;
        boolean datoOk = false;

        while (!datoOk) {
            System.out.println(dato);
            String input = sc.nextLine();
            try {
                num = Double.parseDouble(input);
                if (num >= minInclusive && num <= maxInclusive) {
                    datoOk = true;
                } else {
                    System.out.println("El valor debe estar entre " + minInclusive + " y " + maxInclusive);
                }
            } catch (NumberFormatException exception) {
                System.out.println("Debe introducir un número válido.");
            }
        }
        return num;
    }
    public static void cerrarScanner() {
        sc.close();
    }
}
