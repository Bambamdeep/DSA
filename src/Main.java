//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // stock sell price .
     int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
     int minPrice = Integer.MAX_VALUE;
     int maxProfit = 0;
     for (int i =0 ; i< arr.length;i++){
         if (arr[i]<minPrice){
             minPrice = arr[i];
         }else {
             int profit = arr[i] - minPrice;
             if(profit > maxProfit){
                 maxProfit = profit;
             }
         }
        }//System.out.println(maxProfit);
     int currentSum = 0;
     int maxSum = Integer.MIN_VALUE;
      for (int i =0 ; i< arr.length;i++){
          currentSum= Math.max(currentSum,currentSum+arr[i]);
          maxSum = Math.max(maxSum,currentSum);
      }System.out.println(maxSum);
      System.out.println("--------------------------------------------------------------");

      int[] arr1 ={2,1,5,1,3,2};
      int k=3;
      int sum =0 ;
      int maxSum1 =0;
      for (int i =0 ; i<k;i++){
          sum+=arr1[i];
          maxSum1 = sum ;
      }for (int i = k; i < arr1.length; i++){
           sum =  sum + arr1[i] - arr1[i-k];
          maxSum1 =Math.max(maxSum1 ,sum);
        }
System.out.println(maxSum1);

        }
    }
