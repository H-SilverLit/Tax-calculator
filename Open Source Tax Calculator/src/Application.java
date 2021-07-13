import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean notValid = true;
        System.out.println("Por favor introduce el importe de las ganancias en euros.");
        Scanner reader = new Scanner(System.in);
        // Estos son los rangos de ganancias que puedes tener. Los he colocado al azar, puedes editarlos a tu gusto. Recuerda que son rangos y que el límite superior de un rango debe coincidir con el límite inferior del siguiente.
        int minimumAmount = 0; // Esta es la cantidad mínima de dinero que aceptará la consola. Si introduces un número negativo te pedirá que introduzcas un número válido.
        int lowerLimit1 = 5000;
        int higherLimit1 = 25000;
        int lowerLimit2 = 25000;
        int higherLimit2 = 55000;
        int lowerLimit3 = 55000;
        int higherLimit3 = 200000;
        int lowerLimit4 = 200000;
        int higherLimit4 = 1000000;

        while (notValid) { // Puedes cambiar los impuestos de cualquiera de los siguientes tramos editando el número de la línea "float taxes = XF". Recuerda no borrar la F.
            try {
                long gains = Long.parseLong(reader.nextLine());
                if (gains > minimumAmount && gains < lowerLimit1) { // Este es el primer tramo de impuestos: de 0 a 5000 euros. En este tramo no calculará impuestos.
                    System.out.println("Tus ganancias están libres de impuestos.");
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                } else if (gains >= lowerLimit1 && gains < higherLimit1) { // Este es el segundo tramo de impuestos, de 5000 a 25000 euros. Aquí aplicará un 8% de impuestos.
                    float taxes = 8F;
                    System.out.println("Tus ganancias han sido de " + (gains - lowerLimit1) + " euros. Por tanto, con un " + taxes + "% de impuestos tendrás que pagar " + ((gains - lowerLimit1) * (taxes / 100)) + " euros.");
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                } else if (gains >= lowerLimit2 && gains < higherLimit2) { // Este es el tercer tramo de impuestos, de 25000 a 55000 euros. Aquí aplicará un 10% de impuestos.
                    float taxes = 10F;
                    System.out.println("Tus ganancias han sido de " + (gains - lowerLimit2) + " euros. Por tanto, con un " + taxes + "% de impuestos tendrás que pagar " + ((gains - lowerLimit2) * (taxes / 100)) + " euros.");
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                } else if (gains >= lowerLimit3 && gains < higherLimit3) { // Este es el cuarto tramo de impuestos, de 55000 a 200000 euros. Aquí aplicará un 12% de impuestos.
                    float taxes = 12F;
                    System.out.println("Tus ganancias han sido de " + (gains - lowerLimit3) + " euros. Por tanto, con un " + taxes + "% de impuestos tendrás que pagar " + ((gains - lowerLimit3) * (taxes / 100)) + " euros.");
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                } else if (gains >= lowerLimit4 && gains < higherLimit4) { // Este es el quinto tramo de impuestos, de 200000 a 1000000 de euros. Aquí aplicará un 15% de impuestos.
                    float taxes = 15F;
                    System.out.println("Tus ganancias han sido de " + (gains - lowerLimit4) + " euros. Por tanto, con un " + taxes + "% de impuestos tendrás que pagar " + ((gains - lowerLimit4) * (taxes / 100) + " euros."));
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                } else if (gains > higherLimit4) { // Este es el sexto y último tramo de impuestos, a partir de 1000000 de euros. Aquí aplicará un 17% de impuestos.
                    float taxes = 17F;
                    System.out.println("Tus ganancias han sido de " + (gains - higherLimit4) + " euros. Por tanto, con un " + taxes + "% de impuestos tendrás que pagar " + ((gains - higherLimit4) * (taxes / 100) + " euros."));
                    System.out.println("Introduce, si quieres, otra cantidad de dinero de la cual quieras calcular los impuestos.");

                }

            } catch (NumberFormatException e) { // Esta parte del código se asegura de que introduces números válidos en la consola.
                System.out.println("Por favor introduce un número válido.");
            }
        }
    }
}
