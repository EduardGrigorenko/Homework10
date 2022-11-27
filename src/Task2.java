import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму денег");
        double price = scanner.nextDouble();
        System.out.println("Введите под какой процент хотите положить деньги");
        double procent = scanner.nextDouble();
        System.out.println("Введите на сколько лет вы хотите положить деньги");
        double year = scanner.nextDouble();
        double procent_valea = price * procent /100;
        double a =  price + procent_valea * year;

        for (double i = 0; i < a ; i ++) {
            System.out.println("Вот сколько денег у вас на депозите:  " + i +"$" );
             }
        }
    }

