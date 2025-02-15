import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s;
        boolean a = true;
        int n = 0;
        int[] nums = new int[n];
        int res;
        int i;
        int target;

        while (a) {
            System.out.println("Выберите задание (1-9), 0 чтобы выйти.");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    a = false;
                case 1:
                    System.out.println("Введите число палиндром:");
                    int x = scanner.nextInt();
                    if (Task1.isPalindrome(x)) {
                        System.out.println(x + " является палиндромом.");
                    } else {
                        System.out.println(x + " не является палиндромом.");
                    }
                    break;
                case 2:
                    System.out.print("Введите количество элементов в массиве: ");
                    n = scanner.nextInt();

                    System.out.println("Введите элементы массива:");
                    for (i = 0; i < n; i++) {
                        nums[i] = scanner.nextInt();
                    }

                    System.out.print("Введите целевое число: ");
                    target = scanner.nextInt();

                    int[] result = Task2.twoSum(nums, target);

                    System.out.println("Индексы: [" + result[0] + ", " + result[1] + "]");

                    break;
                case 3:
                    System.out.print("Введите количество элементов в массиве: ");
                    n = scanner.nextInt();

                    nums = new int[n];

                    System.out.println("Введите элементы массива:");
                    for (i = 0; i < n; i++) {
                        nums[i] = scanner.nextInt();
                    }

                    res = Task3.singleNumber(nums);
                    System.out.println("Число, которое встречается один раз: " + res);

                    break;
                case 4:
                    do {
                        System.out.print("Введите количество элементов в массиве (должно быть > 0): ");
                        n = scanner.nextInt();
                        if (n <= 0) {
                            System.out.println("Ошибка: массив должен содержать хотя бы один элемент.");
                        }
                    } while (n <= 0);

                    nums = new int[n];

                    System.out.println("Введите элементы массива:");
                    for (i = 0; i < n; i++) {
                        nums[i] = scanner.nextInt();
                    }

                    boolean hasDuplicates = Task4.containsDuplicate(nums);
                    System.out.println("Содержит ли массив дубликаты? " + hasDuplicates);
                    break;
                case 5:
                    do {
                        System.out.print("Введите количество элементов в массиве (должно быть > 0): ");
                        n = scanner.nextInt();
                        if (n <= 0) {
                            System.out.println("Ошибка: массив должен содержать хотя бы один элемент.");
                        }
                    } while (n <= 0);

                    nums = new int[n];

                    System.out.println("Введите элементы отсортированного массива:");
                    for (i = 0; i < n; i++) {
                        nums[i] = scanner.nextInt();
                    }

                    System.out.print("Введите целевое значение: ");
                    target = scanner.nextInt();

                    int index = Task5.searchInsert(nums, target);
                    System.out.println("Индекс для вставки: " + index);
                    break;
                case 6:
                    do {
                        System.out.print("Введите количество элементов в массиве (должно быть > 0): ");
                        n = scanner.nextInt();
                        if (n <= 0) {
                            System.out.println("Ошибка: массив должен содержать хотя бы один элемент.");
                        }
                    } while (n <= 0);

                    nums = new int[n];

                    System.out.println("Введите элементы массива:");
                    for (i = 0; i < n; i++) {
                        nums[i] = scanner.nextInt();
                    }

                    int maxSum = Task6.maxSubArray(nums);
                    System.out.println("Максимальная сумма подмассива: " + maxSum);
                    break;
                case 7:
                    do {
                        System.out.print("Введите количество элементов в массиве (1 <= n <= 10): ");
                        n = scanner.nextInt();
                        if (n < 1 || n > 10) {
                            System.out.println("Ошибка: количество элементов должно быть от 1 до 10.");
                        }
                    } while (n < 1 || n > 10);

                    nums = new int[n];

                    System.out.println("Введите " + n + " уникальных элементов:");
                    for (i = 0; i < n; i++) {
                        nums[i] = scanner.nextInt();
                    }

                    List<List<Integer>> subsets = Task7.subsets(nums);

                    System.out.println("Все подмножества:");
                    System.out.println(subsets);
                    break;
                case 8:
                    System.out.print("Введите строку из скобок: ");
                    s = scanner.nextLine();

                    boolean val = Task8.isValid(s);
                    System.out.println("Строка валидна: " + val);
                    break;
                case 9:
                    System.out.print("Введите строку из скобок: ");
                    s = scanner.nextLine();

                    res = Task9.longestValidParentheses(s);
                    System.out.println("Длина самой длинной валидной подстроки: " + res);
                    break;
            }
        }
    }
}
