package algorithm.practice;

public class Practice3_2 {
    static final int SEQ_SIZE = 7;
    static int key;
    static int[] seq = new int[SEQ_SIZE + 1];

    static void init() {
        key = 3;
        seq[0] = 6; seq[1] = 4; seq[2] = 3; seq[3] = 2; seq[4] = 1; seq[5] = 9; seq[6] = 8;
    }
    static int seqSearchSen() {
        int i = 0;
        seq[SEQ_SIZE] = key;
        int n = SEQ_SIZE + 1;

        printTop();
        for (int value : seq
             ) {
            printPointer(i);
            printRow(i);
            if (value == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }
    static void printTop() {
        String str = "   |  0  1  2  3  4  5  6";
        str += "\n---+-------------------------";
        System.out.println(str);
    }
    static void printPointer(int index) {
        String blank = "  ";
        for (int j = 0; j < index; j++) {
            blank += "   ";
        }
        String pointer = blank + "*";
        System.out.println("   |" + pointer);
    }
    static void printRow(int index) {
        System.out.println("  " + index + "|  6  4  3  2  1  9  8");
    }
    static void printResult(int index) {
        if (index == -1) {
            System.out.println("찾지 못했습니다.");
            return;
        }
        System.out.println(key + "는 x[" + index + "]에 있습니다.");
    }

    public static void main(String[] args) {
        init();
        int index = seqSearchSen();
        printResult(index);
    }
}
