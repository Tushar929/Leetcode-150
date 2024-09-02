import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { i, map.get(diff) };
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum_1 solution = new TwoSum_1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        if (result != null) {
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
