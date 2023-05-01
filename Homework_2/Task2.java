// Если необходимо, исправьте данный код
 
// try {
//     int d = 0;
//     double catchedRes1 = intArray[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
//  } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
//  }

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = { 2, 4, 6, 7, 7, 5, 3, 7, 8 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching IndexOutOfBoundsException: " + e);
        }
    }

}
