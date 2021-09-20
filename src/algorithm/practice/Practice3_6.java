package algorithm.practice;

import java.util.Scanner;

public class Practice3_6 {
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
        int x = -1;
        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                for (int i = pc - 1; i > 0; i--) {  // 동일한 요소의 최소 인덱스
                    if (a[i] == key) {
                        pc = i;
                    }
                }
                return pc;
            } else if (a[pc] > key) {
                pr = pc - 1;
                if (a[pr] < key) {                  // key가 pc요소보다는 작고, (pc-1)요소보다 크면 삽입포인트
                    x = pc;
                }
            } else if (a[pc] < key) {
                pl = pc + 1;
                if (a[pl] > key) {                  // key가 pc요소보다는 크고, (pc+1)요소보다 작으면 삽입포인트
                    x = pl;
                }
            }
        } while (pl < pr);

        return a[n - 1] < key ? -n - 1 : -x - 1;    // 모든 요소가 key보다 작은가?
    }

    static void printResult(int key, int idx) {
        if (idx > -1) {
            System.out.println(key + "는 x[" + idx + "]요소에 있습니다.");
        } else {
            System.out.println("검색에 실패하였습니다.");
            System.out.println("삽입 포인트: " + idx);
        }
    }

    public static void main(String[] args) {
        int n = generateN();
        int key = generateKey();
        int[] data = generateData(n);
        int idx = binSearch(data, n, key);
        printResult(key, idx);
    }
}
