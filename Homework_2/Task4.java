import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит
 * пустую строку. Пользователю должно показаться сообщение, что пустые строки
 * вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        try {
            task4();
        } catch (Exception e) {
            System.out.println("Пустые строки вводить нельзя!");
        }
    }

    public static void task4() throws Exception {
        String inputData = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите строку: ");
        inputData = scanner.nextLine();
        if (inputData.isEmpty()) {
            throw new Exception();
        } else {
            System.out.println("Программа работает.");
        }
        scanner.close();
    }

}
