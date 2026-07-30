class Solution {
    public int[] topKFrequent(int[] nums, int k) {

         // Step 1: Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        // Step 3: Place elements into buckets based on frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int key = entry.getKey();
            int freq = entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        // Step 4: Collect top k frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {

                    result[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }

    
}
