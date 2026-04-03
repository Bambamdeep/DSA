import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main1 {public static void main(String[] args){
// union of two sorted array with optimise way .
    // Brut fore we can loop throguh the set and add this into list and retun the list .

    int[] arr = {1,2,3,4,5,6}
            ;
    int [] arr2 = {2,3,5,6};
    int i = 0;
    int j =0;
    int len1 = arr.length;
    int len2 = arr2.length;
    List result = new ArrayList();
    List result1 = new ArrayList();
while (i < len1 &&   j < len2){
    if (arr[i]<= arr2[j]){
        if (result.isEmpty() || result.size()-1 !=arr[i]){
            result.add(arr[i]);
        }
        i++;
    }else {
        result.add(arr2[j]);
    }
    j++;
}
while(i < len1){
    if (result.size()-1 !=arr[i]){
        result.add(arr[i]);
    }
    i++;
}

    while(j < len2){
        if (result.size()-1 !=arr2[j]){
            result.add(arr2[j]);
        }
        j++;
    }

    System.out.println(result);
    System.out.println("max consicutive 1 ");
    int[] arr3 = {1,1,0,0,1,1,1};
    int count = 0;
    int max = Integer.MIN_VALUE;
    for (int x =0 ; x<arr3.length;x++){
        if (arr3[x]== 1){
            count++;
            max = Math.max(max,count);
        }else {
            count =0;
        }
    }
    System.out.println(max);
    // Find the number that appears once, and the other numbers twice
    int[] arr1 = {1,2,2,3,3,4,4};
    int count1 = 0;
    int j1 =0 ;
    for (int x = 0; x < arr1.length; x++ ){
        if (arr1[x] == arr[j1]){
            count++;
            
        }
        if(count == 1){
            System.out.println(arr[x] );
        }
    }
 }
}
