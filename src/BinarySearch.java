public class BinarySearch {
    public static int findPosition(int target, int[] array, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left)/2;
        if (array[mid] == target) return mid;
        if (target > array[mid]) {
            return findPosition(target, array, mid + 1, right);
        } else {
            return findPosition(target, array, left, mid - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = findPosition(2, arr, 0,4);
        System.out.println(result);
    }
}
