import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng đó");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int number;
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào giá trị số nguyên" + (i + 1) + ": ");
            number = scanner.nextInt();
            numbers[i] = number;
        }

        for (int s : numbers
        ) {
            System.out.print(s + "-");
        }
        System.out.println();

        System.out.println("Giá trị nhỏ nhất là: ");
        int min = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);

    }


}
