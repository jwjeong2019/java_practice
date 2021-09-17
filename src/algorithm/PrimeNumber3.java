package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber3 {
    static int num = 1000;
    static int count = 0;
    static int ptr = 0;
    static int[] prime = new int[500];

    static void init() {
        prime[ptr++] = 2;
        prime[ptr++] = 3;
    }
    static void iterateNumbers() {
        for (int n = 5; n < num; n += 2) {
            verifyPrime(n);
        }
    }
    static void verifyPrime(int n) {
        boolean flag = false;
        for (int i = 1; prime[i] * prime[i] <= n; i++) {
            count += 2;
            if (n % prime[i] == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            prime[ptr++] = n;
            count++;
        }
    }
    static void printResult() {
        List<Integer> streamPrime = Arrays.stream(prime).boxed().collect(Collectors.toList());
        System.out.println(streamPrime);
        System.out.println("곱셈과 나눗셈 수행 횟수: " + count);
    }

    public static void main(String[] args) {
        init();
        iterateNumbers();
        printResult();
    }
}
