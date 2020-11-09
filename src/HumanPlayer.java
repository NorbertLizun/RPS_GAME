import java.util.Scanner;

public class HumanPlayer implements Player {
    private int point;
    private final Scanner scanner = new Scanner(System.in);
    private int choice;

    public void setPoint(int point) {
        this.point = point;
    }

    public int getChoice() {
        return this.choice;
    }

    public int choice() {
        choice = scanner.nextInt();
        if (choice < 1 || choice > 3) {
            System.out.println("This weapon is not in your inventory, please try again ;)");
            choice();
        }
        return choice;
    }

    public int addPoint(){
        point++;
        return point;
    }
    public int allPoints(){
        return point;
    }
//    public String name(Terminal terminal){
//        return terminal.getPlayerName();
//    }
}
