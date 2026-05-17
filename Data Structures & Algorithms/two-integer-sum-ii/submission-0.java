class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (pos.get(target - numbers[i]) != null) {
                return new int[] {pos.get(target - numbers[i]) + 1, i + 1};
            }
            pos.put(numbers[i], i);
        }
        return new int[2];
    }
}
