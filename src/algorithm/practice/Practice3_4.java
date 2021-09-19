package algorithm.practice;

import java.util.Scanner;

/**
 * @issue https://stackoverflow.com/questions/22157849/java-lang-outofmemoryerror-java-heap-space-stringbuffer
 * */
public class Practice3_4 {
    static int generateN(Scanner sc) {
        System.out.print("요솟 수: ");
        int n = sc.nextInt();
        return n;
    }
    static int generateKey(Scanner sc) {
        System.out.print("찾을 키: ");
        int key = sc.nextInt();
        return key;
    }
    static int[] generateSeq(Scanner sc, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
    static void run(int[] seq, int n, int key) {
        printRow1(n);
        printRow2(n);
        int idx = binSearch(seq, n, key);
        printResult(idx, key);
    }
    static void printRow1(int n) {
        String str = "   |";
        for (int i = 0; i < n; i++) {
            str += "  " + i;
        }
        System.out.println(str);
    }
    static void printRow2(int n) {
        String str = "---+";
        for (int i = 0; i < n; i++) {
            str += "----";
        }
        System.out.println(str);
    }
    static int binSearch(int[] seq, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        while (true) {
            int pc = (pl + pr) / 2;

            printRow3(seq, n, pl, pr, pc);
            if (pl > pr) {
                break;
            } else {
                if (seq[pc] == key) {
                    return pc;
                } else if (seq[pc] > key) {
                    pr = pc - 1;
                } else if (seq[pc] < key) {
                    pl = pc + 1;
                }
            }
        }
        return -1;
    }
    static void printRow3(int[] seq, int n, int pl, int pr, int pc) {
        String str = "   |";
        for (int i = pl; i <= pr; i++) {
            if (i == pl) str += "  <-";
            else if (i == pr) str += " ->";
            else if (i == pc) str += " +";
            else str += "   ";
        }
        str += "\n" + pc + "  |";
        for (int i = 0; i < n; i++) {
            str += "  " + seq[i];
        }
        System.out.println(str);
    }
    static void printResult(int idx, int key) {
        System.out.println(key + "는 x[" + idx + "]에 있습니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = generateN(scanner);
        int key = generateKey(scanner);
        int[] seq = generateSeq(scanner, n);
        run(seq, n, key);
    }
}
