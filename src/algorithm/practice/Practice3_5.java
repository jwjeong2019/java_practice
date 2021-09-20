package algorithm.practice;

import java.util.Scanner;

public class Practice3_5 {
    static int generateN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수: ");
        return scanner.nextInt();
    }
    static int generateKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("찾을 키: ");
        return scanner.nextInt();
    }
    static int[] generateData(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }
        return data;
    }
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                for (int i = pc - 1; i > 0; i--) {
                    if (a[i] == key) {
                        pc = i;
                    }
                }
                return pc;
            } else if (a[pc] > key) {
                pr = pc - 1;
            } else if (a[pc] < key) {
                pl = pc + 1;
            }
        } while (pl < pr);

        return -1;
    }
    static void printResult(int key, int idx) {
        System.out.println(key + "는 x[" + idx + "]요소에 있습니다.");
    }

    public static void main(String[] args) {
        int n = generateN();
        int key = generateKey();
        int[] data = generateData(n);
        int idx = binSearch(data, n, key);
        printResult(key, idx);
    }
}
