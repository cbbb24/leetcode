class Solution {
/**    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0; i < rowIndex + 1; i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j < i + 1; j ++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(row);
        }
        return list.get(rowIndex);
    }
*/
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < rowIndex + 1; i++){
            list.add(0, 1);
            for(int j = 1; j < list.size() - 1; j++){
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }
}
