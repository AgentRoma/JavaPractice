import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        int factorial = 1;
        for(int i = 1;i<=number;i++){
            factorial = i * factorial;
        }
        System.out.println("Факториал "+ number + " равен "+ factorial);
    }
}