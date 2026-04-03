import java.util.HashMap;
import java.util.Map;
// max sum array with positve number k ;
public class Main2{
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
       int k = 15;
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for (int i =0;i<arr.length;i++){

            sum += arr[i];
            if (sum == k){
                maxLen = i + 1;
            }
            if(map.containsKey(sum-k)){
                maxLen = Math.max(maxLen,i-map.get(sum -k));
            }else {
                map.put(sum,i);
            }
        }
        System.out.println(maxLen);
    }
}
