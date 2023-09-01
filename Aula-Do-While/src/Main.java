import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static double ConverteCelcius(double realTemp) {
        double fahrenheit = ((realTemp * 9) / 5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double realTemp = 0;
        String realChoise = "s";
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double Temp = sc.nextDouble();
            realTemp = Temp;
            sc.nextLine();
            System.out.println(ConverteCelcius(realTemp));
            System.out.print("Deseja repetir (s/n)? ");
            String Choise = sc.nextLine();
            realChoise = Choise;
        } while (Objects.equals(realChoise, "s"));
        sc.close();
    }
}