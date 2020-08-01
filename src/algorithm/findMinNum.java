package algorithm;

import java.util.Scanner;

// 세 수 중 최소값 구하기
public class findMinNum {
    public static void Min3(int a, int b, int c) {
        int min = a;
        // 여러개 if는 switch case의 break 없는 것과 같음
        if (min > b) min = b;
        if (min > c) min = c; // else if 아님
        System.out.println("세 수의 최소값 : " + min);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a값 : ");
        int a = sc.nextInt();
        System.out.print("b값 : ");
        int b = sc.nextInt();
        System.out.print("c값 : ");
        int c = sc.nextInt();

        Min3(a, b, c);
    }
}
