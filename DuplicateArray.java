import java.util.HashSet;
public class DuplicateArray{
    public static void main(String[]args){

        int[]arr={1,2,3,2,};

        HashSet<Integer> set =new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
                break;
            }
            set.add(arr[i]);
        }
        
    }
}