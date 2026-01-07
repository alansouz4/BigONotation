import static java.lang.IO.println;

public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            println("Resultado " + map.get(complement) +","+ i);
            return new int[]{map.get(complement), i};
        }
        println("Add " + nums[i] +","+ i);
        map.put(nums[i], i);
    }
    return new int[]{};
}

void main(String[] args) {
    twoSum(new int[]{3,2,4}, 6);
}