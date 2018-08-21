class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> nums;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        nums = new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else{
            nums.add(val);
            map.put(val, nums.size() - 1);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }else{
            int loc = map.get(val);
            int last = nums.get(nums.size() - 1);
            if(loc < nums.size() - 1){
                nums.set(loc, last);
                map.put(last, loc);
            }
            nums.remove(nums.size() - 1);
            map.remove(val);
            return true;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        return nums.get(rand.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
