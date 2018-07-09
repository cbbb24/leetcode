public class Hello {
    public int weightInPounds;
    /** Constructor */
    public Hello(int w){
        weightInPounds = w;
    }
    public void makeNoise(){
        if (weightInPounds < 10){
            System.out.println("yip!");
        }else if (weightInPounds < 30){
            System.out.println("bark!");
        }else {
            System.out.println("wooof!");

        }

    }
}
