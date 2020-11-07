import java.util.Random;
import java.util.Scanner;

public class Terminal {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private String playerName;
    private String botName;


    public String getPlayerName() {
        return this.playerName;
    }

    public String getBotName() {
        return this.botName;
    }



    public void greeting(HumanPlayer humanPlayer) {
        System.out.println("WELCOME IN RPS GAME!");
        System.out.println("What is you name?");
        String name = playerName();
        System.out.println("Hello " + name + " Let's play!");

    }

    public void yourEnemy(Computer computer) {
        System.out.println("Your opponent " + pcName());
        System.out.println("Prepare to Battle!");
    }

    public void chooseGun() {
        System.out.println("Choose your weapon:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
    }

    public void vs(HumanPlayer humanPlayer, Computer computer) {
        int playerChoice = humanPlayer.getChoice();
        int pcChoice = computer.getChoice();
        String player;
        String pc;

        if (playerChoice == 1) {
            player = "ROCK";
        } else if (playerChoice == 2) {
            player = "PAPER";
        } else {
            player = "SCISSORS";
        }

        if (pcChoice == 1) {
            pc = "ROCK";
        } else if (pcChoice == 2) {
            pc = "PAPER";
        } else {
            pc = "SCISSORS";
        }

        System.out.println(player + " VS " + pc);
    }

    public void winner(int winner) {
        if (winner == 1) {
            System.out.println("REMIS");
        } else if (winner == 3) {
            System.out.println(playerName + " WYGRAŁ");
        } else if (winner == 2)  {
            System.out.println(botName + " WIN");
        }

    }

    public String playerName() {
        playerName = scanner.next();
        return playerName;
    }

    public String pcName() {
        int botNumberName = random.nextInt(10);
        botName = "C-" + botNumberName + "PO";
        return botName;
    }

    public void score(HumanPlayer humanPlayer, Computer computer) {
        System.out.println(playerName + " points: " + humanPlayer.allPoints());
        System.out.println(botName + " points: " + computer.allPoints());
    }













}
