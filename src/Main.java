import java.util.*;
public class Main {
    public static void main(String[] args) {

        HumanPlayer player = new HumanPlayer();
        Computer pc = new Computer();
        RPSRules rules = new RPSRules();
        Terminal terminal = new Terminal();


        terminal.greeting(player);
        terminal.yourEnemy(pc);
        terminal.chooseGun();
//        terminal.vs(player,pc);
        rules.whoWin(player,pc);








    }
}
