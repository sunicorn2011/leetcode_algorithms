import java.util.*;

public class N986 {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int []> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < A.length && j < B.length){
            if(A[i][1] < B[j][0]){
                i++;
            }else if(A[i][0] > B[j][1]){
                j++;
            }else if(A[i][1] > B[j][1]){
                int tmp = Math.max(A[i][0], B[j][0]);
                res.add(new int[]{tmp, B[j][1]});
                j++;
            }else{
                int tmp = Math.max(A[i][0], B[j][0]);
                res.add((new int[]{tmp, A[i][1]}));
                i++;
            }
        }

        int[][] result = new int[res.size()][2];
        for (int x = 0; x < res.size(); x++) {
            result[x] = res.get(x);
        }
        return result;

    }
}
