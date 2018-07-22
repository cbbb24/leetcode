class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(nums[0]);
        list.add(first);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        for(int i = 1; i < nums.length; i++){
            List<List<Integer>> newlist = new ArrayList<>();
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            for(List<Integer> temp : list){
                int count = map.get(nums[i]);
                for(int j = 0; j < temp.size() + 1; j++){
                    List<Integer> newtemp = new ArrayList<>(temp);
                    if(count > 1){
                        if(newtemp.get(j) == nums[i]){
                            count--;
                            continue;
                        }
                        else continue;
                    }
                    
                    newtemp.add(j, nums[i]);
                    newlist.add(newtemp);
                }
            }
            list = newlist;
        }
        return list;
    }
}
