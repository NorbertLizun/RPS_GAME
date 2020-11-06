import java.util.Random;

public class Computer implements Player {
    private int point;
    private Random random = new Random();


   public int choice() {
       return random.nextInt(3) + 1;

   }
    public int addPoint() {
        point++;
        return point;
    }
    public int allPoints(){
        return point;
    }
    public String name() {
       int botName = random.nextInt(10);
       return "C-" + botName + "PO";
    }
}
