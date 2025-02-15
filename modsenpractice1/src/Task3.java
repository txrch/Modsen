public class Task3 {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR всех чисел
        }
        return result; // Останется единственное число без пары
    }
}
