import java.util.HashMap;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1,};
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }
}
