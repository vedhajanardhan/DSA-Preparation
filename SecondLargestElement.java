public class SecondLargestElement {
    public static void main (String[]args){

        int[]arr={3,7,2,9,5};
        int max=Integer.MIN_VALUE;
        int second=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }
            else if(arr[i]>second && arr[i]!=max ){
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}
