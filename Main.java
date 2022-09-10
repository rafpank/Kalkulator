import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz jakie dzialanie chcesz przeprowadzic?");
        System.out.println(" 1 - Dodawanie \n 2 - Odejmowanie \n 3 - Mnozenie \n 4 - Dzielenie");
        int metchodChosen = scanner.nextInt();
          System.out.println("Wpisz pierwsza liczbe");
        int x = scanner.nextInt();
        System.out.println("Wpisz kolejna liczbe");
        int y = scanner.nextInt();


        switch (metchodChosen){
            case 1:
                System.out.println(calculator.add(x,y));
                System.out.println("Suma to: "+calculator.add(x,y));
                break;
            case 2:
                System.out.println(calculator.subtraction(x,y));
                System.out.println("Roznica to: "+calculator.subtraction(x,y));
                break;
            case 3:
                System.out.println(calculator.multiplication(x,y));
                System.out.println("Iloczyn to: "+calculator.multiplication(x,y));
                break;
            case 4:
                System.out.println(calculator.division(x,y));
                System.out.println("Iloraz to: "+calculator.division(x,y));
                break;
            default:
                System.out.println("Nie znaleziono metody");
        }

    }

}
