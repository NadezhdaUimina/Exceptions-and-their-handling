package Homework_1;

import java.util.Arrays;
import java.util.Random;

/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных
 * массива, и возвращающий новый массив, каждый элемент которого равен разности
 * элементов двух входящих массивов в той же ячейке. Если длины массивов не
 * равны, необходимо как-то оповестить пользователя.
 * 
 * *Реализуйте метод, принимающий в качестве аргументов два целочисленных
 * массива, и возвращающий новый массив, каждый элемент которого равен частному
 * элементов двух входящих массивов в той же ячейке. Если длины массивов не
 * равны, необходимо как-то оповестить пользователя. Важно: При выполнении
 * метода единственное исключение, которое пользователь может увидеть -
 * RuntimeException, т.е. ваше.
 */
public class Program {
	public static void main(String[] args) {

		//task1();
		task2();

	}

	/**
	 * метод вывода результата 1-ой задачи
	 */
	static void task1() {
		int[] arr1 = generateArray();
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = generateArray();
		System.out.println(Arrays.toString(arr2));

		try {
			int[] result = differenceArray(arr1, arr2);
			System.out.println("Разница элементов двух массивов равна:");
			System.out.println(Arrays.toString(result));
			System.out.println();
		} catch (CustomArraySizeException e) {
			System.out.println(e.getMessage());
			System.out.printf(
					"Длина первого массива: %d\nДлина второго массива: %d\n",
					e.getLength1(), e.getLength2());
		}
	}

	/**
	 * метод вывода результата 2-ой задачи
	 */
	static void task2() {
		int[] arr1 = generateArray();
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = generateArray();
		System.out.println(Arrays.toString(arr2));

		try {
			int[] result = divideArray(arr1, arr2);
			System.out.println("Частное элементов двух массивов равно:");
			System.out.println(Arrays.toString(result));
			System.out.println();
		} catch (CustomArraySizeException e) {
			System.out.println(e.getMessage());
			System.out.printf(
					"Длина первого массива: %d\nДлина второго массива: %d\n",
					e.getLength1(), e.getLength2());
		}
	}

	/**
	 * метод генерации массива
	 * 
	 * @return сгенерированный массив
	 */
	static int[] generateArray() {
		Random rand = new Random();
		int[] arr = new int[rand.nextInt(2) + 4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
		}
		return arr;
	}

	/**
	 * метод, принимающий в качестве аргументов два целочисленных
	 * массива, и возвращающий новый массив, каждый элемент которого равен разности
	 * элементов двух входящих массивов в той же ячейке
	 * 
	 * @param arr1 1-ый сгенерованный массив
	 * @param arr2 2-oй сгенерованный массив
	 * @return результат вычисления
	 */
	static int[] differenceArray(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null)
			throw new NullPointerException("Оба массива должны существовать.");

		if (arr1.length != arr2.length)
			throw new CustomArraySizeException("Кол-во элементов массива должно быть одинаково.",
					arr1.length, arr2.length);
					
		int[] res = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			res[i] = arr1[i] - arr2[i];
		}
		return res;
	}

	/**
	 * Реализуйте метод, принимающий в качестве аргументов два целочисленных
	 * массива, и возвращающий новый массив, каждый элемент которого равен частному
	 * элементов двух входящих массивов в той же ячейке
	 * 
	 * @param arr1 1-ый сгенерованный массив
	 * @param arr2 2-oй сгенерованный массив
	 * @return результат вычисления
	 */
	static int[] divideArray(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null)
			throw new NullPointerException("Оба массива должны существовать.");

		if (arr1.length != arr2.length)
			throw new CustomArraySizeException("Кол-во элементов массива должно быть одинаково.",
					arr1.length, arr2.length);

		int[] res = new int[arr1.length];
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] == 0)
				throw new ArithmeticException("Делить на ноль нельзя");
			res[i] = arr1[i] / arr2[i];
		}
		return res;
	}

}

class CustomArraySizeException extends RuntimeException {

	int length1;
	int length2;

	public int getLength1() {
		return length1;
	}

	public int getLength2() {
		return length2;
	}

	public CustomArraySizeException(String message, int length1, int length2) {
		super(message);
		this.length1 = length1;
		this.length2 = length2;
	}
}