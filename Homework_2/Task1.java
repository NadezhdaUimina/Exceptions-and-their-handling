import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 * (типа float), и возвращает введенное значение. Ввод текста вместо числа не
 * должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */

public class Task1 {

    public static void main(String[] args) {
        float inputData = task1();
        System.out.println(inputData);
    }
    public static float task1() {
        Scanner scanner = new Scanner(System.in);
        
		float inputData = 0;

		while (inputData == 0) {
			try {
				System.out.print("Введите дробное число: ");
				inputData = Float.parseFloat(scanner.nextLine());
				
			} catch (NumberFormatException e) {
				System.out.println("Введено неверное значение, попробуйте еще раз.");
			}
        }
        scanner.close();
        return inputData;
    }
}
