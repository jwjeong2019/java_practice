package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber1 {
    static int num;
    static int count = 0;
    static List<Integer> numbers = new ArrayList<>();

    static void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        num = scanner.nextInt();
    }
    static void findPrimeNumber() {
        for (int n = 2; n < num; n++) {
            int i;
            for (i = 2; i < n; i++) {
                count++;
                if (n % i == 0) {
                    break;
                }
            }

            if (n == i) {
                numbers.add(n);
            }
        }
    }
    static void printResults() {
        System.out.println(numbers);
        System.out.println("나눗셈을 수행한 횟수: " + count);
    }

    public static void main(String[] args) {
        inputNumber();
        findPrimeNumber();
        printResults();
    }
}
