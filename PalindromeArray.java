public class PalindromeArray {
    public static void main(String[]args) {

        int[] arr = {1, 2, 3, 2, 1};
        int right = 0;
        int left = arr.length - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (arr[right] != arr[left]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }
}
