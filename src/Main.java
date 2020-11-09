import java.util.*;
public class Main {
    public static void runner() {

    }
    public static void main(String[] args) {



        HumanPlayer player = new HumanPlayer();
        Computer pc = new Computer();
        RPSRules rules = new RPSRules();
        Terminal terminal = new Terminal();

        while (rules.getAgain()) {
            terminal.greeting();
            terminal.buttons();
            terminal.howManyGames();
            terminal.yourEnemy();

            while (!rules.getEnd()) {
                terminal.chooseGun();
                rules.whoWin(player, pc);
                terminal.vs(player, pc);
                terminal.winner(rules.getWinner());
                rules.gameTime(terminal);
                rules.counter();

            }

            terminal.score(player, pc);
            terminal.nextGameOrFinish();
            rules.newGameOrFinish(terminal, player, pc);

        }

    }

}
