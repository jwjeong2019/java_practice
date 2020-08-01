package algorithm;
import java.util.Scanner;

// 세 정수의 최댓값 구하기
public class findMaxNum {
    // V1
    static void Max3(Scanner s) {
        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = s.nextInt();
        System.out.print("b의 값 : ");
        int b = s.nextInt();
        System.out.print("c의 값 : ");
        int c = s.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.printf("최대값은 %d입니다.", max);
    }
    // V2
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        else if (c > max) max = c;
        return max;
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        Max3(s);
        System.out.println();
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(3,2,2) = " + max3(3,2,2));
        System.out.println("max3(3,1,2) = " + max3(3,1,2));
        System.out.println("max3(3,2,3) = " + max3(3,2,3));
        System.out.println("max3(2,2,3) = " + max3(2,2,3));
        System.out.println("max3(1,3,2) = " + max3(1,3,2));
        System.out.println("max3(3,3,3) = " + max3(3,3,3));
        System.out.println("max3(1,2,3) = " + max3(1,2,3));
    }
}
