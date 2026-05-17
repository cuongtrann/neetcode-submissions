class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // value -> frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // min heap theo frequency
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b)
            );

        // giữ size heap <= k
        for (int num : map.keySet()) {

            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];

        // lấy từ cuối để đúng thứ tự frequency giảm dần
        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll();
        }

        return result;
    }
}