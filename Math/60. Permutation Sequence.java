class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> num = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= n; i++){
            num.add(i);
        }
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for(int i = 1; i <= n; i++){
            fact[i] = fact[i - 1] * i;
        }
        k--;
        for(int i = 1; i <= n; i++){
            int index = k / fact[n - i];
            result.append(String.valueOf(num.get(index)));
            k -= index * fact[n - i];
            num.remove(index);
        }
        return result.toString();
    }
}
