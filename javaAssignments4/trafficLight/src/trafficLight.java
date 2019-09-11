public class trafficLight  {
    public static void main(String[] args)  {
        Thread t1 = new Thread(new lightColors(),"t1");
        t1.start();
    }
}

