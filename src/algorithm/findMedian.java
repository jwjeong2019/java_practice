package algorithm;

import java.util.Scanner;

// 세 정수의 중앙값 구하기
public class findMedian {
    public static void Median(int a, int b, int c) {
        int mid = 0;
        if (a > b) {
            if (b > c) mid = b;
            else if (a > c) mid = c;
            else mid = a;
        } else {
            if (a > c) mid = a;
            else if (b > c) mid = c;
            else mid =b;
        }
        System.out.println("중앙값은 " + mid);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a값 : ");
        int a = sc.nextInt();
        System.out.print("b값 : ");
        int b = sc.nextInt();
        System.out.print("c값 : ");
        int c = sc.nextInt();

        Median(a, b, c);
    }
}
