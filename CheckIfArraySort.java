public class CheckIfArraySort{
    public static void main(String[]args) {

        int[] arr = {1, 3, 2};
        boolean isSorted = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}