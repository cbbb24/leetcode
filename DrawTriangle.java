public class DrawTriangle {
    public static void drawTriangle(int N){
        int x = 1;
        int y = 2;
        while(y < N + 2){
            while(x < y){
                if(x == y - 1){
                    System.out.println("*" + " " + x);
                }else{
                    System.out.print("*");
                }
                x = x + 1;
            }
            y = y + 1;
            x = 1;
        }
    }
    public static void main(String args[]){
        drawTriangle(10);
    }

}
