import java.util.Random;

public class Computer implements Player {
    private int point;
    Random random = new Random();


   public int choice() {
       int choice = random.nextInt(3) + 1;
       return choice;

   }
    public int addPoint() {
        point++;
        return point;
    }
    public int allPoints(){
        return addPoint();
    }
    public String name() {
       int botName = random.nextInt(10);
       return "C-" + botName + "PO";
    }
}
