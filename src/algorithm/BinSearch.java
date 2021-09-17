package algorithm;

public class BinSearch {
    static final int DATA_SIZE = 10;

    static int pl;
    static int pr;
    static int pc;
    static int key;
    static int[] data;

    static void init() {
        pl = 0;
        pr = DATA_SIZE - 1;
        key = 4;
        data = new int[]{3, 4, 7, 10, 12, 16, 19, 22, 27, 33}; // 오름차순 정렬된 배열
    }
    static int binarySearch() {
        do {
            pc = (pr + pl) / 2;
            if (data[pc] == key) {
                return pc;
            } else if (data[pc] > key) {
                pr = pc - 1;
            } else if (data[pc] < key) {
                pl = pc + 1;
            }
        } while (pl <= pr);

        return -1;
    }
    static void printResult(int index) {
        if (index == -1) {
            System.out.println("찾지 못했습니다.");
            return;
        }
        System.out.println("찾았습니다.");
    }

    public static void main(String[] args) {
        init();
        int index = binarySearch();
        printResult(index);
    }
}
