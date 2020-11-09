import java.util.Scanner;

public class RPSRules {
    private int whoWin;
    private boolean end = false;
    private int count;
    private boolean again = true;
    private final int[][] rules =  {
            {1,3,2},
            {2,1,3},
            {3,2,1}
    };

    // Setters
    public void setAgain(boolean again) {
        this.again = again;
    }

    // Getters
    public boolean getAgain() {
        return again;
    }

    public int getWinner() {
        return this.whoWin;
    }

    public boolean getEnd() {
        return this.end;
    }

    // Methods
    public void whoWin(HumanPlayer humanPlayer, Computer computer) {
        int x = rules[humanPlayer.choice() -1][computer.choice() -1];
        if (x == 3) {
            computer.addPoint();
            whoWin = 2;
        } else if (x == 1) {
            whoWin = 1;
        } else {
            humanPlayer.addPoint();
            whoWin = 3;
        }
    }

    public void gameTime(Terminal terminal) {
        if (terminal.getRounds() > count + 1) {
            end = false;
        } else {
            end = true;
        }
    }

    public void counter() {
        count = count + 1;
    }

    public void refresher(HumanPlayer humanPlayer, Computer computer) {
        end = false;
        count = 0;
        computer.setPoint(0);
        humanPlayer.setPoint(0);
    }

    public void newGameOrFinish(Terminal terminal, HumanPlayer humanPlayer, Computer computer) {
        if (terminal.getAnswer().equals("N")) {
            refresher(humanPlayer, computer);
        } else if (terminal.getAnswer().equals("X")) {
            setAgain(false);
        }
    }

}
