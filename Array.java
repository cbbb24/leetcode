public class Array {
    public static int max(int[] m){
       int tmp = m[0];
       for (int i = 1; i < m.length ; i = i + 1) {
           if (tmp < m[i]) {
               tmp = m[i];
           }
       }

       return tmp;

    }
    public static void main(String args[]){
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
