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

        for (int i = 0; i < 10; i++) {
            rules.whoWin(player, pc);
            terminal.vs(player, pc);
            terminal.winner(rules.getWinner());
        }
        terminal.score(player,pc);











    }
}
