//solution taken from coolmike

class Solution {
    public int[] frequencySort(int[] nums) {
        // create hash map of num->freq
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // creates an arraylist of the numbers in the hashmap
        List<Integer> list = new ArrayList<>(map.keySet());
        // sort using custom comparitor
        // compares - 
        // are they the same freq?
        // if yes, return b-a, returns - when a < b, so in this case when a > b, descending order instead of ascending
        Collections.sort(list, (a, b) -> {
            return (map.get(a) == map.get(b))? b - a : map.get(a) - map.get(b);
        });
            
        int[] res = new int[nums.length];
        int i = 0;
        for (int num : list) {
            for (int j = 0; j < map.get(num); j++) {
                res[i++] = num;
            }
        }
        return res;
    }
}