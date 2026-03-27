import java.util.HashSet;
public class PairSumUnsortedArray{
    public static void main(String[]args){

        int[]arr={4,1,3,2};
        int target=6;

        HashSet<Integer> set =new HashSet<>();

        boolean found =false;

        for(int i=0;i<arr.length;i++){
            int need =target-arr[i];

            if(set.contains(need)){
                found=true;
                break;
            }
            set.add(arr[i]);
        }
        System.out.println(found);
    }
}
