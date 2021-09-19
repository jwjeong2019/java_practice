package algorithm.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Practice3_3
 */
public class Practice3_3 {
    static int generateN() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("요소수: ");
        int n = scanner.nextInt();
        // scanner.close();

        return n;
    }
    static int generateKey() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("키: ");
        int key = scanner.nextInt();
        // scanner.close();

        return key;
    }
    static int[] generateSeq(int n, int key) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n배열 요소를 입력하세요.\n예:1 3 5 7 9");

        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        
        return a;
    }
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int searchNumber = 0;
        for(int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[searchNumber++] = i;
            }
        }
        return searchNumber;
    }
    static void printResult(int[] idx, int num) {
        List<Integer> listIdx = Arrays
                .stream(idx)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> filteredListIdx = listIdx
                .stream()
                .filter(elem -> listIdx.indexOf(elem) < num)
                .collect(Collectors.toList());
        
        System.out.println("\n일치하는 수: " + num);
        System.out.print("idx: " + filteredListIdx);
    }
    public static void main(String[] args) {
        // n: 8, key: 9, a: [1, 9, 2, 9, 4, 6, 7, 9]
        int n = generateN();
        int key = generateKey();
        int[] seq = generateSeq(n, key);
        int[] idx = new int[n];
        int searchNumber = searchIdx(seq, n, key, idx);
        printResult(idx, searchNumber);
    }
}