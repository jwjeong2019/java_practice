package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeqSearchSen {
    static final int SEQ_LENGTH = 6;

    static int[] seq = new int[SEQ_LENGTH + 1];
    static int key;
    static int index;

    static void init() {
        for (int i = 0; i < SEQ_LENGTH; i++) {
            seq[i] = (int) (Math.random() * 10);
        }
        key = 4;
    }
    static void seqSearchSen() {
        int i = 0;
        int n = SEQ_LENGTH;

        seq[n] = key;

        while (true) {
            if (seq[i] == key) {
                break;
            }
            i++;
        }
        index = i == n ? -1 : i;
    }
    static void printResult() {
        List<Integer> streamSeq = Arrays.stream(seq).boxed().collect(Collectors.toList());
        System.out.println("배열: " + streamSeq);

        if (index == -1) {
            System.out.println("검색에 실패하였습니다.");
            return;
        }
        System.out.println(key + "는 seq[" + index + "] 요소입니다.");
    }

    public static void main(String[] args) {
        init();
        seqSearchSen();
        printResult();
    }
}
