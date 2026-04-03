import java.util.HashMap;
import java.util.Map;
// subaarry max sum 0;
public class Main2{
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -2, -3, 3};
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for (int i =0;i<arr.length;i++){

            sum += arr[i];
            if (sum == 0){
                maxLen = i + 1;
            }
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen,i-map.get(sum));
            }else {
                map.put(sum,i);
            }
        }
        System.out.println(maxLen);
    }
}
