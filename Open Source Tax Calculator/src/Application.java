import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean notValid = true;
        System.out.println("Por favor introduce el importe de las ganancias en euros.");
        Scanner reader = new Scanner(System.in);
        int minimumAmount = 0;
        int lowerLimit1 = 5000;
        int higherLimit1 = 25000;
        int lowerLimit2 = 25000;
        int higherLimit2 = 55000;
        int lowerLimit3 = 55000;
        int higherLimit3 = 200000;
        int lowerLimit4 = 200000;
        int higherLimit4 = 1000000;

        while (notValid) {
            try {
                long gains = Long.parseLong(reader.nextLine());
                if (gains > minimumAmount && gains < lowerLimit1) {
                    System.out.println("Tus ganancias están libres de impuestos.");
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                } else if (gains >= lowerLimit1 && gains < higherLimit1) {
                    float taxes = 8F;
                    System.out.println("Tus ganancias han sido de " + (gains - lowerLimit1) + " euros. Por tanto, con un " + taxes + "% de impuestos tendrás que pagar " + ((gains - lowerLimit1) * (taxes / 100)) + " euros.");
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                } else if (gains >= lowerLimit2 && gains < higherLimit2) {
                    float taxes = 10F;
                    System.out.println("Tus ganancias han sido de " + (gains - lowerLimit2) + " euros. Por tanto, con un " + taxes + "% de impuestos tendrás que pagar " + ((gains - lowerLimit2) * (taxes / 100)) + " euros.");
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                } else if (gains >= lowerLimit3 && gains < higherLimit3) {
                    float taxes = 12F;
                    System.out.println("Tus ganancias han sido de " + (gains - lowerLimit3) + " euros. Por tanto, con un " + taxes + "% de impuestos tendrás que pagar " + ((gains - lowerLimit3) * (taxes / 100)) + " euros.");
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                } else if (gains >= lowerLimit4 && gains < higherLimit4) {
                    float taxes = 15F;
                    System.out.println("Tus ganancias han sido de " + (gains - lowerLimit4) + " euros. Por tanto, con un " + taxes + "% de impuestos tendrás que pagar " + ((gains - lowerLimit4) * (taxes / 100) + " euros."));
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                } else if (gains > higherLimit4) {
                    float taxes = 17F;
                    System.out.println("Tus ganancias han sido de " + (gains - higherLimit4) + " euros. Por tanto, con un " + taxes + "% de impuestos tendrás que pagar " + ((gains - higherLimit4) * (taxes / 100) + " euros."));
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                }

            } catch (NumberFormatException e) {
                System.out.println("Por favor introduce un número válido.");
            }
        }
    }
}