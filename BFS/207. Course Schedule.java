class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses == 0) return true;
        int[] indegree = new int[numCourses];
        int[] order = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < prerequisites.length; i ++){
            indegree[prerequisites[i][0]]++;            
        }
        int index = 0;
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                order[index++] = i;  
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
           int course = queue.poll();
            for(int i = 0; i < prerequisites.length; i++){
                if(course == prerequisites[i][1]){
                    indegree[prerequisites[i][0]]--;
                    if(indegree[prerequisites[i][0]] == 0){
                        order[index++] = prerequisites[i][0];
                        queue.add(prerequisites[i][0]);
                    }
                }
            }
        }
        return index == numCourses ? true : false;
    }
}
