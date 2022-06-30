package codiliy;

import java.util.*;

public class Codility {

    public static int solution(int[] A){
        int N = A.length;
        int i;
        System.out.println("Solution ");
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                System.out.println("a*****************"+a);

                set.add(a);
            }
        }
        for ( i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                System.out.println("i*****************"+i);
                return i;
            }
        }
    return i;
    }

    public static  int binaryGap(int N){
        //convert to binary
        String binary = Integer.toBinaryString(N);
        System.out.println("binary value "+binary +" binary lenght "+(binary.length()-1));
        LinkedList<Integer> gaps = new LinkedList<>();
        int countGap = 0;
        int j = 0;

        for (int i=1; i<binary.length()-1; i++){

            if(binary.charAt(i) =='0'){
                countGap++;
            }else{
                gaps.add(j, countGap);
                j++;
                countGap = 0;
                System.out.println("Gaps  0 "+gaps);
            }
        }
        gaps.add(j, countGap);
        System.out.println("Gaps  1 "+gaps);
        if (binary.charAt(binary.length() - 1) == '0') {
            gaps.set(gaps.size() - 1, 0);
            System.out.println("Gaps  2 "+gaps);
            System.out.println("Gaps  size "+(gaps.size() - 1));
        }
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(gaps);
        System.out.println("Last Gaps "+gaps);
        return gaps.getLast();
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
//       solution(A);
        binaryGap(32);

    }
}
