public class Task5 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Избегаем переполнения int

            if (nums[mid] == target) {
                return mid; // Найден target, возвращаем индекс
            } else if (nums[mid] < target) {
                left = mid + 1; // Ищем в правой части
            } else {
                right = mid - 1; // Ищем в левой части
            }
        }

        return left; // Позиция, куда вставить target
    }
}
