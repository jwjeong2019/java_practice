package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber2 {
    static int num;
    static int count = 0;
    static int ptr = 0;
    static int[] prime = new int[500];
    static List<Integer> primes = new ArrayList<>();

    static void init() {
        prime[ptr++] = 2;
    }
    static void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        num = scanner.nextInt();
    }
    static void iterateNumbers() {
        for (int n = 3; n < num; n += 2) {
            iteratePrime(n);
        }
    }
    static void iteratePrime(int n) {
        int i;
        for (i = 1; i < ptr; i++) {
            count++;
            if (n % prime[i] == 0) {
                break;
            }
        }

        if (ptr == i) {
            prime[ptr++] = n;
            primes.add(n);
        }
    }
    static void printResults() {
        System.out.println(primes);
        System.out.println("나눗셈을 수행한 횟수: " + count);
    }

    public static void main(String[] args) {
        init();
        inputNumber();
        iterateNumbers();
        printResults();
    }
}
