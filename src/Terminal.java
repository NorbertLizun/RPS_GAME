import java.util.Random;
import java.util.Scanner;

public class Terminal {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static String playerName;
    private static String botName;
    private int rounds;
    private String answer;

    public String getAnswer() {
        return this.answer;
    }


    public int getRounds() {
        return this.rounds;
    }

    public void greeting() {
        System.out.println("WELCOME IN RPS GAME!");
        System.out.println("What is you name?");
        String name = playerName();
        System.out.println("Hello " + name + " Let's play!");

    }

    public void buttons() {
        System.out.println("______________________");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.println("N - New Game");
        System.out.println("X - Finish Game");
        System.out.println("______________________");
    }

    public void howManyGames() {
        System.out.println("How many rounds do you want to play?");
        rounds = scanner.nextInt();
    }

    public void yourEnemy() {
        System.out.println("Your opponent " + pcName());
        System.out.println("Prepare to Battle!");
    }

    public void chooseGun() {
        System.out.println("Choose your weapon:");
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

    public void winner(int whoWin) {
        if (whoWin == 1) {
            System.out.println("draw");
        } else if (whoWin == 3) {
            System.out.println(playerName + " win");
        } else if (whoWin == 2)  {
            System.out.println(botName + " win");
        }
        System.out.println();
    }

    public static String playerName() {
        playerName = scanner.next();
        return playerName;
    }

    public static String pcName() {
        int botNumberName = random.nextInt(10);
        botName = "C-" + botNumberName + "PO";
        return botName;
    }

    public void score(HumanPlayer humanPlayer, Computer computer) {
        System.out.println();
        System.out.println(playerName + " points: " + humanPlayer.allPoints());
        System.out.println(botName + " points: " + computer.allPoints());

        if (humanPlayer.allPoints() > computer.allPoints()) {
            System.out.println(playerName + " IS A WINNER!");
        } else if (humanPlayer.allPoints() == computer.allPoints()) {
            System.out.println("DRAW");
        } else {
            System.out.println(botName + " IS A WINNER!");
        }
    }



    public void nextGameOrFinish() {
        System.out.println();
        System.out.println("Play again?");
        System.out.println("N - new game");
        System.out.println("X - finish game");
        answer = scanner.next();
        if (!answer.equals("N") && !answer.equals("X")) {
            nextGameOrFinish();
        }

    }


















}
