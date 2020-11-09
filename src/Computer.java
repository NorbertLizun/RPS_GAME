import java.util.Random;

public class Computer implements Player {
    private int point;
    private final Random random = new Random();
    private int choice;

    public void setPoint(int point) {
        this.point = point;
    }

    public int getChoice() {
        return this.choice;
    }

   public int choice() {
        choice = random.nextInt(3) + 1;
        return choice;

   }
    public int addPoint() {
        point++;
        return point;
    }
    public int allPoints(){
        return point;
    }
//    public String name(Terminal terminal) {
//       return terminal.getBotName();
//    }
}
