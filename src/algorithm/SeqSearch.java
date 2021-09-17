package algorithm;

public class SeqSearch {
    static int[] seq;
    static int key;

    static void init() {
        seq = new int[]{3, 1, 9, 4, 6, 8};
        key = 5;
    }
    /**
     * 선형 검색
     *
     * */
    static int seqSearch() {
        int i = 0; // 0 ~ n-1
        int n = seq.length; // n: seq 길이
        while (true) {
            if (i == n) {
                return -1;
            }
            if (seq[i] == key) {
                return i;
            }
            i++;
        }
    }
    static void printResult(int idx) {
        if (idx == -1) {
            System.out.println("검색 실패하였습니다.");
            return;
        }
        System.out.println(key + "는 seq[" + idx + "] 요소입니다.");
    }

    public static void main(String[] args) {
        init();
        int index = seqSearch();
        printResult(index);
    }
}
